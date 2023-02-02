package com.company.BinarySearch;

public class BinaryCailingQues {
     public static void main(String[] args) {
//         This code for cailing question
        int [] nums = {2,3,44,55,66,77,88,99,111,222,333};
        int tar = 67;
        int ans = cailing(nums,tar);
        System.out.println(ans);
//        This code for floor question
        int [] numbers = {22,33,44,55,66,77,88,222,333,444,555,666};
        int tarr = 76;
        int result = floorQuestion(numbers,tarr);
        System.out.println(result);

    }
//    In this question we have to find the value which is smallest greater or equal to target value
    static int cailing(int [] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end ){
            int mid = start + (end - start)/2;

            if(arr[mid] < target){
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
//    In this question we have to find the value greatest smaller  or equal value to the target value
    static int floorQuestion(int [] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] < target){
                start = mid + 1;

            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
// find the index of the target value at first and last position in given array

}
