package com.bridgelabz.adaptor.lengths;

import com.bridgelabz.adaptor.IUnitAdaptor;
import com.bridgelabz.utility.UnitType;

public class YardImpl implements IUnitAdaptor {
    @Override
    public double getBaseValue() {
        return 36;
    }

    @Override
    public UnitType getUnitType() {
        return UnitType.LENGTH;
    }
}
