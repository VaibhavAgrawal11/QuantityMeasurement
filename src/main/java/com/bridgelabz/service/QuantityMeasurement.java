package com.bridgelabz.service;

import com.bridgelabz.exception.QuantityMeasurementException;
import com.bridgelabz.utility.Quantity;

public class QuantityMeasurement {
    public boolean compareLengths(Quantity length1, Quantity length2) throws QuantityMeasurementException {
        try {
            if (length1.unitType != length2.unitType)
                throw new QuantityMeasurementException("Incomparable type", QuantityMeasurementException.ExceptionType.UnitType_Mismatch);

            return length1.equals(length2);
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException("Null value entered", QuantityMeasurementException.ExceptionType.NULL_VALUE);
        }
    }

    public Quantity addLengths(Quantity length1, Quantity length2) {
        double totalLength = length1.quantity + length2.quantity;
        Quantity lengthInInch = new Quantity(totalLength, Quantity.Unit.INCH);
        return lengthInInch;
    }
}
