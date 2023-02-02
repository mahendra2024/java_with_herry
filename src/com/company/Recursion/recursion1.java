package com.company.Recursion;

public class recursion1 {
//    what is recursion
//    fun that call itself      that is called recursion



//    In recursion we should always put the base condition to come out the function call at the certain
//    point where are program is stop.


//    for every function call that we make takes the separate memory for it


//    when we call a function again and again    it was treated as different function and it also take the diffent
//    memory in stack


//    if there is no base condition
//    it will going keep going keep going infinetely
//    when computer's memory is full it will give u an error stack over flow



//    why recursion is used
//    To solve the bogger /complex problem into the simple or easy to solve it

//    you can also convert the recursion into the iteration and vice versa

//     The space complexcity is not constant because of recursive call
//    It helps us to break down the bigger problem into small problem
    public static void main(String[] args) {
        nNumber(1);
        int ans  = fibonacci(8);
        System.out.println(ans);

    }
//    fun to print n number using recursion
    static void nNumber(int n){
        System.out.println(n);
        if(n == 9){
            System.out.println(9);
            return;
        }
        nNumber(n + 1);
    }

    static int fibonacci(int n){
        if(n < 2){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
