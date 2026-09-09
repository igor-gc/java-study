package br.com.igorgc.arrays;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] intArray = new int[3][];

        intArray[0] = new int[2];
        intArray[1] = new int[3];
        intArray[2] = new int[6];

        for (int[] baseArray : intArray) {
            System.out.println("--------");

            for (int number : baseArray) {
                System.out.print(number + " ");
            }
        }
    }
}