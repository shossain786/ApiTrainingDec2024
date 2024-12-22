package com.saddy.variables;

public class VariableDemo {
    String subject = "Java";  // instance variable
    int price;

    public void printSubject() {
        int number; //local variable
        number = 0;
        System.out.println("Subject: " + subject);
        System.out.println(price);
        System.out.println(number);
    }

    public void printName(String name) {
        System.out.println("Hello, " + name);
        System.out.println("Price: " + price);

    }
}
