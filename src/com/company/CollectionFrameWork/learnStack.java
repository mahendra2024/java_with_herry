package com.company.CollectionFrameWork;

import java.util.Stack;

public class learnStack {
    public static void main(String[] args) {



//        The stack work on first in last out







        Stack<String> animal = new Stack<>();


//        Basically the stack has the three main funnction which are widely used in coding
//        PUSH
//        POP
//        PEEK



//        basically the push operation is used to add the elements in the stack

//        Adding the in the stack by using the function PUSH
        animal.push("humans");
        animal.push("cow");
        animal.push("dog");
        animal.push("cat");


//        printing the elements of the stack
        System.out.println(animal);


//        it's time to get the element from our stack
//        to get the elements of the stack we have the  function PEEK
//        by which we can seen the peek element or top most elements of the stack
        System.out.println(animal.peek());


//        Now we have to remove the element from the stack
//        by using the operation POP
        System.out.println(animal.pop());
        System.out.println(animal);

        System.out.println(animal.pop());
        System.out.println(animal);



//         The time complexity for any operation doesn't depend on the number of
//         time you call that function it depends on the input (n).

//        The time complexity of push operation in a stack for array based implementation -
//        best case: o(1) worst case: o(n) // when array becomes full average case: o(1)
//
//push(x) operation has average case time complexity o(1) which doesn't depend on how many times you call.
//
//2) similarly pop() operation has o(1) time complexity for every case which doesn't depend on
// how many times you call that function.





    }
}
