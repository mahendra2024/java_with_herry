package com.company.BinarySearch;

public class FirstOccOfElementsInArray {
    public static void main(String[] args) {

        int [] arr = {1 , 2 ,3 , 3, 3, 3, 3, 4,5 ,6};
        System.out.println(firstOcc(arr,6));
    }


    static int firstOcc(int []arr , int target){
        int start = 0;
        int end = arr.length  - 1 ;
        int ans = -1;
        while (start <= end){
            int mid  = start + (end - start) / 2;
            if(arr[mid] > target){
                end = mid  - 1;
            }
            else if (arr[mid] < target){
                start = mid + 1;
            }
            else{
                ans = mid;
                end = mid - 1;
            }
        }

        return ans;
    }
}
