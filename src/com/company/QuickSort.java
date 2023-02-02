package com.company;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int [] arr = {5,4,3,2,1};
        quickSort(arr,0,arr.length );
        System.out.println(Arrays.toString(arr));
    }

//    Int this sorting algorithm we have to take the arr  ,   low and high
//    basically low and high are point out the two pointer algorithm to show the working of the algo in which
//    of the array are in working
//    after this we need A pivot element that can we have to choose rendomly from the array
//    the elements which are less then the pivot element are place in the left hand side of the pivot element
//     the element which are greater then then the pivot element are placed right hand side of the pivot element
//    after choosing the pivot element we have to take two more element are start and end for travesing in the array
//    which check the condition for the pivot element are greater or lesser then the pivot element
//    for swapping the element

    static void quickSort(int [] arr , int low , int high){
       if( low > high){
           return;
       }

       int start = low;
       int end = high;
       int mid  = start + (end - start)/2;
       int pivot  = mid;

       while (start <= end){
           while (arr[start] < pivot){
               start++;
           }
           while (arr[end] > pivot){
               end--;
           }
           if(start <= end){
               int temp = arr[start];
               arr[start] = arr[end];
               arr[end] = temp;
               start++;
               end--;
           }
       }

       quickSort(arr,low,end);;
       quickSort(arr,start,high);

    }
}
