package main.java.ca.nl.cna.ed.christian.barrett.assignment3;

import java.io.File;
import java.io.PrintStream;
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

    public static List<Student> loadStudents(File file, PrintStream logStream){
        List<Student> students = new ArrayList<Student>();

        //Note: do not handle any exceptions, only throw them

        //Open the file (use a FileReader and a Buffer) if there is an issue through an exception
        //Look at the FunWithBufferedReader example
        //Loop through all the lines in the file
        //Check the data is valid and if so, create the student and add it to the list
        //If any data is maybe print it during test but print the summary at the end to the logStream
        //Close out the file


        return students;
    }

    public static void saveStudents(List<Student> students, File file, PrintStream logStream){
        //Open the file
        //Loop through the list and print to the file
        //Close the file

    }

}
