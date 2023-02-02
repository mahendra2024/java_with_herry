package com.company;

import java.util.Arrays;

public class meregeToArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,0,0,0};
        int  [] arr2 = {2,5,6};
        mergeArray(arr1,arr2,3,3);
     }
    static void mergeArray(int []num1 , int [] num2 , int n ,int m) {
        int i = 0;
        int j = 0 ;
        int k = 0;
        int [] arr = new int [n + m];
        while (i < n && j < m){
            if(num1[i] < num2[j]){
                arr[k] = num1[i];
                k++;
                i++;
            }
            else{
                arr[k] = num2[j];
                k++;
                j++;
            }
        }
        while(i < n){
            arr[k] = num1[i];
            i++;
            k++;
        }
        while(j < m){
            arr[k] = num2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(arr));
    }


}
