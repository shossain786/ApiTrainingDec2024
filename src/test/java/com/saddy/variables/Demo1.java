package com.saddy.variables;

public class Demo1 {
    public static void main(String[] args) {
//        print sum of first 10 number
        int num = 0, result = 0;
        while (num <= 10) {
            result = result + num;
            num ++;
        }
        System.out.println("Summation of first 10 numbers: " + result);
    }
}
