package com.saddy.variables;

public class OperatorDemo2 {
    public static void main(String[] args) {
        int num = 10;

//        System.out.println(num++); //output: 0
//        System.out.println(num); //output: 1

//        System.out.println(++num); //output: 1
//        System.out.println(num);  // output: 1
//        num = num + 1;
//        num += 4; // equals to ( num = num +1)

        num %= 3;
        System.out.println(num);
    }
}
