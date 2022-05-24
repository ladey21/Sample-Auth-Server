package com.dev.sampleauthserver.exception;

public class NotAMemberException extends RuntimeException{
    public NotAMemberException(String message){
        super(message);
    }
}
