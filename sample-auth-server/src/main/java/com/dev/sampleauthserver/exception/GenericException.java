package com.dev.sampleauthserver.exception;

import lombok.Data;

@Data
public class GenericException extends RuntimeException{
    private String debugMessage;

    public GenericException(String message, String debugMessage){
        super(message);
        this.debugMessage = debugMessage;
    }

    public GenericException(String message, Throwable cause,String debugMessage){
        super(message,cause);
        this.debugMessage = debugMessage;
    }

    public GenericException(String message){
        super(message);
    }
}
