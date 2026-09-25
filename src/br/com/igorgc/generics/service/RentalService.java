package br.com.igorgc.generics.service;

import java.util.List;

public class RentalService<T> {
    private List<T> availableObjects;

    public RentalService(List<T> availableObjects) {
        this.availableObjects = availableObjects;
    }

    public T findAvailableObject() {
        System.out.println("Searching for available object...");
        T object = availableObjects.remove(0);
        System.out.println("Renting object: " + object);
        System.out.println("Objects available for rent:");
        System.out.println(availableObjects);
        return object;
    }

    public void returnRentedObject(T object) {
        System.out.println("Returning object " + object);
        availableObjects.add(object);
        System.out.println("Objects available for rent:");
        System.out.println(availableObjects);
    }
}
