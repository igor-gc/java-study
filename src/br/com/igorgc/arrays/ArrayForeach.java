package br.com.igorgc.arrays;

public class ArrayForeach {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int[] numbers2 = {1, 2, 3, 4, 5};
        int[] numbers3 = new int[]{1, 2, 3, 4, 5};

        for (int number : numbers3) {
            System.out.println(number);
        }
    }
}