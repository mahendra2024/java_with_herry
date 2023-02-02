package com.company;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {6, 4, 3, 8, 5, 2, 99};
        int target = 5678;
        int ans = linearSearch(nums, target);
        int anss = linearSearchInRange(nums, 99, 3, 7);
        int [] gfg = {28 ,43 ,26 ,65 ,60 ,54 ,51 ,35 ,42 ,48 ,33 ,40 ,58, 38 ,64 ,47 ,44 ,49 ,46 ,25 ,57, 39 ,
                55 ,45 ,29 ,32 ,61 ,53 ,31, 36 ,56, 63 ,30 ,52 ,27 ,34, 50 ,41 ,37 ,66 ,62 ,59};

        findSecondLargest(gfg);


//        System.out.println(ans);
//        System.out.println(anss);

//        System.out.println(findMini(nums));
//        System.out.println(findMax(nums));


    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int elements = arr[i];
            if (elements == target) {
                return elements;
            }
        }
        return -1;
    }

    static int linearSearchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;

        }
        for (int i = start; i < end; i++) {
            int elements = arr[i];
            if (elements == target) {
                return elements;
            }
        }
        return -1;
    }

    static int findMini(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (ans > arr[i]) {
                ans = arr[i];

            }
        }
        return ans;
    }

    static int findMax(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (ans < arr[i]) {
                ans = arr[i];

            }
        }
        return ans;
    }

//    find second largest elements in array
    static int findSecondLargest(int [] arr){

            // code here
            for(int i = 0 ; i <arr.length ; i++){
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[j] > arr[i]){
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] =  temp;
                    }

                }

            }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        return arr[1];
        }
}
