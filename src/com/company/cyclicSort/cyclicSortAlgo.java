package com.company.cyclicSort;

import java.util.Arrays;

public class cyclicSortAlgo {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

//    This algo is valid only when u have given that the range of the number from the 1 to n only this case
//    that algo is valid otherwise you have to sort the array by using the another algorithms


    static void cyclic(int [] arr) {
        int i = 0;
        while(i < arr.length){
            if(arr[i] - 1 != i){
                int otherIndex = arr[i] - 1;
                int temp = arr[otherIndex];
                arr[otherIndex] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
    }



}
