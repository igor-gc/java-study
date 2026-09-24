package br.com.igorgc.collections.test;

import br.com.igorgc.collections.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone smartphone1 =
                new Smartphone("1ABC1", "iPhone");

        Smartphone smartphone2 =
                new Smartphone("22222", "Pixel");

        Smartphone smartphone3 =
                new Smartphone("33333", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>(6);

        smartphones.add(smartphone1);
        smartphones.add(smartphone2);
        smartphones.add(0, smartphone3);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone smartphone4 =
                new Smartphone("2222233", "Pixel");

        System.out.println(smartphones.contains(smartphone4));

        int smartphone4Index =
                smartphones.indexOf(smartphone4);

        System.out.println(smartphones.get(smartphone4Index));
    }
}