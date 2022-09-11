package com.game.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import sun.jvm.hotspot.c1.Runtime1;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException{
    //400 Error
    public BadRequestException() {
    }
    public BadRequestException(String message) {
        super(message);
    }
}
