package exercises;

import java.util.Scanner;

public class Rectangle {
        public static void main(String[] args) {
            double height;
            double width;
            Scanner in = new Scanner(System.in);

            System.out.println("Enter the height: ");
            height = in.nextDouble();
            System.out.println("Enter the width: ");
            width = in.nextDouble();

            double area = height * width;

            System.out.println("Area: " + area);
        }
}
