package br.com.igorgc.generics.test;

import br.com.igorgc.generics.domain.Boat;
import br.com.igorgc.generics.service.BoatRentalService;

public class GenericClassesTest02 {
    public static void main(String[] args) {
        BoatRentalService boatRentalService = new BoatRentalService();
        Boat boat = boatRentalService.findAvailableBoat();

        System.out.println("Using the boat for a month...");

        boatRentalService.returnRentedBoat(boat);
    }
}