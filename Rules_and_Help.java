// To create a new java file, go to "src", then "com.company",
// then right click for "New Java class" and type in the class name

package com.company;

import java.util.Scanner;

public class Rules_and_Help {
    // To get a "main" function, type "psvm"(public static main void) then click tab
    public static void main(String[] args) {
        // To use a writeline, type "sout"(system.out.println) then click tab
        System.out.println("Hello World!");
        
        // To get user input, use the Scanner method
        Scanner userObj = new Scanner(System.in);
        String userInput = userObj.nextLine();   // "String" data type MUST be capitalized since "string" is a method 
    }
}
