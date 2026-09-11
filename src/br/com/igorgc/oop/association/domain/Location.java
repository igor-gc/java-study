package br.com.igorgc.oop.association.domain;

public class Location {
    private String address;

    public Location(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}