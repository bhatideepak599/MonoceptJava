package com.techlabs.custom_exception;

public class InvalidProductException extends Exception {
    public InvalidProductException(String message) {
        super(message);
    }
}