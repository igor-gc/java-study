package br.com.igorgc.generics.test;

abstract class Animal {
    public abstract void consult();
}

class Dog extends Animal {

    @Override
    public void consult() {
        System.out.println("Consulting dog");
    }
}

class Cat extends Animal {

    @Override
    public void consult() {
        System.out.println("Consulting cat");
    }
}

public class WildcardTest01 {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog()};
        Cat[] cats = {new Cat(), new Cat()};

        printConsultation(dogs);
        printConsultation(cats);

        Animal[] animals = {new Cat(), new Dog()};
        Animal animal = new Cat();

        printConsultation(animals);
    }

    private static void printConsultation(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consult();
        }
//        animals[1] = new Cat();
    }
}