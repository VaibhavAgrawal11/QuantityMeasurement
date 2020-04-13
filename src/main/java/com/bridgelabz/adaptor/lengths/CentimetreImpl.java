package com.bridgelabz.adaptor.lengths;

import com.bridgelabz.adaptor.IUnitAdaptor;
import com.bridgelabz.utility.UnitType;

public class CentimetreImpl implements IUnitAdaptor {
    @Override
    public double getBaseValue() {
        return 0.4;
    }

    @Override
    public UnitType getUnitType() {
        return UnitType.LENGTH;
    }
}
