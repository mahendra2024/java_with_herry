package com.company;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
//        The cyclic sort is used when you have to given a range from 1 to n
//        then use cyclic sort without any interrupt
        int [] arr = {5,4,3,2,1 , 9};
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Cyclic(int [] arr){

        int i = 0;
//        The value of i should always less than the
//        value of arrays length
        while (i < arr.length){
//.
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else {
                i++;
            }
        }
    }
}
