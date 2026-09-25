package br.com.igorgc.innerclasses.test;

public class OuterClassesTest02 {

    private String name = "Alice";

    void print(final String param) {
        final String lastName = "Smith";

        class LocalClass {
            public void printLocal() {
                System.out.println(param);
                System.out.println(name + " " + lastName);
            }
        }

        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("");
    }
}