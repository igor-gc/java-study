package br.com.igorgc.exception.exception.domain;

import java.io.IOException;

public class Person {

    public void save() throws LoginInvalidException, IOException {
        System.out.println("Saving person");
    }
}