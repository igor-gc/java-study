package br.com.igorgc.oop.staticmodifier.test;

import br.com.igorgc.oop.staticmodifier.domain.Cars;

public class CarsTest01 {
    public static void main(String[] args) {
        Cars car1 = new Cars("BMW", 280);
        Cars car2 = new Cars("Mercedes", 275);
        Cars car3 = new Cars("Audi", 290);

        Cars.speedLimit = 180;

        car1.print();
        car2.print();
        car3.print();
    }
}