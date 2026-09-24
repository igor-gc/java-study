package br.com.igorgc.collections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(16);
        List<String> names2 = new ArrayList<>(16);

        names.add("Alice");
        names.add("Java");

        names2.add("Bob");
        names2.add("Academy");

//        System.out.println(names.remove("Alice"));

        names.addAll(names2);

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("--------");

        int size = names.size();

        for (int i = 0; i < size; i++) {
            System.out.println(names.get(i));
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
    }
}