package com.company.CollectionFrameWork;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearningSet {
    public static void main(String[] args) {
//        In the set data we can'nt insert the duplicate elements
//        In the set order does'nt matter
//        when we print the  set it print the value of the set in  random order


        Set<Integer> set = new HashSet<>();


//        The time complexcity of each and every function in set have the time complexcity O(1)
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(26);
        set.add(21);
        set.add(232);
        System.out.println(set);

        set.remove(3);
        System.out.println(set);

        System.out.println(set.size());
        System.out.println(set.contains(2));
        System.out.println(set.isEmpty());




        Set<Integer> set1 = new LinkedHashSet<>();
//        The linkedhashSet is same as the hashSet
//        so why we use it
//        because here the order in which we have insert the item are matter
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(26);
        set1.add(21);
        set1.add(232);
        System.out.println(set1);

        set1.remove(3);
        System.out.println(set1);

        System.out.println(set1.size());
        System.out.println(set1.contains(2));
        System.out.println(set1.isEmpty());


//


        Set<Integer> set2 = new TreeSet<>();




//        The time complexity of each and every function in TreeSet have the time complexity O(log(n))




//        This is same as the SET data structure with the implementation of tree data structure
//        here all the elements are stored in sorted form
//        rest of all other think are same
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(26);
        set2.add(21);
        set2.add(232);
        System.out.println(set2);

        set2.remove(3);
        System.out.println(set2);

        System.out.println(set2.size());
        System.out.println(set2.contains(2));
        System.out.println(set2.isEmpty());


    }
}
