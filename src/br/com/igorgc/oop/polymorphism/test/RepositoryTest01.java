package br.com.igorgc.oop.polymorphism.test;

import br.com.igorgc.oop.polymorphism.repository.Repository;
import br.com.igorgc.oop.polymorphism.service.InMemoryRepository;

import java.util.LinkedList;
import java.util.List;

public class RepositoryTest01 {

    public static void main(String[] args) {
        Repository repository = new InMemoryRepository();
        repository.save();

        List<String> characters = new LinkedList<>();
        characters.add("Alan");
        characters.add("Bob");
        characters.add("Carl");

        System.out.println(characters);
    }
}