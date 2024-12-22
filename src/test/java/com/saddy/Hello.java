package com.saddy;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
//        byte a = -129;
        String personName = "Saddam";
        String _name;
        String $name;
//        String name^; //not allowed
        int a = 100;


        displayName();
    }

    public static void displayName() {
        System.out.println("Hello from display");
    }
}

//1. numbers are not allowed as a prefix
//2. Special Character: Only _, $ two are allowed
//3. Length: recommendate(4-15)