package com.company.BinarySearch;

public class FindMinimumElement {
    public static void main(String[] args) {

        int arr[] = {4 ,5 ,7,8,9,10,1 ,2 ,3};
        System.out.println(FindMinEle(arr));
    }


     static int FindMinEle(int [] arr){

         int start = 0;
         int end = arr.length - 1;
         while ( start <= end){
             int mid = start + (end - start) / 2;
             if(arr[mid - 1] > arr[mid]) return arr[mid];
             else if(arr[mid] > arr[start]) start = mid + 1;
             else end = mid - 1;
         }
         return -1;
     }
}
