package com.company;

public class LinearSearchInString {
    public static void main(String[] args) {
        String name = "Mahendra Pratap Singh";
        char target = 'M';

        System.out.println(search(name , target));

    }
    static boolean search(String str , char target){
        if(str.length() ==0 ){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {

            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
