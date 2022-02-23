package com.company;
import java.util.*;

public class taskTwo {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = in.nextInt();
        System.out.print("Input the second number: ");
        int y = in.nextInt();
        System.out.print("The result is: "+ isThree(x, y));
        System.out.print("\n");
    }

    public static boolean isThree(int p, int q)
    {
        int r = 3;

        return ((p + q) == r && (q + r) == p && (r + p) == q);
    }
}
