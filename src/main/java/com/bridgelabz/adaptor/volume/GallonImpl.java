package com.bridgelabz.adaptor.volume;

import com.bridgelabz.adaptor.IUnitAdaptor;
import com.bridgelabz.utility.UnitType;

public class GallonImpl implements IUnitAdaptor {
    @Override
    public double getBaseValue() {
        return 3.78;
    }

    @Override
    public UnitType getUnitType() {
        return UnitType.VOLUME;
    }
}
