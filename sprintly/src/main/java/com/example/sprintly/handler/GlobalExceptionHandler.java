package com.example.sprintly.handler;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

//    @ExceptionHandler(UserNotInAdminRoleException.class)
//    @ResponseStatus(HttpStatus.FORBIDDEN)
//    public String handleUserNotInRoleException(UserNotInAdminRoleException ex) {
//        return "There is an error: " + ex.getMessage();
//    }
}
