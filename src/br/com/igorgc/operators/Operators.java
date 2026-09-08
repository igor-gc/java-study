package br.com.igorgc.operators;

public class Operators {
    public static void main(String[] args) {

        // Arithmetic operators: + - * /
        int number01 = 10;
        int number02 = 20;
        double result = number01 + number02;
        System.out.println(result);

        // Modulus operator: %
        int remainder = 21 % 7;
        System.out.println(remainder);

        // Relational operators: < > <= >= == !=
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenEqualToTwenty = 10 == 20;
        boolean isTenEqualToTen = 10 == 10;
        boolean isTenDifferentFromTen = 10 != 10.0;

        System.out.println("isTenGreaterThanTwenty: " + isTenGreaterThanTwenty);
        System.out.println("isTenLessThanTwenty: " + isTenLessThanTwenty);
        System.out.println("isTenEqualToTwenty: " + isTenEqualToTwenty);
        System.out.println("isTenEqualToTen: " + isTenEqualToTen);
        System.out.println("isTenDifferentFromTen: " + isTenDifferentFromTen);

        // Logical operators: && (AND), || (OR), ! (NOT)
        int age = 29;
        float salary = 3500F;

        boolean meetsLawOverThirty = age >= 30 && salary >= 4612;
        boolean meetsLawUnderThirty = age < 30 && salary >= 3381;

        System.out.println("meetsLawOverThirty: " + meetsLawOverThirty);
        System.out.println("meetsLawUnderThirty: " + meetsLawUnderThirty);

        double checkingAccountBalance = 200;
        double savingsAccountBalance = 10000;
        float playstationPrice = 5000F;

        boolean canBuyPlaystation = checkingAccountBalance > playstationPrice || savingsAccountBalance > playstationPrice;

        System.out.println("canBuyPlaystation: " + canBuyPlaystation);

        // Assignment operators: = += -= *= /= %=
        double bonus = 1800;

        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);

        // Increment and decrement operators: ++ --
        int counter = 0;

        counter += 1;
        counter++;
        counter--;
        ++counter;
        --counter;

        int counter2 = 0;
        System.out.println(++counter2);
    }
}