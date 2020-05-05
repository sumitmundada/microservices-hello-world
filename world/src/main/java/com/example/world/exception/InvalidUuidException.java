package com.example.world.exception;

public class InvalidUuidException extends Exception {

    public InvalidUuidException() {
        super("Invalid UUID!");
    }

    public InvalidUuidException(String message) {
        super(message);
    }

    public InvalidUuidException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidUuidException(Throwable cause) {
        super(cause);
    }

    public InvalidUuidException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
