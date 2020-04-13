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

    @Test
    public void givenLengthsInFeetAndYard_WhenEqual_ShouldReturnTrue() {
        Length length1 = new Length(3, Length.Unit.FEET);
        Length length2 = new Length(1, Length.Unit.YARD);
        boolean comparision = quantityMeasurement.compareLengths(length1, length2);
        Assert.assertEquals(true, comparision);
    }

    @Test
    public void givenLengthsInFeetAndYard_WhenNotEqual_ShouldReturnFalse() {
        Length length1 = new Length(1, Length.Unit.FEET);
        Length length2 = new Length(1, Length.Unit.YARD);
        boolean comparision = quantityMeasurement.compareLengths(length1, length2);
        Assert.assertFalse(comparision);
    }

    @Test
    public void givenLengthsInInchAndYard_WhenNotEqual_ShouldReturnFalse() {
        Length length1 = new Length(1, Length.Unit.INCH);
        Length length2 = new Length(1, Length.Unit.YARD);
        boolean comparision = quantityMeasurement.compareLengths(length1, length2);
        Assert.assertFalse(comparision);
    }


    @Test
    public void givenLengthsInInchAndYard_WhenEqual_ShouldReturnTrue() {
        Length length1 = new Length(36, Length.Unit.INCH);
        Length length2 = new Length(1, Length.Unit.YARD);
        boolean comparision = quantityMeasurement.compareLengths(length1, length2);
        Assert.assertTrue(comparision);
    }

    @Test
    public void givenLengthsInInchAndYard_WhenEqual_ShouldReturnTrue_2() {
        Length length1 = new Length(36, Length.Unit.INCH);
        Length length2 = new Length(1, Length.Unit.YARD);
        boolean comparision = quantityMeasurement.compareLengths(length2, length1);
        Assert.assertTrue(comparision);
    }

    @Test
    public void givenLengthsInFeetAndYard_WhenEqual_ShouldReturnTrue_2() {
        Length length1 = new Length(3, Length.Unit.FEET);
        Length length2 = new Length(1, Length.Unit.YARD);
        boolean comparision = quantityMeasurement.compareLengths(length2, length1);
        Assert.assertTrue(comparision);
    }

    @Test
    public void givenCentimetreAndInch_WhenEqual_ShouldReturnTrue() {
        Length length1 = new Length(2, Length.Unit.INCH);
        Length length2 = new Length(5, Length.Unit.CENTIMETRE);
        boolean comparision = quantityMeasurement.compareLengths(length2, length1);
        Assert.assertTrue(comparision);
    }

    @Test
    public void givenCentimetreAndInch_WhenNotEqual_ShouldReturnFalse() {
        Length length1 = new Length(0, Length.Unit.INCH);
        Length length2 = new Length(5, Length.Unit.CENTIMETRE);
        boolean comparision = quantityMeasurement.compareLengths(length2, length1);
        Assert.assertFalse(comparision);
    }

    @Test
    public void givenCentimetreAndInch_WhenEqual_ShouldReturnTrue_2() {
        Length length1 = new Length(0, Length.Unit.INCH);
        Length length2 = new Length(0, Length.Unit.CENTIMETRE);
        boolean comparision = quantityMeasurement.compareLengths(length2, length1);
        Assert.assertTrue(comparision);
    }

    @Test
    public void givenCentimetreAndFeet_WhenNotEqual_ShouldReturnFalse() {
        Length length1 = new Length(0, Length.Unit.FEET);
        Length length2 = new Length(5, Length.Unit.CENTIMETRE);
        boolean comparision = quantityMeasurement.compareLengths(length2, length1);
        Assert.assertFalse(comparision);
    }

    @Test
    public void givenCentimetreAndFeet_WhenEqual_ShouldReturnTrue() {
        Length length1 = new Length(1, Length.Unit.FEET);
        Length length2 = new Length(30, Length.Unit.CENTIMETRE);
        boolean comparision = quantityMeasurement.compareLengths(length2, length1);
        Assert.assertTrue(comparision);
    }

    @Test
    public void givenCentimetreAndYard_WhenNotEqual_ShouldReturnFalse() {
        Length length1 = new Length(0, Length.Unit.YARD);
        Length length2 = new Length(5, Length.Unit.CENTIMETRE);
        boolean comparision = quantityMeasurement.compareLengths(length2, length1);
        Assert.assertFalse(comparision);
    }

    @Test
    public void givenCentimetreAndYard_WhenEqual_ShouldReturnTrue() {
        Length length1 = new Length(1, Length.Unit.YARD);
        Length length2 = new Length(90, Length.Unit.CENTIMETRE);
        boolean comparision = quantityMeasurement.compareLengths(length2, length1);
        Assert.assertTrue(comparision);
    }

    @Test
    public void givenInchAndInch_WhenAdded_ShouldReturnValueInInch() {
        Length length1 = new Length(1, Length.Unit.INCH);
        Length length2 = new Length(1, Length.Unit.INCH);
        Length totalLength = quantityMeasurement.addLengths(length1,length2);
        Assert.assertEquals(new Length(2, Length.Unit.INCH),totalLength);
    }
}
