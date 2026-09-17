package br.com.igorgc.oop.interfaces.test;

import br.com.igorgc.oop.interfaces.domain.DataLoader;
import br.com.igorgc.oop.interfaces.domain.DatabaseLoader;
import br.com.igorgc.oop.interfaces.domain.FileLoader;

public class DataLoaderTest01 {

    public static void main(String[] args) {
        DataLoader databaseLoader = new DatabaseLoader();
        DataLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();
    }
}