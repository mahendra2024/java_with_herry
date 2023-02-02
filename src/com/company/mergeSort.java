package com.company;

public class mergeSort {
    public static void main(String[] args) {

    }
    static void divided(int [] arr , int start ,int end){
        if(start >= end){
        return;
    }
    int mid  = start + (end - start)/2;
    divided(arr, start,mid);
    divided(arr,mid+1,end);
    }
    static int [] merge(int [] arr , int start ,int mid , int end){
        int [] merge = new int[start + end + 1];

        return merge;
    }
}