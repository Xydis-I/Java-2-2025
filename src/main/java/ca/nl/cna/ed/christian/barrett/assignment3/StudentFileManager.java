package main.java.ca.nl.cna.ed.christian.barrett.assignment3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * A class that manages Student objects that stores (and retrieves data) in the following format:
 * File structure:
 * Josh Taylor 18298394 josh.taylor@cna.nl.ca 709-555-5555 12 $562.00
 * John Doe 18298395 john.doe@cna.nl.ca 709-555-5555 7 $0.00
 * ....
 *
 * All variables are seperated by a space
 */
public class StudentFileManager {

    public static List<Student> loadStudents(File file, PrintStream logStream) throws IOException {
        List<Student> students = new ArrayList<Student>();

        //Note: do not handle any exceptions, only throw them

        //Open the file (use a FileReader and a Buffer) if there is an issue through an exception
        try (
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            String line;
            //Loop through all the lines in the file
            while ((line = bufferedReader.readLine()) != null) {
                String[] details = line.split(" ");
                //Check the data is valid and if so, create the student and add it to the list
                if (Student.isValidName(details[0])
                        && Student.isValidName(details[1])
                        && Student.isValidStudentNumber(details[2])
                        && Student.isValidEmail(details[3])
                        && Student.isValidPhoneNumber(details[4])
                        && Student.isValidCreditsAchieved(details[5])
                        && Student.isValidBalanceOwing(details[6])) {

                    Student student = new Student(details[0],
                            details[1],
                            Integer.parseInt(details[2]),
                            details[3],
                            details[4],
                            Integer.parseInt(details[5]),
                            Integer.parseInt(details[6].substring(1)));
                    students.add(student);

                    //If any data is maybe print it during test but print the summary at the end to the logStream
                    logStream.println(details[0] + " " + details[1] + " " + details[2] + " " + details[3] + " " + details[4] + " " + details[5] + " " + details[6]);
                } else {
                    logStream.println("Invalid Student Details.");
                }
            }
        }
        //Close out the file

        logStream.println(students.size() + " Students loaded.");
        return students;
    }

    public static void saveStudents(List<Student> students, File file, PrintStream logStream) throws IOException {
        //Open the file
        //Loop through the list and print to the file
        //Close the file

        try (
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ){
            for (Student student : students) {
                bufferedWriter.write(student.toString());
            }
        }
        logStream.println("Students Saved.");
    }

}
