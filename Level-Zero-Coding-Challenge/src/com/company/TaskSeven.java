package com.company;

public class TaskSeven {
    public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(27));
    }

    public static double celsiusToFahrenheit(double temp){

        return (temp * 9 / 5) + 32;
    }

    public double fahrenheitToCelsius(double temp) {

        return (temp - 32) * 5 / 9;
    }
}
