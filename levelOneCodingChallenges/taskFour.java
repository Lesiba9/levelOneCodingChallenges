package com.company;

import java.util.Scanner;

public class taskFour {
    private static Scanner sc;
    public static void main(String[] args)
    {
        int side, i = 1, j;
        sc = new Scanner(System.in);

        System.out.print(" Enter side of a square : ");
        side = sc.nextInt();

        while(i <= side)
        {
            j = 1;
            while(j <= side)
            {
                System.out.print("# ");
                j++;
            }
            i++;
            System.out.print("\n");
        }
    }
}
