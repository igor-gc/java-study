package br.com.igorgc.controlflow;

public class IfStatement {
    public static void main(String[] args) {

        int age = 25;
        boolean isAllowedToBuyAlcohol = age >= 18;

        if (isAllowedToBuyAlcohol) {
            System.out.println("Allowed to buy alcohol");
        }

        if (!isAllowedToBuyAlcohol) {
            System.out.println("Not allowed to buy alcohol");
        }
    }
}