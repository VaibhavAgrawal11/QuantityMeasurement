package com.bridgelabz.adaptor.lengths;

import com.bridgelabz.adaptor.IUnitAdaptor;
import com.bridgelabz.utility.UnitType;

public class FeetImpl implements IUnitAdaptor {
    @Override
    public double getBaseValue() {
        return 12;
    }

    @Override
    public UnitType getUnitType() {
        return UnitType.LENGTH;
    }
}
