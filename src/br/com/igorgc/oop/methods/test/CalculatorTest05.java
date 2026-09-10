package br.com.igorgc.oop.methods.test;

import br.com.igorgc.oop.methods.domain.Calculator;

public class CalculatorTest05 {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int[] numbers = {1, 2, 3, 4, 5};

        calculator.sumArray(numbers);
        calculator.sumVarArgs(numbers);
    }
}