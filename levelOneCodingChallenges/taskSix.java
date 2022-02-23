package com.company;
import java.util.Scanner;
import java.util.ArrayList;


public class taskSix {

    public static void main(String args[])
    {
        ArrayList<String> Str = new ArrayList<String>();
        Str.add("the");
        Str.add("quick");
        Str.add("brown");
        Str.add("fox");
        Str.add("ate");
        Str.add("my");
        Str.add("chicken");
        int largestString = Str.get(0).length();
        int index = 0;

        for(int i = 0; i < Str.size(); i++)
        {
            if(Str.get(i).length() > largestString)
            {
                largestString = Str.get(i).length();
                index = i;
            }
        }
        System.out.println(Str.get(index) + " " + "is the largest");

    }

}