package main.java.ca.nl.cna.ed.christian.barrett.assignment3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * A class that manages Student objects by storing and retrieving them from a file.
 *
 * @author christian.barrett
 */
public class StudentFileManager {

    /**
     * Static Method used to load students from a .txt file.
     *
     * @param file File containing list of student information.
     * @param logStream Stream to print any internal messages to.
     * @return A List of Student objects retrieved from the file.
     * @throws IOException An IOException caused by an error locating/retrieving the file.
     */
    public static List<Student> loadStudents(File file, PrintStream logStream) throws IOException {
        List<Student> students = new ArrayList<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] details = line.split(" ");
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
                        Float.parseFloat(details[6].substring(1)));
                students.add(student);

                logStream.println(details[0] + " " + details[1] + " " + details[2] + " " + details[3] + " " + details[4] + " " + details[5] + " " + details[6]);
            }
        }
        bufferedReader.close();
        fileReader.close();

        logStream.println(students.size() + " Students loaded.");
        return students;
    }

    /**
     * Static Method used to save students to a .txt file.
     *
     * @param students List of Student objects to be written to the file.
     * @param file File to write list of student information to.
     * @param logStream Stream to print any internal messages to.
     * @throws IOException An IOException caused by an error creating/overwriting a file.
     */
    public static void saveStudents(List<Student> students, File file, PrintStream logStream) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Student student : students) {
            bufferedWriter.write(student.toString() + "\n");
        }
        bufferedWriter.close();
        fileWriter.close();
        logStream.println("Students Saved.");
    }
}