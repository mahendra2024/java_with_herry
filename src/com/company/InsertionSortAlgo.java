package com.company;

import java.util.Arrays;

public class InsertionSortAlgo {
    public static void main(String[] args) {
        int [] nums = {4,3,5,6,1,8,5};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void insertionSort(int [] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(arr[j - 1] < arr[j]){
                    break;
                }
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
