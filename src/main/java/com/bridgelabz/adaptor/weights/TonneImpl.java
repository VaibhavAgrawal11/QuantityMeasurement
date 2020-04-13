package com.bridgelabz.adaptor.weights;

import com.bridgelabz.adaptor.IUnitAdaptor;
import com.bridgelabz.utility.UnitType;

public class TonneImpl implements IUnitAdaptor {
    @Override
    public double getBaseValue() {
        return 1000;
    }

    @Override
    public UnitType getUnitType() {
        return UnitType.WEIGHT;
    }
}
