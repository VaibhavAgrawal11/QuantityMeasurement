package com.bridgelabz.service;

import com.bridgelabz.exception.QuantityMeasurementException;
import com.bridgelabz.utility.Quantity;

public class QuantityMeasurement {

    //METHOD TO EQUATE TWO QUANTITIES IF THEY ARE COMPARABLE
    public boolean compareUnits(Quantity quantity1, Quantity quantity2) throws QuantityMeasurementException {
        try {
            if (quantity1.unitType != quantity2.unitType)
                throw new QuantityMeasurementException("Incomparable type",
                        QuantityMeasurementException.ExceptionType.UNIT_TYPE_MISMATCH);
            return quantity1.equals(quantity2);
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException("Null value entered",
                    QuantityMeasurementException.ExceptionType.NULL_VALUE);
        }
    }

    //METHOD TO ADD TWO QUANTITIES IF THEY ARE ADDABLE
    public double addLengths(Quantity quantity1, Quantity quantity2) throws QuantityMeasurementException {
        try {
            if (quantity1.unitType != quantity2.unitType)
                throw new QuantityMeasurementException("Incomparable type",
                        QuantityMeasurementException.ExceptionType.UNIT_TYPE_MISMATCH);
            return quantity1.quantity + quantity2.quantity;
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException("Null value entered",
                    QuantityMeasurementException.ExceptionType.NULL_VALUE);
        }
    }
}
