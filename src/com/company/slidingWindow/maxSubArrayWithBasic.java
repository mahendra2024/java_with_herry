package com.company.slidingWindow;

public class maxSubArrayWithBasic {
    public static void main(String[] args) {
        int [] arr = {100, 200, 300, 400};

        System.out.println(MaxSubArrayWithK(arr , 2));
    }


//    First of all  we have to take two parameter  equal to zero then we have  reached at the atmost
//    size of the window then we have to maintain it
//    then  we have to check our condition then we can do our calculation  and then match our answer





    static int MaxSubArrayWithK(int [] arr , int k){
        int ans = 0;
        int i = 0;
        int j = 0;
        int sum = 0;
        while( j < arr.length){
            sum = sum + arr[j];
            if(j - i + 1 == k){
                ans = Math.max(ans , sum);
                sum = sum - arr[i];
                i++;
                j++;
            }

        }

        return ans;
    }
}
