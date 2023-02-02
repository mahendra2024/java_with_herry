package com.company;

public class twoPointerAlgo {
    public static void main(String[] args) {
        int [] arr = {2,3,5,8,9,11};
        TwoPointer(arr , 17);

    }
    static boolean TwoPointer(int [] arr , int sum ){

        int i = 0;
        boolean isFound = false;
        int j = arr.length - 1;
        while (i < j){
            if(arr[i] == arr[j]){
                 return false;
            }
            else if(arr[i] + arr[j] > sum ){
                j--;
            }
            else{
                i++;
            }
        }
        return true;

    }
}
