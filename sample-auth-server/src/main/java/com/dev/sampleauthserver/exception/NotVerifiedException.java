package com.dev.sampleauthserver.exception;

public class NotVerifiedException extends RuntimeException{
    public String debugMessage;

    public NotVerifiedException(String message,String debugMessage){
        super(message);
        this.debugMessage = debugMessage;
    }
}
