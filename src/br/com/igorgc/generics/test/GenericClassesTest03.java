package br.com.igorgc.generics.test;

import br.com.igorgc.generics.domain.Boat;
import br.com.igorgc.generics.domain.Car;
import br.com.igorgc.generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class GenericClassesTest03 {
    public static void main(String[] args) {
        List<Car> availableCars = new ArrayList<>(List.of(new Car("BMW"), new Car("Beetle")));
        List<Boat> availableBoats = new ArrayList<>(List.of(new Boat("Speedboat"), new Boat("Canoe")));

        RentalService<Car> carRentalService = new RentalService<>(availableCars);
        Car car = carRentalService.findAvailableObject();

        System.out.println("Using the car for a month...");

        carRentalService.returnRentedObject(car);

        System.out.println("----------");

        RentalService<Boat> boatRentalService = new RentalService<>(availableBoats);
        Boat boat = boatRentalService.findAvailableObject();

        System.out.println("Using the boat for a month...");

        boatRentalService.returnRentedObject(boat);
    }
}