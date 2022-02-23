package com.company;
import java.util.*;

public class taskThree {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = in.nextInt();
        System.out.print("Input the second number: ");
        int y = in.nextInt();
        System.out.print("The result is: "+ isSixtyFive(x, y));
        System.out.print("\n");
    }

    public static boolean isSixtyFive(int p, int q)
    {
        int r = 65;

        return ((p + q) == r || (q + r) == p || (r + p) == q);
    }
}
