package com.bridgelabz.service;

import com.bridgelabz.utility.Length;

public class QuantityMeasurement {
    public boolean compareLengths(Length length1, Length length2) {
        return length1.equals(length2);
    }

    public Length addLengths(Length length1, Length length2) {
        double totalLength = length1.quantity+length2.quantity;
        Length lengthInInch = new Length(totalLength, Length.Unit.INCH);
        return lengthInInch;
    }
}
