package com.company.BinarySearch;

public class findElementInRotatedSortedArray {
    public static void main(String[] args) {
        int [] arr = {5,6,7,8,9,10,1,2,3};
        System.out.println(FindElement(arr,10));
    }

    static int FindElement(int arr[] , int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + ( end - start) / 2;
            if(arr[mid] == target) return mid;

            if(arr[mid] > arr[start]){
                if(arr[mid] > target && arr[start] <= target) end = mid - 1;
                else start = mid + 1;
            }
            else{
                if(target > arr[mid + 1] && target <= arr[end]) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }

}
