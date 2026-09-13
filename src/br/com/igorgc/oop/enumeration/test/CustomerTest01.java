package br.com.igorgc.oop.enumeration.test;

import br.com.igorgc.oop.enumeration.domain.Customer;
import br.com.igorgc.oop.enumeration.domain.CustomerType;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Gabriel", CustomerType.INDIVIDUAL);
        Customer customer2 = new Customer("Dev Company", CustomerType.COMPANY);
        Customer customer3 = new Customer("Tech Startup", CustomerType.START_UP);

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
    }
}