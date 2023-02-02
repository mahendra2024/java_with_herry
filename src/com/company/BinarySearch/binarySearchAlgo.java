package com.company.BinarySearch;

public class binarySearchAlgo {
    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5,6,7,77};
        int element = 77;
        int ans = binarySearch( nums , element);
        System.out.println(ans);
        int [] number = {9,8,7,6,5,4,3,2,1};
        int tar = 8;
        int result = BinerySearch(number , tar);
        System.out.println(result);


    }

//     Program is sorted in ascending order
//    Then we have to apply this code
    static int binarySearch(int [] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while ( start <= end){
            //        we find mid in new way because (start + mid) can not out of range of int in java
            int mid = start + (end - start) /2;
            if (arr[mid] < target ){
                start = mid +1;
            }
            else if(arr[mid] > target){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
//    When the array in given in descending order
//    Then we have to apply this code

    static int BinerySearch(int [] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while (end >= start){
            int mid = start +(end - start)/2 ;
            if(arr[mid] < target){
                end = mid-1;
            }
            else if(arr[mid] > target){
                end = mid +1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
