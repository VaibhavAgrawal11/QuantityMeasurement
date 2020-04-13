package com.bridgelabz.utility;

public class Quantity {
    public enum Unit {
        FEET(12, UnitType.LENGTH),
        INCH(1, UnitType.LENGTH),
        YARD(36, UnitType.LENGTH),
        CENTIMETRE(0.4, UnitType.LENGTH),
        GALLON(3.78, UnitType.VOLUME),
        LITRE(1, UnitType.VOLUME);
        double baseValue;
        UnitType unitType;

        Unit(double baseValue, UnitType unitType) {
            this.baseValue = baseValue;
            this.unitType = unitType;
        }

        public double compare(double quantity) {
            return this.baseValue * quantity;
        }
    }

    public double quantity;
    public Unit unit;
    public UnitType unitType;

    public Quantity(double quantity, Unit unit) {
        this.quantity = unit.compare(quantity);
        this.unit = unit;
        this.unitType = unit.unitType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity length = (Quantity) o;
        return Double.compare(length.quantity, quantity) == 0;
    }
}
