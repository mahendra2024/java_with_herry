package com.company;

import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        String strong = greet();
        System.out.println(strong);
//        take the two input from user and print the sum
        sum();

    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = in.nextInt();
        System.out.println("Enter the second number");
        int b = in.nextInt();
        System.out.println(a+b);

    }
    static String greet(){
        String name = "jai ho mahadev ki ";
        return name;
    }
}
