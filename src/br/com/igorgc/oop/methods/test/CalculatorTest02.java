package br.com.igorgc.oop.methods.test;

import br.com.igorgc.oop.methods.domain.Calculator;

public class CalculatorTest02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.multiplyTwoNumbers(2, 5);

        System.out.println("CalculatorTest02 finished");
    }
}