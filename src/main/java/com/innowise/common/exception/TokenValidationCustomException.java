package com.innowise.common.exception;

public class TokenValidationCustomException extends RuntimeException {
    public TokenValidationCustomException(String message) {
        super(message);
    }
    
    public TokenValidationCustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
