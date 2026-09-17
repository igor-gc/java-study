package br.com.igorgc.oop.polymorphism.service;

import br.com.igorgc.oop.polymorphism.repository.Repository;

public class DatabaseRepository implements Repository {

    @Override
    public void save() {
        System.out.println("Saving to the database");
    }
}