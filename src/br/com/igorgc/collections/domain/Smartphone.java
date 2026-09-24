package br.com.igorgc.collections.domain;

public class Smartphone {

    private String serialNumber;
    private String brand;

    public Smartphone(String serialNumber, String brand) {
        this.serialNumber = serialNumber;
        this.brand = brand;
    }

    // Reflexive: x.equals(x) must return true for any non-null x.
    // Symmetric: if x.equals(y) is true, y.equals(x) must also be true.
    // Transitive: if x.equals(y) and y.equals(z) are true,
    // then x.equals(z) must also be true.
    // Consistent: repeated calls to x.equals(y) must return the same result
    // while the relevant information has not changed.
    // Non-null: x.equals(null) must return false.

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (this == object) {
            return true;
        }

        if (this.getClass() != object.getClass()) {
            return false;
        }

        Smartphone smartphone = (Smartphone) object;

        return serialNumber != null &&
                serialNumber.equals(smartphone.serialNumber);
    }

    // If x.equals(y) == true, then x.hashCode() == y.hashCode().
    // If x.hashCode() != y.hashCode(), x.equals(y) must be false.
    // Equal hash codes do not necessarily mean that the objects are equal.

    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}