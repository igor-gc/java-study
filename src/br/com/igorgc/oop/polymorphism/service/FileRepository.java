package br.com.igorgc.oop.polymorphism.service;

import br.com.igorgc.oop.polymorphism.repository.Repository;

public class FileRepository implements Repository {

    @Override
    public void save() {
        System.out.println("Saving to a file");
    }
}