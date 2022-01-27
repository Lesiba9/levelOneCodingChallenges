package com.company;

public class TaskFive {
    public static void main(String[] args) {
        System.out.println(areaOfATriangle(67.5,45.2,20));
    }

    public static double areaOfATriangle(double length, double width, double height){

        double s;
        double area;

        s = 0.5 * (length + width + height);

        area = Math.sqrt(s * (s - length) * (s - width)
                * (s - height));

        return area;
    }
}
