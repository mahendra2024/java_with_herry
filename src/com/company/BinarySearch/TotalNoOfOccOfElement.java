package com.company.BinarySearch;

public class TotalNoOfOccOfElement {
    public static void main(String[] args) {
        int [] arr = {1 , 2 ,3 , 3, 3, 3, 3, 4,5 ,6};

        System.out.println(lastOcc(arr,1));
        int a = lastOcc(arr,3);
        int b = firstOcc(arr,3);
        int result = a - b + 1;
        System.out.println(result);
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
