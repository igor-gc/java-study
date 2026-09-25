package br.com.igorgc.generics.test;

import java.util.List;
import java.util.ArrayList;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());

        printConsultation(dogs);
        printConsultation(cats);

        List<Animal> animals = new ArrayList<>();
        printConsultationAnimal(animals);
    }

    // Type erasure
    private static void printConsultation(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consult();
        }
    }

    private static void printConsultationAnimal(List<? super Animal> animals) {
        animals.add(new Dog());
        animals.add(new Cat());
    }
}