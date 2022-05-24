package com.dev.sampleauthserver.exception;

public class AlreadyExistException extends RuntimeException{

    public String debugMessage;

    public AlreadyExistException(String message,String debugMessage){
        super(message);
        this.debugMessage = debugMessage;
    }
}
