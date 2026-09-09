package br.com.igorgc.oop.methods.test;

import br.com.igorgc.oop.methods.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double result = calculator.divideTwoNumbers(10, 2);
        System.out.println(result);

        System.out.println(calculator.divideTwoNumbers(20, 0));
    }
}