package com.company.BinarySearch;

public class maxSubarraySum {
    public static void main(String[] args) {


    }
    static int maxSubarraySum(int [] arr ){
        int sum = 0;
        int maxi = arr[0];
        for(int  i  = 0 ; i < arr.length ; i++){
            sum +=  arr[i];
            if(maxi < sum){
                maxi = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
}
