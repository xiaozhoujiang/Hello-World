package com.example.demo.controller;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HelloControllerAdvice {

    @ExceptionHandler(Exception.class)
    public String handleMbeIntegrationException(Exception e) {
        return "exception" + e.getMessage();
    }
}
