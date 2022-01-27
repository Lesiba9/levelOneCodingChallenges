package com.company;

public class TaskSix {
    public static void main(String[] args) {
       System.out.println(maximumNumber(2,5,5,4,8,8));
    }
    public static double maximumNumber(double... numbers){

        double max = 0;

        for (double number : numbers){

            if (number > max)
                max = number;
        }

        return max;
    }
}
