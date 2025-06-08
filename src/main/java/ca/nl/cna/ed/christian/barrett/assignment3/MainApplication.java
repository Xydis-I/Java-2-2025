package main.java.ca.nl.cna.ed.christian.barrett.assignment3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainApplication {

    public static void main(String[] args) {
        System.out.println("Fun with Student Database");

        //TODO Start the program and find the input file and load
        //TODO replace this file name with input after testing
        File testingInputFile = new File("studentsin.txt");
        List<Student> students = new ArrayList<>();

        try {
            students = StudentFileManager.loadStudents(testingInputFile, System.out);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Error loading students from file.");
        }

        //students = loadTestStudents();

        //TODO Print the students
        //TODO Build interactive part of the program - show, add, remove, modify Students in List
        //This is a loop through the student list
        printStudents(students);


        //TODO End the program and save the output file
        File testingOutputFile = new File("studentsout.txt");
        try {
            StudentFileManager.saveStudents(students, testingOutputFile, System.out);
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("Error saving students into file.");
        }
    }

    public static void printStudents(List<Student> students) {
        //TODO ask josh to do this with a Lambda after we cover the next chapter ;)
        for (Student student : students) {
            //TODO add the other attributes
            System.out.printf("%s \n", student.getFirstName());
        }
    }

    //For debugging purposes
    public static List<Student> loadTestStudents(){
        List<Student> students = new ArrayList<>();
        Student student = new Student();
        student.setFirstName("John");
        students.add(student);
        student = new Student();
        student.setFirstName("Jane");
        students.add(student);
        return students;
    }

}
