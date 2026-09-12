package br.com.igorgc.oop.inheritance.domain;

public class Person {
    private String name;
    private String taxId;
    private Address address;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.taxId);
        System.out.println(this.address.getStreet() + " " + this.address.getZipCode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}