package br.com.igorgc.collections.domain;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Customer {

    private Long id;
    private String name;

    public Customer(String name) {
        this.id = ThreadLocalRandom.current()
                .nextLong(0, 100_000);

        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Customer customer = (Customer) object;

        return Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}