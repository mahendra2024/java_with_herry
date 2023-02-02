package com.company.TwoPointer;

import java.util.Arrays;

public class ValidTriangleSum {
    public static void main(String[] args) {

    }
    static int validTriangle(int [] arr){
        int ans = 0;
        if(arr.length < 3) {
            return ans;
        }
        Arrays.sort(arr);
        for (int i = 2; i < arr.length; i++) {
            int left = 0;
            int right = i - 1;
            while (left < right){
                if(arr[left] + arr[right] > arr[i]){
                    ans = ans + (right - left);
                    right--;
                }
                else {
                    left++;
                }
            }
        }
        return ans;
    }
}
