package com.company;

public class TaskEight {

    public void timeConversion(int number){

        int hours = number / 60;
        int minutes = number % 60;

        if(hours != 1 && minutes != 1)
            System.out.println(hours + " hours, " + minutes + " minutes");

        else if(hours != 1 && minutes == 1)
            System.out.println(hours + " hours, " + minutes + " minute");

        else if(hours == 1 && minutes > 1)
            System.out.println(hours + " hour, " + minutes + " minutes");

        else if(hours == 1 && minutes < 1)
            System.out.println(hours + " hour, ");

        else if(hours != 1 && minutes < 1)
            System.out.println(hours + " hours, ");

        else
            System.out.println(hours + " hour, " + minutes + " minute");
    }
}
