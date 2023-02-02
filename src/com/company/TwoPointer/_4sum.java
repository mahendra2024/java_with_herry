package com.company.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _4sum {
    public static void main(String[] args) {
        int [] arr = {10,2,3,4,5,7,8};
        FourSumProblem(arr, 23);

    }
    static List<List<Integer>> FourSumProblem(int [] arr , int target){

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 3; i++) {

            if( i != 0 && arr[i] == arr[i + 1]){
                continue;
            }

            for (int j = i + 1; j < arr.length - 2; j++) {

                if(j != 0 && arr[j] == arr[j + 1]){
                    continue;
                }

                int left = j + 1;
                int right = arr.length - 1;
                while (left < right){
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    if(sum < target){
                        left++;
                    }
                    else if(sum > target){
                        right--;
                    }
                    else {
                        List<Integer> combination = new ArrayList<>();
                        combination.add(arr[i]);
                        combination.add(arr[j]);
                        combination.add(arr[left]);
                        combination.add(arr[right]);
                        ans.add(combination);
                        left++;
                        right--;

                        while (left < right && arr[left] == arr[left + 1]){
                            left++;

                        }
                        while (left < right && arr[right] == arr[right - 1]){
                            right--;
                        }

                    }
                }
            }
        }
        System.out.println(ans);
        return ans;
    }
}
