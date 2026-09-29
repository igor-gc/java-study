package br.com.igorgc.designpatterns.test;

import br.com.igorgc.designpatterns.domain.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .firstName("Paulo")
                .lastName("Alves")
                .username("paulo.alves")
                .email("paulo.alves@example.com")
                .build();

        System.out.println(person);
    }
}