package main.java.ca.nl.cna.ed.christian.barrett.assignment4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Test application that demonstrates the assignments' functionality.
 *
 * @author christian.barrett
 */
public class MainApplication {

    public static void main(String[] args) {
        System.out.println("Fun with Student Database");

        File inputFile = new File("");
        while (!inputFile.exists()) {
            System.out.print("Enter File Path to Load: ");
            String filePath = System.console().readLine();
            inputFile = new File(filePath);
        }

        List<Student> students = new ArrayList<>();

        try {
            students = StudentFileManager.loadStudents(inputFile, System.out);
        } catch (IOException e) {
            System.out.println("Error loading students from file.");
        }

        System.out.println("""
                
                cred - Sort by Course Credits.
                name - Sort by Last Name.
                owed - Filter for Balance Owing.
                """);

        System.out.print("Select an option: ");
        String menuOption = System.console().readLine();

        switch (menuOption) {
            case "cred" -> {
                System.out.println("Sorted by Course Credits.");
                StudentManager.SortByCredits(students);
                for (Student student : students) {
                    System.out.println(student);
                }

            }
            case "name" -> {
                System.out.println("Sorted by Last Name.");
                StudentManager.SortByLastName(students);
                for (Student student : students) {
                    System.out.println(student);
                }
            }
            case "owed" -> {
                System.out.println("Filtered for Balance Owing.");
                students = StudentManager.OutstandingBalance(students);
                for (Student student : students) {
                    System.out.println(student);
                }
            }
            default -> System.out.println("Invalid option.");
        }

        System.out.print("Enter File Path to Save: ");
        String outputName = System.console().readLine();
        File outputFile = new File(outputName);
        try {
            StudentFileManager.saveStudents(students, outputFile, System.out);
        } catch (IOException e) {
            System.out.println("Error saving students into file.");
        }
    }

    public static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.printf("%s \n", student.getFirstName());
        }
    }
}
