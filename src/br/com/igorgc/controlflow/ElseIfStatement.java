package br.com.igorgc.controlflow;

public class ElseIfStatement {
    public static void main(String[] args) {

        int age = 15;
        String category;

        if (age < 15) {
            category = "Child Category";
        } else if (age >= 15 && age < 18) {
            category = "Youth Category";
        } else {
            category = "Adult Category";
        }

        System.out.println(category);
    }
}