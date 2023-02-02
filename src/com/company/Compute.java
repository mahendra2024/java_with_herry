package com.company;
//  https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1?page=1&difficulty[]=-1&category[]=Arrays&sortBy=submissions
class Compute {
    
    public void rotate(int arr[], int n) {
        int [] nums = {1,2,3,4,5};

    }
    static void rotatedArrayByOne(int [] arr , int times) {
//        rotation can be done by using three step
//   1    rotate complete array
//   2     rotate the array from start to (times) - 1
//    3    rotate the arrya from (times) to end of the array
        reverseArray(arr,0,arr.length - 1);
        reverseArray(arr,0,times - 1);
        reverseArray(arr,times,arr.length - 1);

    }
    static void reverseArray(int [] arr , int start , int end ){
       while ( start < end){
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
       }
    }
}