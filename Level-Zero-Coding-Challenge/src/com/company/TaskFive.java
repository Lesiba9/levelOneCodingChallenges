package com.company;

public class TaskFive {

    public double areaOfATriangle(double length,double width,double height){

        double s;
        double area;

        s = 0.5 * (length + width + height);

        area = Math.sqrt(s * (s - length) * (s - width)
                * (s - height));

        return area;
    }
}
