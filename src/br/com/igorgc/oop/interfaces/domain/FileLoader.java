package br.com.igorgc.oop.interfaces.domain;

public class FileLoader implements DataLoader {

    @Override
    public void load() {
        System.out.println("Loading data from a file");
    }
}