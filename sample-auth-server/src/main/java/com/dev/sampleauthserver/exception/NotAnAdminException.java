package com.dev.sampleauthserver.exception;

public class NotAnAdminException extends RuntimeException{
    public NotAnAdminException(String message){
        super(message);
    }
}
