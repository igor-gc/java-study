package br.com.igorgc.utilityclasses.regex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String text = "Alice, Bob, Charlie, true, 200";
        String[] names = text.split(",");

        for (String name : names) {
            System.out.println(name.trim());
        }
    }
}