package com.bridgelabz.adaptor;

import com.bridgelabz.utility.UnitType;

public interface IUnitAdaptor {
    public double getBaseValue();
    public UnitType getUnitType();
    public default double compare(double quantity){
        return this.getBaseValue()*quantity;
    }
}
