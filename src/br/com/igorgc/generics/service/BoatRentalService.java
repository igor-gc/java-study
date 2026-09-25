package br.com.igorgc.generics.service;

import br.com.igorgc.generics.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class BoatRentalService {
    private List<Boat> availableBoats = new ArrayList<>(List.of(new Boat("Speedboat"), new Boat("Canoe")));

    public Boat findAvailableBoat() {
        System.out.println("Searching for available boat...");
        Boat boat = availableBoats.remove(0);
        System.out.println("Renting boat: " + boat);
        System.out.println("Boats available for rent:");
        System.out.println(availableBoats);
        return boat;
    }

    public void returnRentedBoat(Boat boat) {
        System.out.println("Returning boat " + boat);
        availableBoats.add(boat);
        System.out.println("Boats available for rent:");
        System.out.println(availableBoats);
    }
}