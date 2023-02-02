package com.company.Recursion;

public class recursionLevel1 {
    public static void main(String[] args) {
//        num(5);
//        System.out.println();
//        revNum(1);
        int result = fact(5);
        System.out.println(result);
        int anss = sum(5);
        System.out.println(anss);

        int resultt = sumDigit(1342);
        System.out.println(resultt);

        int pro = productDigit(1432);
        System.out.println(pro);

    }

    static void num(int n ){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        num(n - 1);
    }
    static void revNum(int n){
        if(n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        revNum(n + 1);
    }
    static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int ans = 1;
        ans = fact(n - 1) * n;
        return ans;
    }
    static int sum(int n){
        if(n == 1){
            return 1;
        }
        int ans = n + sum(n - 1);
        return ans;
    }
    static int sumDigit(int n){
        if(n == 0 ){
            return 0;
        }
        return n % 10 + sumDigit(n/10);
    }
    static int productDigit(int n){
        if(n == 0 ){
            return 0;
        }
        if( n == 1 ){
            return 1;
        }
        return n%10 * productDigit(n / 10);
    }

}
