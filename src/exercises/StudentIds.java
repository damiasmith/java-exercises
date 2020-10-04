package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentIds {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Integer newStudent;

        System.out.println("Enter your student id (or ENTER to finish):");

        // Get student names and grades
        do {
            System.out.print("Student Id: ");
            newStudent = in.nextInt();

            if (in.nextLine().equals(null)) continue;

            else if (!newStudent.equals("")) {
                System.out.print("Student Name: ");
                String newStudentName = in.nextLine();
                students.put(newStudent, newStudentName);
//                System.out.print(newStudent);

                // Read in the newline before looping back
                in.nextLine();
            }

        } while(!in.nextLine().equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }
}
