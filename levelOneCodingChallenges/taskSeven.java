package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class taskSeven {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] list1 = in.nextLine().split(",");

        String[] list2 = in.nextLine().split(",");

        ArrayList<String> combine = new ArrayList<>();
        for (int i = 0; i < Math.max(list1.length, list2.length); i++) {
            combine.add(list1[i]);
            combine.add(list2[i]);
        }
        System.out.println(String.join(",", combine));
    }
}

