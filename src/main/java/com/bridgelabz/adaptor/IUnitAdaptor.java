package com.bridgelabz.adaptor;

import com.bridgelabz.utility.Quantity;
import com.bridgelabz.utility.UnitType;

public interface IUnitAdaptor {
    public double getBaseValue();

    public UnitType getUnitType();

    public default double compare(double quantity, Quantity.Unit unit) {
        if (unit == Quantity.Unit.FAHRENHEIT)
            return ((this.getBaseValue()*quantity - 32) * 5 / 9);
        return this.getBaseValue() * quantity;
    }
}
