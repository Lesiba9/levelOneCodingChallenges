package com.company;

public class TaskTen {
    public static void main (String[] args) {
        printCommon("Lesiba", "Masenya");
    }

    public static void printCommon(String str1, String str2) {

        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();

        boolean separator = false;

        System.out.print("Common letters: ");

        for (char first : charArray1)
            for (char second : charArray2)
                if (first == second) {
                    if (separator == true)
                        System.out.print(", ")
                                ;
                    System.out.print(first);

                    separator = true;
                }
        System.out.println();
    }
}