package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JustForFunClass {

    public static void main(String[] args) {
        int arr[]= {100, 200, 300, 400};
        System.out.println(maxSum(arr,2));

    }

    static int maxSum(int [] arr , int K){
        int i = 0;
        int j = 0 ;
        int sum = 0;
        int max = 0;
        while( j < arr.length){
            sum = sum + arr[j];
            if(j - i + 1 == K){
                max = Math.max(max , sum);
                sum = sum - arr[i++];

                j++;
            }

        }
        return max;
    }
}



