package com.dev.sampleauthserver.exception;

public class LimitExceededException  extends RuntimeException{
    public String debugMessage;

    public LimitExceededException (String message,String debugMessage){
        super(message);
        this.debugMessage = debugMessage;
    }
}
