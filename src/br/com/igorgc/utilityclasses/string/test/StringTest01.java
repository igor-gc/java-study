package br.com.igorgc.utilityclasses.string.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name = "Pedro";
        String name2 = "Pedro";

        name = name.concat(" Pereira"); // name += " Pereira"

        System.out.println(name);
        System.out.println(name == name2);

        String name3 = new String("Pedro2");
        String name4 = "Pedro2";

        System.out.println(name3.intern() == name4);
        // 1. Creates a reference variable
        // 2. Creates a String object
        // 3. Creates/reuses the String in the String Pool
    }
}
