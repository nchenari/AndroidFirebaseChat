package com.nchenari.flashchatnewfirebase;

/**
 * Created by nchenari on 11/28/17.
 */

public class InstantMessage {

    private String message;
    private String author;

    public InstantMessage(String message, String author) {
        this.message = message;
        this.author = author;
    }

    // Firebase requirements - must have no argument constructor w/ getter methods


    public InstantMessage() {
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }
}
