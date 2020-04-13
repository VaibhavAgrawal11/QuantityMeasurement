package com.bridgelabz.adaptor.volume;

import com.bridgelabz.adaptor.IUnitAdaptor;
import com.bridgelabz.utility.UnitType;

public class LitreImpl implements IUnitAdaptor {
    @Override
    public double getBaseValue() {
        return 1;
    }

    @Override
    public UnitType getUnitType() {
        return UnitType.VOLUME;
    }
}
