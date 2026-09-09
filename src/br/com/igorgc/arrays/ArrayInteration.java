package br.com.igorgc.arrays;

public class ArrayInteration {
    public static void main(String[] args) {
        String[] names = new String[3];

        names[0] = "Pedro";
        names[1] = "Carlos";
        names[2] = "Luiza";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}