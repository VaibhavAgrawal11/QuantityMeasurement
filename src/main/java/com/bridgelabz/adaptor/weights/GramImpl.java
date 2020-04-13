package com.bridgelabz.adaptor.weights;

import com.bridgelabz.adaptor.IUnitAdaptor;
import com.bridgelabz.utility.UnitType;

public class GramImpl implements IUnitAdaptor {
    @Override
    public double getBaseValue() {
        return 0.001;
    }

    @Override
    public UnitType getUnitType() {
        return UnitType.WEIGHT;
    }
}
