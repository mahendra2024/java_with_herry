package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []  arr = {5,4,3,2,1 , -2 , -1 ,-9};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
//    it work by repeatedly swapping the adjecent elements if they are in wrong order
//    not suitable for large data set
    static void Bubble(int []  arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if(arr[i]  < arr[j]){
                    int temp = arr[i];
                    arr[i] =  arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
