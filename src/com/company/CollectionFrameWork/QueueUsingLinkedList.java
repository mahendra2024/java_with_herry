package com.company.CollectionFrameWork;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingLinkedList {
    public static void main(String[] args) {

//        The Queue data struture is used to work on the function of FIRST IN FIRST OUT
        Queue<Integer> nums = new LinkedList<>();


//        Here we implement the queue using the linkedlist
//        in this implimentation we have three function OFFFER , POLL , PEEK


//        let us talk about these all function


//        implementation of function OFFER
//        Basically the OFFER function add the elements in the queue
        nums.offer(3);
        nums.offer(2);
        nums.offer(33);
        nums.offer(34);
        nums.offer(37);
        nums.offer(13);
        System.out.println(nums);



//        POLL OPERATION
        System.out.println(nums.poll());
//        This function will tell us which elements are removing from the queue






//        PEEK OPERATION
        System.out.println(nums.peek());
//        The PEEK function we tell us which is the next element have to go outside from the queue



//        There are three more function other then above discause
//        These are not use so much
//        so that's why we are not discause here



//        add,remove,element
//        this is the name of that function whick i have told you above
    }
}
