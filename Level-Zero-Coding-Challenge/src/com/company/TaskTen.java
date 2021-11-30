package com.company;

public class TaskTen {

    static final int MAX_CHAR = 26;

    static void printCommon(String firstWord, String secondWord)
    {

        int[] a1 = new int[MAX_CHAR];
        int[] a2 = new int[MAX_CHAR];

        int length1 = firstWord.length();
        int length2 = secondWord.length();

        for (int x = 0 ; x < length1 ; x++)
            a1[firstWord.charAt(x) - 'a'] += 1;

        for (int x = 0 ; x < length2 ; x++)
            a2[secondWord.charAt(x) - 'a'] += 1;

        // Check for common index
        for (int x = 0 ; x < MAX_CHAR ; x++)
        {
            if (a1[x] != 0 && a2[x] != 0)
            {
                for (int y = 0 ; y < Math.min(a1[x], a2[x]) ; y++)
                    System.out.print(((char)(y + 'a')));
            }
        }
    }
}
