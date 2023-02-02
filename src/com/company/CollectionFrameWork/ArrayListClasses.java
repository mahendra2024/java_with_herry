package com.company.CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClasses {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();

        //        This is the most importent topic in java which is used for store the data of unknown size
//        The arrayList autometically increase the size of the List
//        Internally is also used the same concept of the array


        name.add("MAhendra Pratap Singh");
//        Initially when we add the new element  internally it make the array of size 10
//        when we add the 10 elements it will increase the size of it by the formula


//        n + n/2 + 1

//        it means it will make the array of size 16
//        it also cppy the last elements to the new array




//        Now we are going to learn how to add elements in arrayList
//        using the inbuilt function (add)

        name.add("Monu");
        name.add("Mahi");
        name.add("Kanha Bhai");
        name.add("bade bhai");
        System.out.println(name);



//        Now we are learning how to add elements at a particular index in arraylist

        name.add(2,"NIET");
        System.out.println(name);


//        Now we are to create the new list
        ArrayList<String> marks = new ArrayList<>();
        marks.add("22");
        marks.add("44");
        marks.add("24");
        System.out.println(marks);



//        Now we have to merge both list to make the single list

        name.addAll(marks);
        System.out.println(name);


//        lets start the getting the elements from the arraylist
        System.out.println(name.get(3));
        System.out.println(name.get(1));
        System.out.println(name.get(6));
        System.out.println(marks.get(0));


//        Now we going to remove the elements from the list by index value

        System.out.println(name);
        name.remove(2);
        System.out.println(name);

//        Removing the elements from the arrayList using the value
        name.remove(String.valueOf("44"));
        System.out.println(name);





//        Let we talk some about the time complexcity of the insertion operation delete opertion and all
//        these all operation take the O(n) time
//        Now  you are talling that why it take O(n) time we don't  use the for loop
//        you are right we don't use the for loop but when we insert the element at the certain position then all
//        other element have to shift in backward direction
//        if we delete the elements from the arraylist then all elements have to shift in forword direction
//        so that's why we have it take the O(n) time complexcity




//        if we want to update the value of any element in arraylist then we have to function called set
        System.out.println(name);


//        the time complexcity of SET  function is O(1)
//        because it goes that particular index and updates it's value
        name.set(2,"2000");
        System.out.println(name);


        System.out.println(name.contains(2));

//        the time complexcity of the CONTAINS function is  O(n)
//        it check the elements one by one








//        Now we are going to iterate the arraylist
//        There are three ways by which we can iterate the arrayList

//        1st way
        for (int i = 0; i < name.size(); i++) {
            System.out.println("The element of the list is " + name.get(i));
        }



//        2nd way
        for (String element: name) {
            System.out.println("Foreach elements of the list name is " + element);

        }


//        3rd way
        Iterator<String> it = name.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


//        the 1st and 2nd ways are good for iterator














//        if we want to clear all the elements of the arraylist
//        then we have the fuction of clear all
        name.clear();
        System.out.println(name);
    }
}
