package br.com.igorgc.controlflow;

public class BreakStatement {
    public static void main(String[] args) {
        // Print the first 25 numbers from a given value, for example, 50
        int maxValue = 50;

        for (int i = 0; i <= maxValue; i++) {
            if (i > 25) {
                break;
            }

            System.out.println(i);
        }
    }
}