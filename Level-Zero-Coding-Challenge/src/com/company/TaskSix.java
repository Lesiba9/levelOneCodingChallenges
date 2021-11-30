package com.company;

public class TaskSix {

    public double maximumNumber(double ... numbers){

        double max = 0;

        for (double number : numbers){

            if (number > max)
                max = number;
        }

        return max;
    }
}
