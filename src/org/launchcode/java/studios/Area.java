package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        radius = in.nextDouble();

        double area = radius * radius * 3.14;

        while (radius < 0) {
            System.out.println("Error:  " + radius + " is a negative number");
            System.out.println("Enter a radius: ");
            radius = in.nextDouble();
        }
            System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
    }
}
