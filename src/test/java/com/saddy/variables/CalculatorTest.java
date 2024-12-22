package com.saddy.variables;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(34, 12);
        System.out.println(result);
        System.out.println(calculator.modulus(34, 5));
    }
}
