package com.company;
//        Question playlist link
//       https://www.youtube.com/playlist?list=PL90eW1oIajzWF-l3yLlAvAlwK5IPJUMbf

import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class ArrayPlayListQuestion {
    public static void main(String[] args) {
        int arr [] = {6,5,4,3,2,1};
        int [] ar = {1,2,3,4,5,6,7};
        int [] dupi = {6,6,5,4,4,3,3,2,1,1,1};
//        Solution 1
        sortAscending(arr);
        System.out.println(Arrays.toString(arr));
// Solutoin 2
        sortdecending(ar);
        System.out.println(Arrays.toString(ar));

//        Solution 3
        System.out.println(secondLargest(arr));

//        Solution 4
        FindSumAndAvg(arr);
//        Solution 5
        FindOddEven(arr);
//        Solution 6
        removeDuplicates(dupi);
//        Solution 8
        FindIndex(ar,4);

//        Solution 8
        FindElementByUsingIndexValue(ar,1);

//        Solution 10
        MaxDifferBetweenTwoElementOfArray(arr);
//        Solution 11
        MiniSumBetweenTwoElements(arr);
//        Solution 12
        MaxiSumBetweenTwoElement(arr);
//        Solution 13

    }
//    Problem 1
//    How to sort elements of array in ascending order
    static void sortAscending(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    //    Problem 2
//    How to sort elements of array in decending order
    static void sortdecending(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    //    How to find the second largest element in the array
    //    Problem 3
    static int secondLargest(int [] arr){

            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if(arr[i] > arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

        return arr[arr.length - 2];

    }
    //    Problem 4
//    how to find sum and avg of the element of the array
    static void FindSumAndAvg(int [] arr ){
        int sum = 0;
        int length = arr.length;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        float avg = sum/length;
        System.out.println("The sum of the array's elements are " + sum);
        System.out.println("Averge of the array's elements are " + avg);
    }
//    Problem 5
//    How to find the number of even number and odd number in array
    static void FindOddEven(int [] arr){
        int Even = 0;
        int Odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                Even++;
            }
            else {
                Odd++;
            }

        }
        System.out.println("Number of evens in array is " + Even);
        System.out.println("Number of odds in array is " + Odd);
    }
//    Problem 6
//    How to remove the duplicate from the array
    static void removeDuplicates(int [] arr){
        int [] ans = new int[arr.length];
        Arrays.sort(arr);
        int k = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] != arr[i + 1]){
                ans[k++] = arr[i];
            }
        }
        ans[k++] = arr[arr.length - 1];
        for (int i = 0; i < k ; i++) {
            System.out.print(ans[i] + " ");
        }
    }
//   How to find the index of the elements in array




//    Question on hold



//    Problem 7
   static void FindIndex(int [] arr , int target){
       for (int i = 0; i < arr.length; i++) {
           if(arr[i] == target){
               System.out.println(i);
           }
       }
   }

//   Problem 8
//    How To Find The Element Of An Array By Giving Index Position As Input
    static void FindElementByUsingIndexValue(int [] arr , int index){
        for (int i = 0; i < arr.length; i++) {
            if(index == i){
                System.out.println(arr[i]);
            }
        }
    }

//    Problem 10
    static void MaxDifferBetweenTwoElementOfArray(int [] arr){
        int differ = Integer.MIN_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i + 1] - arr[i] > differ);
            differ = arr[i + 1] - arr[i];
        }

        System.out.println(differ);
    }
//    Problem 11
//    How To Find The Minimum Sum between Two Elements
    static void MiniSumBetweenTwoElements(int [] arr){
        Arrays.sort(arr);
        int differ = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i + 1] + arr[i] < differ){
                differ = arr[i + 1] + arr[i];
             }
        }
        System.out.println("Solution of problem 11");
        System.out.print(differ);
    }

//    How To Find The Maximum Sum Between Two Elements Of Array In Java
    static void MaxiSumBetweenTwoElement(int[] arr){
        int differ = Integer.MIN_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i + 1] + arr[i] >differ){
                differ = arr[i + 1 ] + arr[i];
            }
        }
        System.out.println();
        System.out.println("Solution of problem 12");
        System.out.println(differ);

    }
//    Problem 13
//    Removing Duplicates From Unsorted Array In Java

}
