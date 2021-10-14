package com.bridgeLabz;

import java.lang.Math;
public class LineComparision {
    public static void main(String[] args) {
        System.out.println("Welcome to the Line Comparision Computation program");
        double x1=5,x2=6,y1=4,y2=5;
        double length;
        length = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("length of the line : " +length);
    }
}
