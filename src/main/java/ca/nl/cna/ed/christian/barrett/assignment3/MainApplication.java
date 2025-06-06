package main.java.ca.nl.cna.ed.christian.barrett.assignment3;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MainApplication {

    public static void main(String[] args) {
        System.out.println("Fun with Student Database");

        //TODO Start the program and find the input file and load
        //TODO replace this file name with input after testing
        File testingInputFile = new File("studentsin.txt");
        List<Student> students = StudentFileManager.loadStudents(testingInputFile, System.out);

        students = loadTestStudents();

        //TODO Print the students
        //TODO Build interactive part of the program - show, add, remove, modify Students in List
        //This is a loop through the student list
        printStudents(students);


        //TODO End the program and save the output file
        File testingOutputFile = new File("studentsout.txt");
        StudentFileManager.saveStudents(students, testingOutputFile, System.out);
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
