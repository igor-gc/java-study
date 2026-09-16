package br.com.igorgc.oop.enumeration.domain;

public enum PaymentType {

    DEBIT {
        @Override
        public double calculateDiscount(double amount) {
            return amount * 0.1;
        }
    },

    CREDIT {
        @Override
        public double calculateDiscount(double amount) {
            return amount * 0.05;
        }
    };

    public abstract double calculateDiscount(double amount);
}