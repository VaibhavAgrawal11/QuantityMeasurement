package com.bridgelabz.service;

import com.bridgelabz.utility.Quantity;

public class QuantityMeasurement {
    public boolean compareLengths(Quantity length1, Quantity length2) {
        return length1.equals(length2);
    }

    public Quantity addLengths(Quantity length1, Quantity length2) {
        double totalLength = length1.quantity+length2.quantity;
        Quantity lengthInInch = new Quantity(totalLength, Quantity.Unit.INCH);
        return lengthInInch;
    }
}
