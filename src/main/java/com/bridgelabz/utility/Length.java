package com.bridgelabz.utility;

public class Length {
    public enum Unit {
        FEET(12), INCH(1),YARD(36);
        double baseValue;

        Unit(double baseValue) {
            this.baseValue = baseValue;
        }

        public double compare(double quantity) {
            return this.baseValue * quantity;
        }
    }

    public double quantity;
    public Unit unit;

    public Length(double quantity, Unit unit) {
        this.quantity = unit.compare(quantity);
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.quantity, quantity) == 0;
    }
}
