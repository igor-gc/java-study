package br.com.igorgc.innerclasses.test;

public class OuterClassesTest03 {
    private String name = "Alice";

    static class Nested {
        private String lastName = "Smith";

        void print() {
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest03.Nested nested = new OuterClassesTest03.Nested();
        nested.print();
    }
}