package com.bridgelabz.adaptor.lengths;

import com.bridgelabz.adaptor.IUnitAdaptor;
import com.bridgelabz.utility.UnitType;

public class InchImpl implements IUnitAdaptor {
    @Override
    public double getBaseValue() {
        return 1;
    }

    @Override
    public UnitType getUnitType() {
        return UnitType.LENGTH;
    }
}
