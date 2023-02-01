package com.example.app.exceptions;

public class EntryException extends RuntimeException {

    public EntryException() {
        super();
    }

    public EntryException(String message) {
        super(message);
    }
}
