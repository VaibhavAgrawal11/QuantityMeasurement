package com.bridgelabz.exception;

public class QuantityMeasurementException extends Throwable {
    public enum ExceptionType {
        UNIT_TYPE_MISMATCH,NULL_VALUE
    }
    public ExceptionType type;

    public QuantityMeasurementException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
