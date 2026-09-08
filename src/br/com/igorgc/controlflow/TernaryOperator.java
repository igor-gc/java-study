package br.com.igorgc.controlflow;

public class TernaryOperator {
    public static void main(String[] args) {

        // Donate if salary > 5000
        double salary = 6000;

        String donationMessage = "I will donate 500 to charity";
        String noDonationMessage = "I can't afford it yet, but I will!";

        // (condition) ? true : false (Ternary operator)
        String result = salary > 5000 ? donationMessage : noDonationMessage;

        System.out.println(result);
    }
}