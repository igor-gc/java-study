package br.com.igorgc.exception.exception.domain;

import java.io.FileNotFoundException;

public class Employee extends Person {

    @Override
    public void save() throws LoginInvalidException, FileNotFoundException {
        System.out.println("Saving employee");
    }
}