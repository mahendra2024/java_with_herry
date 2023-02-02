package com.company.BinarySearch;

public class lastOccOfElementInArray {
    public static void main(String[] args) {

        int [] arr = {1 , 2 ,3 , 3, 3, 3, 3, 4,5 ,6};
        System.out.println(lastOcc(arr,6));
    }

    static int lastOcc(int [] arr , int target){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + ( end - start) / 2 ;
            if(arr[mid] > target){
                end = mid - 1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                ans = mid;
                start = mid + 1;
            }
        }

        return ans;
    }
}
