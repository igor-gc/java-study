package br.com.igorgc.innerclasses.test;

import br.com.igorgc.generics.domain.Boat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class BoatNameComparator implements Comparator<Boat> {
    @Override
    public int compare(Boat boat1, Boat boat2) {
        return boat1.getName().compareTo(boat2.getName());
    }
}

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Boat> boatList = new ArrayList<>(List.of(new Boat("Speedboat"), new Boat("Canoe")));

        boatList.sort((boat1, boat2) -> boat1.getName().compareTo(boat2.getName()));

        boatList.sort(new Comparator<Boat>() {
            @Override
            public int compare(Boat boat1, Boat boat2) {
                return boat1.getName().compareTo(boat2.getName());
            }
        });

        System.out.println(boatList);
    }
}