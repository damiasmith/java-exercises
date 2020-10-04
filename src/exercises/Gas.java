package exercises;

import java.util.Scanner;

public class Gas {
    public static void main(String[] args){
        double gallons;
        double miles;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter gallons of gasoline used: ");
        gallons = in.nextDouble();
        System.out.println("Enter miles traveled: ");
        miles = in.nextDouble();

        double mpg = miles/gallons;

        System.out.println("Miles per gallon: " + mpg);
    }
}
