package exercises;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;


        System.out.println("Enter your name: ");
        name = in.next();
        System.out.println("Hello, " + name);
    }
}

