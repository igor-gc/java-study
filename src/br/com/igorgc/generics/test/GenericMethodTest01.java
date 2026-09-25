package br.com.igorgc.generics.test;

import br.com.igorgc.generics.domain.Boat;

import java.util.List;

public class GenericMethodTest01 {
    public static void main(String[] args) {
        List<Boat> boatList = createListWithOneObject(new Boat("Canoe"));
        System.out.println(boatList);
    }

    private static <T> List<T> createListWithOneObject(T object) {
        return List.of(object);
    }

//    private static <T extends Comparable<T>> List<T> createListWithOneObject(T object) {
//        return List.of(object);
//    }
}
