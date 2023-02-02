package com.company.Recursion;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,6,6,7,8,9};
        System.out.println(sorted(a , 0));
        System.out.println(linearSearch(a,9,0));
        System.out.println(linearIndex(a,1,0));
        System.out.println(linearFindIndexFromLast(a , 4,8));
        System.out.println(FindAllIndex(a,6,a.length - 1));

    }



//    In recursion we have simple make the problem into smaller problem the we get the oraginal answer
//    by using the recursion call




//    In recursion we dont need to solve the whole problem we just need to find out the smaller problem
//    that's it simple



//    let us check the array is sorted or not using recursive call
    static boolean sorted(int [] arr ,int  index){
        if(index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index + 1]  && sorted(arr, index + 1);
    }


//    Linear search using recursion
//    this is the simplest concept that we have ever seen in DSA


    static boolean linearSearch(int [] arr , int target , int index){
        if(index == arr.length){
            return false;
        }

        return target == arr[index] || linearSearch(arr,target,index + 1);
    }

//    find the index value of the target
    static int linearIndex(int [] arr , int target , int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return linearIndex(arr,target,index + 1);

    }



//    find the index from the last of the array
//    return the index value
    static int  linearFindIndexFromLast(int [] arr , int target , int index){
        if(index == -1){
            return -1;
        }
        if(target == arr[index]){
            return index;
        }
        return linearFindIndexFromLast(arr,target,index - 1);

    }


//    In the above aproch we want to take all the index value
//    How we can do it
//    we can do it by using the arraylist


    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> FindAllIndex(int [] arr , int target , int index){
        if(index == -1){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        FindAllIndex(arr,target,index - 1);
        return list;
    }
}
