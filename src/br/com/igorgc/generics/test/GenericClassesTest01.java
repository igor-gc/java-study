package br.com.igorgc.generics.test;

import br.com.igorgc.generics.domain.Car;
import br.com.igorgc.generics.service.CarRentalService;

public class GenericClassesTest01 {
    public static void main(String[] args) {
        CarRentalService carRentalService = new CarRentalService();
        Car car = carRentalService.findAvailableCar();

        System.out.println("Using the car for a month...");

        carRentalService.returnRentedCar(car);
    }
}