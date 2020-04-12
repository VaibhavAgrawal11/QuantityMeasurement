package com.bridgelabz.servicetest;

import com.bridgelabz.service.QuantityMeasurement;
import com.bridgelabz.utility.Length;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestQuantityMeasurement {
    QuantityMeasurement quantityMeasurement = null;

    @Before
    public void setUp() throws Exception {
        quantityMeasurement = new QuantityMeasurement();
    }

    @Test
    public void givenLengthsInFeet_ShouldReturnTrue() {
        Length length1 = new Length(1, Length.Unit.FEET);
        Length length2 = new Length(12, Length.Unit.INCH);
        boolean comparision = quantityMeasurement.compareLengths(length1, length2);
        Assert.assertEquals(true, comparision);
    }

    @Test
    public void givenZeroFeetAndZeroFeet_ShouldReturnEqual() {
        Length length1 = new Length(0, Length.Unit.FEET);
        Length length2 = new Length(0, Length.Unit.FEET);
        boolean comparision = quantityMeasurement.compareLengths(length1, length2);
        Assert.assertTrue(comparision);
    }
}
