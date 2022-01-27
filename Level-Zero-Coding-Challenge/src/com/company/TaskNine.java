package com.company;

public class TaskNine {

    public static void main(String[] args) {
        printVowels("Dear");
    }

    public static void printVowels(String word){

       String str = word.toLowerCase();

        boolean separator = false;

        System.out.print("Vowels: ");

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                if (separator == true)
                    System.out.print(", ");
                System.out.print(str.charAt(i));

                separator = true;
            }

        }
    }
}
