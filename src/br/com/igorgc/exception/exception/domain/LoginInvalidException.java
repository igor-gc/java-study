package br.com.igorgc.exception.exception.domain;

public class LoginInvalidException extends Exception {

    public LoginInvalidException() {
        super("Invalid login");
    }

    public LoginInvalidException(String message) {
        super(message);
    }
}
