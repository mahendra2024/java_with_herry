package com.company;

import java.util.HashSet;
import java.util.Set;

public class subarrayWithZeroSum {
    public static void main(String[] args) {
        int [] arr = {  2, 1 , 3 ,- 4 , -2 };
        subArrayWithZeroSum(arr);
        subArrayWith_Zero_Sum(arr);
        subArrayWithSum_equal_to_k(arr,5);

    }
//    basic concept to find the sum of subarray equal to zero
//    the time complexcity is very high in this method

//    bruetforce solution
    static void subArrayWithZeroSum(int [] arr){
         boolean isFount = false;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                sum =+ arr[j];
                if(sum == 0){
                    isFount = true;
                    break;
                }
            }
            if(isFount =true){
                break;
            }
        }
        System.out.println("faund " + isFount);
    }

//    optimied solution of upper question

    static void subArrayWith_Zero_Sum(int [] arr ){
        Set<Integer>  set = new HashSet<Integer>();
        int sum = 0;
        boolean faund = false;
        for (int i = 0; i < arr.length; i++) {
            sum = + arr[i];
            set.add(sum);
            if(set.contains(sum)){
                faund = true;
                break;
            }
        }
        System.out.println("Found " + faund);
    }
    static void subArrayWithSum_equal_to_k(int [] arr , int k){
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
         boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            set.add(sum);
            sum = + arr[i];
            if(set.contains(sum - k)){
                isFound = true;
                break;
            }

        }
        System.out.println("fount " + isFound);
    }

}
