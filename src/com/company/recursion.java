package com.company;
public class recursion {


    public static void number(int n) {
        if (n == 15) {
            return;
        }
        System.out.println(n);
        number(n + 1);
    }

    public static void main(String[] args) {
        int n = 10;
        int m = 0;



//        number(n);
        numberr(m);
//        sumNatural(0,5,0);
//        factorial(5);
    }

    public static void numberr(int m) {
        if (m == 9) {
            return;
        }
        System.out.println(m);
        numberr(m + 1);
    }

    public static void sumNatural(int i, int n, int sum) {
        if (i == n) {
            sum = sum + i;
            System.out.println(sum);
            return;
        }

        sum += i;
        sumNatural(i + 1, n, sum);

    }

    public static int factorial(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }
        int facttt = factorial(n - 1);
        int fact = n * facttt;
        n = n - 1;

        System.out.println(fact);
        return fact;

    }

    public static void fico(int n){


        int sum = 0;
        int a = 0;
        int b = 1 ;

        sum =+  b;
        int temp = a;
        a =b;
        b = temp;
    }
}