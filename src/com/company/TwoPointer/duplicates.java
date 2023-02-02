package com.company.TwoPointer;

public class duplicates {
    public static void main(String[] args) {
        int [] arr = {1,1,1,2,2,2,3,3,4,4,4};
        int [] a = {};
        System.out.print(RemoveDuplicates(arr));

    }

    static int RemoveDuplicates(int [] nums){

//        Question Link
//        https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/876013098/


        if(nums.length == 0){
            return 0;
        }
        int i = 0;
        for (int j = i + 1; j < nums.length; j++) {
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];

            }

        }
        return i + 1;
    }

}
