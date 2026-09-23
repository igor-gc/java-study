package br.com.igorgc.utilityclasses.regex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String text = "Alice,Bob,Charlie,true,200";

        Scanner scanner = new Scanner(text);
        scanner.useDelimiter(",");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                System.out.println("Int " + number);
            } else if (scanner.hasNextBoolean()) {
                boolean value = scanner.nextBoolean();
                System.out.println("Boolean " + value);
            } else {
                System.out.println(scanner.next());
            }
        }
    }
}