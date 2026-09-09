package br.com.igorgc.oop.methods.test;

import br.com.igorgc.oop.methods.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.addTwoNumbers();
        calculator.subtractTwoNumbers();

        System.out.println("CalculatorTest finished");
    }
}