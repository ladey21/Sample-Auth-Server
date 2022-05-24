package com.dev.sampleauthserver.exception;

public class InvalidResourceException extends RuntimeException{

    public String debugMessage;

    public InvalidResourceException(String message, String debugMessage){
        super(message);
        this.debugMessage = debugMessage;
    }

}
