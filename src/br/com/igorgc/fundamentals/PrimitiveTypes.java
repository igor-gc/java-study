package br.com.igorgc.fundamentals;

public class PrimitiveTypes {
    public static void main(String[] args) {

        int age = 29;
        long largeNumber = 100000L;
        double salaryDouble = 2000.0;
        float salaryFloat = 2500.0F;
        byte ageByte = 127;
        short ageShort = 32000;
        boolean trueValue = true;
        boolean falseValue = false;
        char character = '\u0041';
        String name = "Igor";

        System.out.println("A idade é: " + age + " anos");
        System.out.println(largeNumber);
        System.out.println(salaryDouble);
        System.out.println(salaryFloat);
        System.out.println(ageByte);
        System.out.println(ageShort);
        System.out.println(trueValue);
        System.out.println(falseValue);
        System.out.println("Char " + character);
        System.out.println("Oi meu nome é: " + name);


        // Casting
        System.out.println("---------------- CAST ----------------");

        int cars = (int) 29020202L;
        long number = (long) 155.23;
        float anotherSalary = (float) 2500.0D;

        System.out.println(cars);
        System.out.println(number);
        System.out.println(anotherSalary);
    }
}