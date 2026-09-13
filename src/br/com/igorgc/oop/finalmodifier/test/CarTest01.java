package br.com.igorgc.oop.finalmodifier.test;

import br.com.igorgc.oop.finalmodifier.domain.Car;
import br.com.igorgc.oop.finalmodifier.domain.Ferrari;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(Car.SPEED_LIMIT);
        System.out.println(car.BUYER);

        car.BUYER.setName("John");

        System.out.println(car.BUYER);

        Ferrari ferrari = new Ferrari();
        ferrari.setName("Enzo");
        ferrari.print();
    }
}