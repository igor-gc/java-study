package br.com.igorgc.oop.interfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Loading data from the database");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from the database");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permissions in the database");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Inside retrieveMaxDataSize in DatabaseLoader");
    }
}