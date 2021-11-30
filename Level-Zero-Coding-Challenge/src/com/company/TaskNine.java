package com.company;

public class TaskNine {

    public void printVowels(String word){

        String str = word.toLowerCase();


        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                System.out.print(" " + str.charAt(i));
            }
        }
    }
}
