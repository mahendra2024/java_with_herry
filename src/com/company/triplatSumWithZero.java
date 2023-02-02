package com.company;

public class triplatSumWithZero {
    public static void main(String[] args) {

    }
    static boolean triplatSum(int [] arr , int sum){

//        In this question
//        Expected Time Complexity: O(n3)
//         Expected Auxiliary Space: O(1)
        for(int i = 0; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                for(int k = j + 1 ; k < arr.length ; k++){
                    if(arr[i] + arr[j] + arr[k] == sum){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    static boolean triplatSumWith_X(int [] A , int n , int X){
//    https://practice.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1?page=1&difficulty[]=1&status[]=solved&category[]=Arrays&sortBy=submissions

//        n is the length of the array A


//        first of all
//        sort the array
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j > 0  ; j--) {
                if(A[j] > A[j - 1]){
                    break;
                }
                int temp = A[j - 1];
                A[j - 1] = A[j];
                A[j] = temp;
            }
        }


//        fix the first point
        for(int i = 0 ; i < n - 1 ; i++){
            int start = i + 1;
            int end  = n - 1;
            int s = A[i];

//            use the two pointer algo
            while(start < end){
                if(A[start] + A[end] + s == X){
                    return true;
                }
                else if(A[start] + A[end] + s < X){
                    start++;
                }
                else{
                    end--;
                }
            }
        }
        return false;

//        /    Expected Time Complexity: O(n2)
//     Expected Auxiliary Space: O(1)
    }


}
