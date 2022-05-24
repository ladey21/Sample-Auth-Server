package com.dev.sampleauthserver.exception;

public class NotLoggedInException extends RuntimeException{
    public String debugMessage;

    public NotLoggedInException(String message,String debugMessage){
        super(message);
        this.debugMessage = debugMessage;
    }
}
