package br.com.igorgc.generics.service;

import br.com.igorgc.generics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRentalService {
    private List<Car> availableCars = new ArrayList<>(List.of(new Car("BMW"), new Car("Beetle")));

    public Car findAvailableCar() {
        System.out.println("Searching for available car...");
        Car car = availableCars.remove(0);
        System.out.println("Renting car: " + car);
        System.out.println("Cars available for rent:");
        System.out.println(availableCars);
        return car;
    }

    public void returnRentedCar(Car car) {
        System.out.println("Returning car " + car);
        availableCars.add(car);
        System.out.println("Cars available for rent:");
        System.out.println(availableCars);
    }
}