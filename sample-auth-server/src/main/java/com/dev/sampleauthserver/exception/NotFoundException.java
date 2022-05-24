package com.dev.sampleauthserver.exception;

public class NotFoundException extends RuntimeException{
    public String debugMessage;

    public NotFoundException(String message, String debugMessage){
        super(message);
        this.debugMessage = debugMessage;
    }
}
