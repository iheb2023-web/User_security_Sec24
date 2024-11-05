package com.iheb.users.service.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class EmailAlreadyExistsException extends RuntimeException {
    private String s;
    public EmailAlreadyExistsException(String s) {
        super(s);
    }
}
