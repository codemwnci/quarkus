package io.quarkus.it.spring.web;

public class Error {

    private String message;

    public Error() {

    }

    public Error(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
