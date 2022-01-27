package com.company;

public class TaskFour {
    public static void main(String[] args) {
        EvenOrOdd(9);
    }

    public static void EvenOrOdd(int num){

        double remainder = num % 2;

        if (remainder != 0)
            System.out.println("Odd");
        else
            System.out.println("Even");
    }
}
