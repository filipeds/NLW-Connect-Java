package br.com.nlw.events.exception;

public class UserIndicationNotFoundException extends RuntimeException{
    public UserIndicationNotFoundException (String msg) {
        super(msg);
    }
}
