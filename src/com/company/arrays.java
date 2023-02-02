package com.company;

import java.sql.Array;

public class arrays {
    public static void main(String[] args) {
        int []arr = {1 , 2 , 3 , 4 , 5 };
        int Arr[] = {15, 2, 45, 12, 7};

        System.out.println(sumOfArray(arr));
        System.out.println(sumOFSeries(arr));
        System.out.println(checkIndex(Arr));
    }
    static int sumOfArray(int [] arr ){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        return sum;
    }
    static int sumOFSeries(int [] arr){
        int sum = 0 ;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + i;
        }
        return sum;

    }
//    question is that to check weather value of array's elements is equal to it's index??

    static int checkIndex(int [] arr){
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == i +1){
                return i+1;
            }
        }
        return -1;
    }



}
