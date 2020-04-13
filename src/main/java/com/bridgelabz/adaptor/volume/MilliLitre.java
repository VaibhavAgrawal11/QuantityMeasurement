package com.bridgelabz.adaptor.volume;

import com.bridgelabz.adaptor.IUnitAdaptor;
import com.bridgelabz.utility.UnitType;

public class MilliLitre implements IUnitAdaptor {
    @Override
    public double getBaseValue() {
        return 0.001;
    }

    @Override
    public UnitType getUnitType() {
        return UnitType.VOLUME;
    }
}
