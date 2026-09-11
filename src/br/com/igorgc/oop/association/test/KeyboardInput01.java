package br.com.igorgc.oop.association.test;

import java.util.Scanner;

public class KeyboardInput01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        System.out.println("Enter M or F for your gender:");
        char gender = scanner.next().charAt(0);

        System.out.println("----------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}
