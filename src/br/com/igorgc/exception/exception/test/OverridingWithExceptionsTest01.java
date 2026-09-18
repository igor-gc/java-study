package br.com.igorgc.exception.exception.test;

import br.com.igorgc.exception.exception.domain.Employee;
import br.com.igorgc.exception.exception.domain.LoginInvalidException;
import br.com.igorgc.exception.exception.domain.Person;

import java.io.FileNotFoundException;

public class OverridingWithExceptionsTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        try {
            employee.save();
        } catch (LoginInvalidException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}