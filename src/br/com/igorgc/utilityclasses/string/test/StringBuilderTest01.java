package br.com.igorgc.utilityclasses.string.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "Bob Paul";

        name.concat(" IT");
        name.substring(0, 3);

        System.out.println(name);

        StringBuffer stringBuffer = new StringBuffer("Bob Paul");

        stringBuffer.append(" IT").append(" Company");
        stringBuffer.reverse();
        stringBuffer.reverse();
        stringBuffer.delete(0, 3);

        System.out.println(stringBuffer);
    }
}