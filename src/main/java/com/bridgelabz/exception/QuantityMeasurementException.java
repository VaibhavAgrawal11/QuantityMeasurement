package com.bridgelabz.exception;

public class QuantityMeasurementException extends Throwable {
    public enum ExceptionType {
        UnitType_Mismatch,NULL_VALUE
    }
    public ExceptionType type;

    public QuantityMeasurementException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
