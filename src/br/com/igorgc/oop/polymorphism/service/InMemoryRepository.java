package br.com.igorgc.oop.polymorphism.service;

import br.com.igorgc.oop.polymorphism.repository.Repository;

public class InMemoryRepository implements Repository {

    @Override
    public void save() {
        System.out.println("Saving in memory");
    }
}