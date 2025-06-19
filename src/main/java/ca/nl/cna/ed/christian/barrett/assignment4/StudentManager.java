package main.java.ca.nl.cna.ed.christian.barrett.assignment4;

import java.util.List;

public class StudentManager {

    public static void SortByCredits(List<Student> students) {
        students.sort((x,y) -> x.getCreditsAchieved() - y.getCreditsAchieved());
    }

    public static void SortByLastName(List<Student> students) {
        students.sort((x,y) -> x.getLastName().compareTo(y.getLastName()));
    }

    public static List<Student> OutstandingBalance(List<Student> students) {
        return students.stream().filter(student -> student.getBalanceOwing() > 0).toList();
    }
}
