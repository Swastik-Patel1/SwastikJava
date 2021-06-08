package com.company;
// TestJavaOne.java

public class TestJavaOne {

    public static void main(String[] args) {
        System.out.println("Hello World !!");
        System.out.println("Sum = " + add(2, 3)); // control + shift + r to run
    }
    public static int add(int num1, int num2){ // all methods must be static to work
        return (num1+num2);
    }
}
