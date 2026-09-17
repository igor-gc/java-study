package br.com.igorgc.oop.interfaces.domain;

public interface DataLoader {

    void load();

    default void checkPermission() {
        System.out.println("Checking permissions");
    }
}