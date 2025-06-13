package main.java.ca.nl.cna.ed.christian.barrett.assignment3;

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
            System.out.println(e.getMessage());
            System.out.println("Error loading students from file.");
        }

        System.out.println("""
                add - Add a new student to the list.
                del - Remove a student form the list.
                mod - Modify a student""");
        System.out.print("Select an option: ");
        String menuOption = System.console().readLine();

        switch (menuOption) {
            case "add" -> {
                System.out.print("Add a New Student: ");
                String newStudent = System.console().readLine();
                String[] details = newStudent.split(" ");
                Student student = new Student(details[0],
                        details[1],
                        Integer.parseInt(details[2]),
                        details[3],
                        details[4],
                        Integer.parseInt(details[5]),
                        Float.parseFloat(details[6].substring(1)));
                students.add(student);
            }
            case "del" -> {
                System.out.print("Remove a Student (1-" + students.size() + "): ");
                int studentIndex = Integer.parseInt(System.console().readLine()) - 1;
                students.remove(studentIndex);
            }
            case "mod" -> {
                System.out.print("Modify a Student (1-" + students.size() + "): ");
                int studentIndex = Integer.parseInt(System.console().readLine()) - 1;
                Student student = students.get(studentIndex);
                System.out.println("Current: " + student.toString());
                System.out.print("Updated: ");
                String[] details = System.console().readLine().split(" ");
                Student newStudent = new Student(details[0],
                        details[1],
                        Integer.parseInt(details[2]),
                        details[3],
                        details[4],
                        Integer.parseInt(details[5]),
                        Float.parseFloat(details[6].substring(1)));
                students.set(studentIndex, newStudent);
            }
            default -> System.out.println("Invalid option.");
        }

        System.out.print("Enter File Path to Save: ");
        String outputName = System.console().readLine();
        File outputFile = new File(outputName);
        try {
            StudentFileManager.saveStudents(students, outputFile, System.out);
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("Error saving students into file.");
        }
    }

    public static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.printf("%s \n", student.getFirstName());
        }
    }
}
