package com.bridgelabz.utility;

import com.bridgelabz.adaptor.IUnitAdaptor;
import com.bridgelabz.adaptor.UnitAdaptorFactory;

public class Quantity {
    public enum Unit {
        FEET, INCH, YARD, CENTIMETRE, GALLON, LITRE, MILLILITRE, TONNE, KILOGRAM, GRAM;
    }

    public double quantity;
    public Unit unit;
    public UnitType unitType;

    public Quantity(double quantity, Unit unit) {
        IUnitAdaptor unitAdaptor = UnitAdaptorFactory.getObject(unit);
        this.quantity = unitAdaptor.compare(quantity);
        this.unit = unit;
        this.unitType = unitAdaptor.getUnitType();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity length = (Quantity) o;
        return Double.compare(length.quantity, quantity) == 0;
    }
}
