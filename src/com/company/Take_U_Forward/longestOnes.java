package com.company.Take_U_Forward;

public class longestOnes {
    public static void main(String[] args) {

    }
    static int longestOnes(int [] nums){

//        Question Link
//        https://leetcode.com/problems/max-consecutive-ones/submissions/876025848/

        int ans = 0;
        int current = 0;
        for (int i = 0; i < nums.length - 1 ; i++) {
            if(nums[i] == 1){
                current++;
            }
            else{
                current = 0;
            }
            ans = Math.max(ans , current);

        }

        return ans;
    }
}
