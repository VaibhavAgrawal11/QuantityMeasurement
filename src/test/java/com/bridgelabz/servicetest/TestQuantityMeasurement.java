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

    @Test
    public void givenNullFeet_ShouldReturnFalse() {
        Length length1 = new Length(0, Length.Unit.FEET);
        boolean comparision = quantityMeasurement.compareLengths(length1, null);
        Assert.assertEquals(false, comparision);
    }

    @Test
    public void givenSameReferenceToLength_ShouldReturnTrue() {
        Length length =new Length(10, Length.Unit.FEET);
        boolean compare = quantityMeasurement.compareLengths(length,length);
        Assert.assertEquals(true,compare);
    }

    @Test
    public void givenLengthOfSameType_ShouldReturnTrue() {
        Length length1 = new Length(1, Length.Unit.FEET);
        Length length2 = new Length(12, Length.Unit.FEET);
        Assert.assertEquals(length1.unit, length2.unit);
    }

    @Test
    public void givenLengthOfDifferentType_ShouldReturnFalse() {
        Length length1 = new Length(1, Length.Unit.FEET);
        Length length2 = new Length(12, Length.Unit.INCH);
        Assert.assertNotEquals(length1.unit, length2.unit);
    }

    @Test
    public void givenEqualValuesOfLength_ShouldReturnTrue() {
        Length length1 = new Length(12, Length.Unit.FEET);
        Length length2 = new Length(12, Length.Unit.FEET);
        Assert.assertEquals(length2.quantity, length1.quantity,0);
    }

    @Test
    public void givenZeroInchAndZeroInch_ShouldReturnEqual() {
        Length length1 = new Length(0, Length.Unit.INCH);
        Length length2 = new Length(0, Length.Unit.INCH);
        boolean comparision = quantityMeasurement.compareLengths(length1, length2);
        Assert.assertTrue(comparision);
    }

    @Test
    public void givenNullInch_ShouldReturnFalse() {
        Length length1 = new Length(0, Length.Unit.INCH);
        boolean comparision = quantityMeasurement.compareLengths(length1, null);
        Assert.assertEquals(false, comparision);
    }

    @Test
    public void givenSameReferenceToInchLength_ShouldReturnTrue() {
        Length length =new Length(10, Length.Unit.INCH);
        boolean compare = quantityMeasurement.compareLengths(length,length);
        Assert.assertEquals(true,compare);
    }

    @Test
    public void givenInchOfSameType_ShouldReturnTrue() {
        Length length1 = new Length(1, Length.Unit.INCH);
        Length length2 = new Length(12, Length.Unit.INCH);
        Assert.assertEquals(length1.unit, length2.unit);
    }

    @Test
    public void givenLengthOfDifferentType_ShouldReturnFalse_2() {
        Length length1 = new Length(1, Length.Unit.FEET);
        Length length2 = new Length(12, Length.Unit.INCH);
        Assert.assertNotEquals(length1.unit, length2.unit);
    }

    @Test
    public void givenEqualValuesOfInch_ShouldReturnTrue() {
        Length length1 = new Length(12, Length.Unit.INCH);
        Length length2 = new Length(12, Length.Unit.INCH);
        Assert.assertEquals(length2.quantity, length1.quantity,0);
    }

    @Test
    public void givenZeroInchAndZeroFeet_ShouldReturnTrue() {
        Length length1 = new Length(0, Length.Unit.FEET);
        Length length2 = new Length(0, Length.Unit.INCH);
        boolean compare = quantityMeasurement.compareLengths(length1,length2);
        Assert.assertTrue(compare);
    }
}
