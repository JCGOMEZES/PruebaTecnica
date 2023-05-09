package com.pichincha.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class PichinchaServiceException extends RuntimeException{

    public static final long serialVersionUID = 1L;

    public PichinchaServiceException() { super(); }
    public PichinchaServiceException(String message) { super(message); }
    public PichinchaServiceException(Throwable throwable) { super(throwable); }
    public PichinchaServiceException(String message, Throwable throwable) { super(message, throwable); }
}
