package com.company.BinarySearch;

public class peakElementUsingBinary {

    public static void main(String[] args) {
        int [] arr = {3,4};
        System.out.println(peak(arr,0,arr.length - 1));

    }

//    Bitonic elements
    static int peak(int [] arr , int start , int end ){
        start = 0;
        end = arr.length - 1;
        while (start <=  end){
            int mid = start + ( end - start) / 2;
            if((mid == 0 ||arr[mid] > arr[mid - 1])   &&   (mid == end - 1   || arr[mid] > arr[mid + 1])) return arr[mid];
            else if(arr[mid] > arr[mid - 1])   start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}
