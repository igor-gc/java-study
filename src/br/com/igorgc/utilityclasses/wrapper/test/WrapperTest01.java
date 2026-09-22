package br.com.igorgc.utilityclasses.wrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte bytePrimitive = 1;
        short shortPrimitive = 1;
        int intPrimitive = 1;
        long longPrimitive = 10L;
        float floatPrimitive = 10F;
        double doublePrimitive = 10D;
        char charPrimitive = 'W';
        boolean booleanPrimitive = false;

        Byte byteWrapper = 127;
        Short shortWrapper = 1;
        Integer intWrapper = 1; // autoboxing
        Long longWrapper = 10L;
        Float floatWrapper = 10F;
        Double doubleWrapper = 10D;
        Character charWrapper = 'W';
        Boolean booleanWrapper = false;

        int number = intWrapper; // unboxing

        Integer intWrapper2 = Integer.parseInt("1");

        boolean isTrue = Boolean.parseBoolean(null);
        System.out.println(isTrue);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
