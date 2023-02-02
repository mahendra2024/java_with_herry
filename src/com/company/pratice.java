package com.company;

import java.util.Arrays;

public class pratice {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7};
        int [] nums = {2,4,6,8};
        mergeArray(arr,nums,4,4);

//        rotatedArrayByOne(arr,2);
//        System.out.println(Arrays.toString(arr));


//        CountOddEven(arr);
//        findMissingNumber(nums);
//        System.out.println(factorial(6));
//        int ans = FindSecondLargest(arr);
//        System.out.println(ans);
//       int ans =  LinearSearchInRange(arr,5,4,arr.length - 1);
//        System.out.println(ans);
//        int ans = linearSearch(arr,6);
//        System.out.println(ans);
//        int ans = binarySearch(arr,tar);
//        System.out.println(ans);
//        System.out.println(arr.length);
//        BubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
//        insertionSort(arr);
//        System.out.println(Arrays.toString(arr));


//        System.out.println(SumOfArray
    }
    static int binarySearch(int [] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2 ;
            if(arr[mid] < target){
                start = mid + 1;
            }
            else if (arr[mid] > target){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int SumOfArray(int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
    static void BubbleSort(int [] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
    static void insertionSort(int [] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0  ; j--) {
                if(arr[j] > arr[j - 1]){
                    break;
                }
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
            }
        }
    }
    static int linearSearch(int [] arr , int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    static int LinearSearchInRange(int [] arr , int target , int start , int end){
        for (int i = start; i <= end; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    static int FindMini(int arr[]){
        int mini = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < mini ){
                mini = arr[i];
            }
        }
        return mini;
    }
    static int FindMax(int [] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    static int FindSecondLargest(int [] arr){
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = i + 1; j >  0 ; j--) {
                if(arr[j - 1] < arr[j]){
                    break;
                }
                    int temp = arr[j - 1];
                    arr[j - 1 ] = arr[j];
                    arr[j ] = temp;
            }
        }
        return arr[arr.length - 2];
    }
    static int factorial(int number){
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
    static void CountOddEven(int [] arr){
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0 ){
                countEven++;
            }
            else {
                countOdd++;
            }
        }
        System.out.println(countEven);
        System.out.println(countOdd);
    }
    static int CountZeros(int [] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                count++;
            }
        }
        return count;
    }
    static int FindMaximum(int [] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    static void rotatedArrayByOne(int [] arr , int times) {
//        rotation can be done by using three step
//   1    rotate complete array
//   2     rotate the array from start to (times) - 1
//    3    rotate the array from (times) to end of the array
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
    static void mergeArray(int []num1 , int [] num2 , int n ,int m) {
        int i = 0;
        int j = 0 ;
        int k = 0;
        int [] arr = new int [n + m];
        while (i < n && j < m){
            if(num1[i] < num2[j]){
                arr[k] = num1[i];
                k++;
                i++;
            }
            else{
                arr[k] = num2[j];
                k++;
                j++;
            }
        }
        while(i < n){
            arr[k] = num1[i];
            i++;
            k++;
        }
        while(j < m){
            arr[k] = num2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(arr));
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
