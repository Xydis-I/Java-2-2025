package main.java.ca.nl.cna.ed.christian.barrett.assignment4;

import java.util.List;

/**
 * Class containing static methods used to sort Student Objects.
 *
 * @author christian.barrett
 */
public class StudentManager {

    /**
     * Static method used to sort a List&lt;Student&gt; by the creditsAchieved property.
     *
     * @param students List&lt;Student&gt; to be sorted.
     */
    public static void SortByCredits(List<Student> students) {
        students.sort((x,y) -> x.getCreditsAchieved() - y.getCreditsAchieved());
    }

    /**
     * Static method used to sort a List&lt;Student&gt; by the lastName property.
     *
     * @param students List&lt;Student&gt; to be sorted.
     */
    public static void SortByLastName(List<Student> students) {
        students.sort((x,y) -> x.getLastName().compareTo(y.getLastName()));
    }

    /**
     * Static method used to filter a List&lt;Student&gt; for balanceOwing greater than 0.
     *
     * @param students List&lt;Student&gt; to be sorted.
     * @return A new filtered List&lt;Student&gt;.
     */
    public static List<Student> OutstandingBalance(List<Student> students) {
        return students.stream().filter(student -> student.getBalanceOwing() > 0).toList();
    }
}
