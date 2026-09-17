package br.com.igorgc.oop.interfaces.domain;

public class DatabaseLoader implements DataLoader {

    @Override
    public void load() {
        System.out.println("Loading data from the database");
    }
}