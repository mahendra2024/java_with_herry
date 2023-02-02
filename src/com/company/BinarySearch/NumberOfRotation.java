package com.company.BinarySearch;

public class NumberOfRotation {
    public static void main(String[] args) {
        int [] arr = {5,1,2,3,4};
        int s=0;
        int e=4;
        int result=Number(arr, s, e);
        System.out.println(result);

    }


//    To find the number of rotation we just need to find the number index of the minimum element
//    for confirm this statement u just need to write it on paper
    static int Number_of_rotation(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while ( start <= end){
            int mid = start + (end - start) / 2 ;
            int pev = (mid - 1)  % arr.length;
            int next = (mid + 1) % arr.length;
            if(arr[mid] <= arr[pev] && arr[mid] <= arr[next]){
                return mid;
            }
            else if(arr[mid] > arr[start]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
  static int Number(int []arr,int s,int e){
    int mid=(s+e)/2;
    while(s<e){
        if(arr[mid]>=arr[0]){
            s=mid+1;
        }else{
            e=mid;
        }
        mid=(s+e)/2;

    }
    return s;
    }

}

