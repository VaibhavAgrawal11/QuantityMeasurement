package com.bridgelabz.servicetest;

import com.bridgelabz.exception.QuantityMeasurementException;
import com.bridgelabz.service.QuantityMeasurement;
import com.bridgelabz.utility.Quantity;
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
    public void givenLengthsInFeet_ShouldReturnTrue() throws QuantityMeasurementException {
        Quantity length1 = new Quantity(1, Quantity.Unit.FEET);
        Quantity length2 = new Quantity(12, Quantity.Unit.INCH);
        boolean comparision = quantityMeasurement.compareUnits(length1, length2);
        Assert.assertEquals(true, comparision);
    }

    @Test
    public void givenZeroFeetAndZeroFeet_ShouldReturnEqual() throws QuantityMeasurementException {
        Quantity length1 = new Quantity(0, Quantity.Unit.FEET);
        Quantity length2 = new Quantity(0, Quantity.Unit.FEET);
        boolean comparision = quantityMeasurement.compareUnits(length1, length2);
        Assert.assertTrue(comparision);
    }

    @Test
    public void givenNullFeet_ShouldReturnFalse() {
        Quantity length1 = new Quantity(0, Quantity.Unit.FEET);
        try {
            quantityMeasurement.compareUnits(length1, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenSameReferenceToLength_ShouldReturnTrue() throws QuantityMeasurementException {
        Quantity length = new Quantity(10, Quantity.Unit.FEET);
        boolean compare = quantityMeasurement.compareUnits(length, length);
        Assert.assertEquals(true, compare);
    }

    @Test
    public void givenLengthOfSameType_ShouldReturnTrue() {
        Quantity length1 = new Quantity(1, Quantity.Unit.FEET);
        Quantity length2 = new Quantity(12, Quantity.Unit.FEET);
        Assert.assertEquals(length1.unit, length2.unit);
    }

    @Test
    public void givenLengthOfDifferentType_ShouldReturnFalse() {
        Quantity length1 = new Quantity(1, Quantity.Unit.FEET);
        Quantity length2 = new Quantity(12, Quantity.Unit.INCH);
        Assert.assertNotEquals(length1.unit, length2.unit);
    }

    @Test
    public void givenEqualValuesOfLength_ShouldReturnTrue() {
        Quantity length1 = new Quantity(12, Quantity.Unit.FEET);
        Quantity length2 = new Quantity(12, Quantity.Unit.FEET);
        Assert.assertEquals(length2.quantity, length1.quantity, 0);
    }

    @Test
    public void givenZeroInchAndZeroInch_ShouldReturnEqual() throws QuantityMeasurementException {
        Quantity length1 = new Quantity(0, Quantity.Unit.INCH);
        Quantity length2 = new Quantity(0, Quantity.Unit.INCH);
        boolean comparision = quantityMeasurement.compareUnits(length1, length2);
        Assert.assertTrue(comparision);
    }

    @Test
    public void givenNullInch_ShouldReturnFalse() {
        Quantity length1 = new Quantity(0, Quantity.Unit.INCH);
        boolean comparision = false;
        try {
            comparision = quantityMeasurement.compareUnits(length1, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenSameReferenceToInchLength_ShouldReturnTrue() throws QuantityMeasurementException {
        Quantity length = new Quantity(10, Quantity.Unit.INCH);
        boolean compare = quantityMeasurement.compareUnits(length, length);
        Assert.assertEquals(true, compare);
    }

    @Test
    public void givenInchOfSameType_ShouldReturnTrue() {
        Quantity length1 = new Quantity(1, Quantity.Unit.INCH);
        Quantity length2 = new Quantity(12, Quantity.Unit.INCH);
        Assert.assertEquals(length1.unit, length2.unit);
    }

    @Test
    public void givenLengthOfDifferentType_ShouldReturnFalse_2() {
        Quantity length1 = new Quantity(1, Quantity.Unit.FEET);
        Quantity length2 = new Quantity(12, Quantity.Unit.INCH);
        Assert.assertNotEquals(length1.unit, length2.unit);
    }

    @Test
    public void givenEqualValuesOfInch_ShouldReturnTrue() {
        Quantity length1 = new Quantity(12, Quantity.Unit.INCH);
        Quantity length2 = new Quantity(12, Quantity.Unit.INCH);
        Assert.assertEquals(length2.quantity, length1.quantity, 0);
    }

    @Test
    public void givenZeroInchAndZeroFeet_ShouldReturnTrue() throws QuantityMeasurementException {
        Quantity length1 = new Quantity(0, Quantity.Unit.FEET);
        Quantity length2 = new Quantity(0, Quantity.Unit.INCH);
        boolean compare = quantityMeasurement.compareUnits(length1, length2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenLengthsInFeetAndYard_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        Quantity length1 = new Quantity(3, Quantity.Unit.FEET);
        Quantity length2 = new Quantity(1, Quantity.Unit.YARD);
        boolean comparision = quantityMeasurement.compareUnits(length1, length2);
        Assert.assertEquals(true, comparision);
    }

    @Test
    public void givenLengthsInFeetAndYard_WhenNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        Quantity length1 = new Quantity(1, Quantity.Unit.FEET);
        Quantity length2 = new Quantity(1, Quantity.Unit.YARD);
        boolean comparision = quantityMeasurement.compareUnits(length1, length2);
        Assert.assertFalse(comparision);
    }

    @Test
    public void givenLengthsInInchAndYard_WhenNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        Quantity length1 = new Quantity(1, Quantity.Unit.INCH);
        Quantity length2 = new Quantity(1, Quantity.Unit.YARD);
        boolean comparision = quantityMeasurement.compareUnits(length1, length2);
        Assert.assertFalse(comparision);
    }

    @Test
    public void givenLengthsInInchAndYard_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        Quantity length1 = new Quantity(36, Quantity.Unit.INCH);
        Quantity length2 = new Quantity(1, Quantity.Unit.YARD);
        boolean comparision = quantityMeasurement.compareUnits(length1, length2);
        Assert.assertTrue(comparision);
    }

    @Test
    public void givenLengthsInInchAndYard_WhenEqual_ShouldReturnTrue_2() throws QuantityMeasurementException {
        Quantity length1 = new Quantity(36, Quantity.Unit.INCH);
        Quantity length2 = new Quantity(1, Quantity.Unit.YARD);
        boolean comparision = quantityMeasurement.compareUnits(length2, length1);
        Assert.assertTrue(comparision);
    }

    @Test
    public void givenLengthsInFeetAndYard_WhenEqual_ShouldReturnTrue_2() throws QuantityMeasurementException {
        Quantity length1 = new Quantity(3, Quantity.Unit.FEET);
        Quantity length2 = new Quantity(1, Quantity.Unit.YARD);
        boolean comparision = quantityMeasurement.compareUnits(length2, length1);
        Assert.assertTrue(comparision);
    }

    @Test
    public void givenCentimetreAndInch_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        Quantity length1 = new Quantity(2, Quantity.Unit.INCH);
        Quantity length2 = new Quantity(5, Quantity.Unit.CENTIMETRE);
        boolean comparision = quantityMeasurement.compareUnits(length2, length1);
        Assert.assertTrue(comparision);
    }

    @Test
    public void givenCentimetreAndInch_WhenNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        Quantity length1 = new Quantity(0, Quantity.Unit.INCH);
        Quantity length2 = new Quantity(5, Quantity.Unit.CENTIMETRE);
        boolean comparision = quantityMeasurement.compareUnits(length2, length1);
        Assert.assertFalse(comparision);
    }

    @Test
    public void givenCentimetreAndInch_WhenEqual_ShouldReturnTrue_2() throws QuantityMeasurementException {
        Quantity length1 = new Quantity(0, Quantity.Unit.INCH);
        Quantity length2 = new Quantity(0, Quantity.Unit.CENTIMETRE);
        boolean comparision = quantityMeasurement.compareUnits(length2, length1);
        Assert.assertTrue(comparision);
    }

    @Test
    public void givenCentimetreAndFeet_WhenNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        Quantity length1 = new Quantity(0, Quantity.Unit.FEET);
        Quantity length2 = new Quantity(5, Quantity.Unit.CENTIMETRE);
        boolean comparision = quantityMeasurement.compareUnits(length2, length1);
        Assert.assertFalse(comparision);
    }

    @Test
    public void givenCentimetreAndFeet_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        Quantity length1 = new Quantity(1, Quantity.Unit.FEET);
        Quantity length2 = new Quantity(30, Quantity.Unit.CENTIMETRE);
        boolean comparision = quantityMeasurement.compareUnits(length2, length1);
        Assert.assertTrue(comparision);
    }

    @Test
    public void givenCentimetreAndYard_WhenNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        Quantity length1 = new Quantity(0, Quantity.Unit.YARD);
        Quantity length2 = new Quantity(5, Quantity.Unit.CENTIMETRE);
        boolean comparision = quantityMeasurement.compareUnits(length2, length1);
        Assert.assertFalse(comparision);
    }

    @Test
    public void givenCentimetreAndYard_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        Quantity length1 = new Quantity(1, Quantity.Unit.YARD);
        Quantity length2 = new Quantity(90, Quantity.Unit.CENTIMETRE);
        boolean comparision = quantityMeasurement.compareUnits(length2, length1);
        Assert.assertTrue(comparision);
    }

    @Test
    public void givenInchAndInch_WhenAdded_ShouldReturnValueInInch() throws QuantityMeasurementException {
        Quantity length1 = new Quantity(1, Quantity.Unit.INCH);
        Quantity length2 = new Quantity(1, Quantity.Unit.INCH);
        double totalLength = quantityMeasurement.addLengths(length1, length2);
        Assert.assertEquals(new Quantity(2, Quantity.Unit.INCH),
                new Quantity(totalLength, Quantity.Unit.INCH));
    }

    @Test
    public void givenFeetAndInch_WhenAdded_ShouldReturnValueInInch() throws QuantityMeasurementException {
        Quantity length1 = new Quantity(1, Quantity.Unit.FEET);
        Quantity length2 = new Quantity(2, Quantity.Unit.INCH);
        double totalLength = quantityMeasurement.addLengths(length1, length2);
        Assert.assertEquals(new Quantity(14, Quantity.Unit.INCH),
                new Quantity(totalLength, Quantity.Unit.INCH));
    }

    @Test
    public void givenFeetAndFeet_WhenAdded_ShouldReturnValueInInch() throws QuantityMeasurementException {
        Quantity length1 = new Quantity(1, Quantity.Unit.FEET);
        Quantity length2 = new Quantity(1, Quantity.Unit.FEET);
        double totalLength = quantityMeasurement.addLengths(length1, length2);
        Assert.assertEquals(new Quantity(24, Quantity.Unit.INCH),
                new Quantity(totalLength, Quantity.Unit.INCH));
    }

    @Test
    public void givenCentimeterAndInch_WhenAdded_ShouldReturnValueInInch() throws QuantityMeasurementException {
        Quantity length1 = new Quantity(2.5, Quantity.Unit.CENTIMETRE);
        Quantity length2 = new Quantity(2, Quantity.Unit.INCH);
        double totalLength = quantityMeasurement.addLengths(length1, length2);
        Assert.assertEquals(3, totalLength, 0);
    }

    @Test
    public void givenVolume_InGallonAndLitre_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        Quantity volume1 = new Quantity(1, Quantity.Unit.GALLON);
        Quantity volume2 = new Quantity(3.78, Quantity.Unit.LITRE);
        boolean compare = quantityMeasurement.compareUnits(volume1, volume2);
        Assert.assertEquals(true, compare);
    }

    @Test
    public void givenVolume_InLitreAndMillilitre_WhenEqual_ShoulReturnTrue() throws QuantityMeasurementException {
        Quantity volume1 = new Quantity(1, Quantity.Unit.LITRE);
        Quantity volume2 = new Quantity(1000, Quantity.Unit.MILLILITRE);
        boolean compare = quantityMeasurement.compareUnits(volume1, volume2);
        Assert.assertEquals(true, compare);
    }

    @Test
    public void givenVolume_InGallonAndGallon_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        Quantity volume1 = new Quantity(1, Quantity.Unit.GALLON);
        Quantity volume2 = new Quantity(1, Quantity.Unit.GALLON);
        boolean compare = quantityMeasurement.compareUnits(volume1, volume2);
        Assert.assertEquals(true, compare);
    }

    @Test
    public void givenVolume_InGallonAndLitre_WhenNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        Quantity volume1 = new Quantity(1, Quantity.Unit.GALLON);
        Quantity volume2 = new Quantity(3.7, Quantity.Unit.LITRE);
        boolean compare = quantityMeasurement.compareUnits(volume1, volume2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenVolume_InLitreAndLitre_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        Quantity volume1 = new Quantity(0, Quantity.Unit.LITRE);
        Quantity volume2 = new Quantity(0, Quantity.Unit.LITRE);
        boolean compare = quantityMeasurement.compareUnits(volume1, volume2);
        Assert.assertEquals(true, compare);
    }

    @Test
    public void givenVolume_InMilliLitreAndLitre_WhenNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        Quantity volume1 = new Quantity(10, Quantity.Unit.MILLILITRE);
        Quantity volume2 = new Quantity(3.7, Quantity.Unit.LITRE);
        boolean compare = quantityMeasurement.compareUnits(volume1, volume2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenVolume_InMLAndML_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        Quantity volume1 = new Quantity(0, Quantity.Unit.MILLILITRE);
        Quantity volume2 = new Quantity(0, Quantity.Unit.MILLILITRE);
        boolean compare = quantityMeasurement.compareUnits(volume1, volume2);
        Assert.assertEquals(true, compare);
    }

    @Test
    public void givenVolume_InMilliLitreAndGallon_WhenNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        Quantity volume1 = new Quantity(10, Quantity.Unit.MILLILITRE);
        Quantity volume2 = new Quantity(3.7, Quantity.Unit.GALLON);
        boolean compare = quantityMeasurement.compareUnits(volume1, volume2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenVolume_InMilliLitreAndGallon_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        Quantity volume1 = new Quantity(3780, Quantity.Unit.MILLILITRE);
        Quantity volume2 = new Quantity(1, Quantity.Unit.GALLON);
        boolean compare = quantityMeasurement.compareUnits(volume1, volume2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenVolumeAndLength_WhenCompared_ShouldThrowException() {
        Quantity length = new Quantity(1, Quantity.Unit.INCH);
        Quantity volume = new Quantity(1, Quantity.Unit.LITRE);
        try {
            quantityMeasurement.compareUnits(length, volume);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.UNIT_TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void givenTwoVolume_WhenAdded_ShouldReturnVolumeInLitre() throws QuantityMeasurementException {
        Quantity volume1 = new Quantity(1, Quantity.Unit.GALLON);
        Quantity volume2 = new Quantity(3.78, Quantity.Unit.LITRE);
        double totalVolume = quantityMeasurement.addLengths(volume1, volume2);
        Assert.assertEquals(new Quantity(7.56, Quantity.Unit.LITRE),
                new Quantity(totalVolume, Quantity.Unit.LITRE));
    }

    @Test
    public void givenTwoVolume_WhenAdded_ShouldReturnVolumeInLitre_2() throws QuantityMeasurementException {
        Quantity volume1 = new Quantity(1, Quantity.Unit.LITRE);
        Quantity volume2 = new Quantity(1, Quantity.Unit.LITRE);
        double totalVolume = quantityMeasurement.addLengths(volume1, volume2);
        Assert.assertEquals(new Quantity(2, Quantity.Unit.LITRE),
                new Quantity(totalVolume, Quantity.Unit.LITRE));
    }

    @Test
    public void givenTwoVolume_WhenAdded_ShouldReturnVolumeInLitre_3() throws QuantityMeasurementException {
        Quantity volume1 = new Quantity(1, Quantity.Unit.GALLON);
        Quantity volume2 = new Quantity(3.78, Quantity.Unit.MILLILITRE);
        double totalVolume = quantityMeasurement.addLengths(volume1, volume2);
        Assert.assertEquals(new Quantity(3.7837799999999997, Quantity.Unit.LITRE),
                new Quantity(totalVolume, Quantity.Unit.LITRE));
    }

    @Test
    public void givenTwoVolume_WhenAdded_ShouldReturnVolumeInLitre_4() throws QuantityMeasurementException {
        Quantity volume1 = new Quantity(1, Quantity.Unit.LITRE);
        Quantity volume2 = new Quantity(3.78, Quantity.Unit.MILLILITRE);
        double totalVolume = quantityMeasurement.addLengths(volume1, volume2);
        Assert.assertEquals(new Quantity(1.00378, Quantity.Unit.LITRE),
                new Quantity(totalVolume, Quantity.Unit.LITRE));
    }

    @Test
    public void givenVolumeAndLength_WhenAdded_ShouldThrowException() {
        Quantity volume = new Quantity(1, Quantity.Unit.LITRE);
        Quantity length = new Quantity(1, Quantity.Unit.FEET);
        try {
            quantityMeasurement.addLengths(volume, length);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.UNIT_TYPE_MISMATCH,e.type);
        }
    }

    @Test
    public void givenVolumeAndLength_WhenAdded_ShouldThrowException_2() {
        Quantity volume = new Quantity(1, Quantity.Unit.GALLON);
        Quantity length = new Quantity(1, Quantity.Unit.CENTIMETRE);
        try {
            quantityMeasurement.addLengths(volume, length);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.UNIT_TYPE_MISMATCH,e.type);
        }
    }
    @Test
    public void givenVolumeAndNull_WhenAdded_ShouldThrowException() {
        Quantity volume = new Quantity(1, Quantity.Unit.LITRE);
        try {
            quantityMeasurement.addLengths(volume, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE,e.type);
        }
    }

    @Test
    public void givenTwoWeight_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        Quantity weight1 = new Quantity(1, Quantity.Unit.KILOGRAM);
        Quantity weight2 = new Quantity(1000, Quantity.Unit.GRAM);
        boolean compare = quantityMeasurement.compareUnits(weight1,weight2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenTwoWeight_WhenEqual_ShouldReturnTrue_2() throws QuantityMeasurementException {
        Quantity weight1 = new Quantity(1000, Quantity.Unit.KILOGRAM);
        Quantity weight2 = new Quantity(1, Quantity.Unit.TONNE);
        boolean compare = quantityMeasurement.compareUnits(weight1,weight2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenTwoWeight_WhenEqual_ShouldReturnTrue_3() throws QuantityMeasurementException {
        Quantity weight1 = new Quantity(1, Quantity.Unit.TONNE);
        Quantity weight2 = new Quantity(1000000, Quantity.Unit.GRAM);
        boolean compare = quantityMeasurement.compareUnits(weight1,weight2);
        Assert.assertTrue(compare);
    }
}
