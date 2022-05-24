package com.dev.sampleauthserver.exception;

public class InvalidAuthDetailsException extends RuntimeException{

    public InvalidAuthDetailsException() {
    }

    public InvalidAuthDetailsException(String message) {
        super(message);
    }

    public InvalidAuthDetailsException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidAuthDetailsException(Throwable cause) {
        super(cause);
    }

    public InvalidAuthDetailsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
