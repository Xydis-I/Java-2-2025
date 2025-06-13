package main.java.ca.nl.cna.ed.christian.barrett.assignment3;

/**
 * Class that represents a Student at an educational institution.
 *
 * @author christian.barrett
 */
public class Student {

    public static final String NAME_REGEX = "^[a-zA-Z]+$";
    public static final String STUDENT_NUMBER_REGEX = "^\\d{9}$";
    public static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z0-9.-]+$";
    public static final String PHONE_REGEX = "^[(]?\\d{3}[)]?[ -.]?\\d{3}[-.]?\\d{4}$";
    public static final String CREDIT_REGEX = "^\\d+$";
    public static final String OWING_REGEX = "^\\$\\d+.\\d{2}$";

    private String firstName;
    private String lastName;
    private int studentNumber;
    private String email;
    private String phoneNumber;
    private int creditsAchieved;
    private float balanceOwing;

    /**
     * Constructor for a Student that requires all the fields.
     *
     * @param firstName A String representing the first name of a Student.
     * @param lastName A String representing the last name of a Student.
     * @param studentNumber An int representing the student number.
     * @param email A String representing the email of a Student.
     * @param phoneNumber A String representing the phone number of a Student.
     * @param creditsAchieved An int representing the total credits a student has achieved.
     * @param balanceOwing A float representing the total balance owed by the Student.
     */
    public Student(String firstName, String lastName, int studentNumber, String email, String phoneNumber, int creditsAchieved, float balanceOwing) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.creditsAchieved = creditsAchieved;
        this.balanceOwing = balanceOwing;
    }

    /**
     * Override for the toString() method of the Student object, matches the format used by input and output files.
     *
     * @return A String representing the preferred format for Student details.
     */
    @Override
    public String toString() {
        return firstName + " " + lastName + " " + studentNumber + " " + email + " " + phoneNumber + " " + creditsAchieved + String.format(" $%.2f", balanceOwing);
    }

    /**
     * Method that gets the first name of the Student.
     *
     * @return A String representing the first name of the Student.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Method that sets the first name of the Student.
     *
     * @param firstName A String representing the first name of the Student.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Method that gets the last name of the Student.
     *
     * @return A String representing the last name of the Student.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Method that sets the last name of the Student.
     *
     * @param lastName A String representing the last name of the Student.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Method that gets the student number of the Student.
     *
     * @return An int representing the student number of the Student.
     */
    public int getStudentNumber() {
        return studentNumber;
    }

    /**
     * Method that sets the student number of the Student.
     *
     * @param studentNumber An int representing the student number of the Student.
     */
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    /**
     * Method that gets the email of the Student.
     *
     * @return A String representing the email of the Student.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Method that sets the email of the Student.
     *
     * @param email A String representing the email of the Student.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Method that gets the phone number of the Student.
     *
     * @return A String representing the phone number of the Student.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Method that sets the phone number of the Student.
     *
     * @param phoneNumber A String representing the phone number of the Student.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Method that gets the credits achieved of the Student.
     *
     * @return An int representing the credits achieved of the Student.
     */
    public int getCreditsAchieved() {
        return creditsAchieved;
    }

    /**
     * Method that sets the credits achieved of the Student.
     *
     * @param creditsAchieved An int representing the credits achieved of the Student.
     */
    public void setCreditsAchieved(int creditsAchieved) {
        this.creditsAchieved = creditsAchieved;
    }

    /**
     * Method that gets the balance owing of the Student.
     *
     * @return A float representing the balance owing of the Student.
     */
    public float getBalanceOwing() {
        return balanceOwing;
    }

    /**
     * Method that sets the balance owing of the Student.
     *
     * @param balanceOwing A float representing the balance owing of the Student.
     */
    public void setBalanceOwing(float balanceOwing) {
        this.balanceOwing = balanceOwing;
    }

    /**
     * Method that checks a given name for validity against a REGEX statement.
     *
     * @param name A String representing the name to check for validity.
     * @return A boolean representing the result of the REGEX check.
     */
    public static boolean isValidName(String name) {
        return name.matches(NAME_REGEX);
    }

    /**
     * Method that checks a given student number for validity against a REGEX statement.
     *
     * @param studentNumber A String representing the student number to check for validity.
     * @return A boolean representing the result of the REGEX check.
     */
    public static boolean isValidStudentNumber(String studentNumber) {
        return studentNumber.matches(STUDENT_NUMBER_REGEX);
    }

    /**
     * Method that checks a given email for validity against a REGEX statement.
     *
     * @param email A String representing the email to check for validity.
     * @return A boolean representing the result of the REGEX check.
     */
    public static boolean isValidEmail(String email) {
        return email.matches(EMAIL_REGEX);
    }

    /**
     * Method that checks a given phone number for validity against a REGEX statement.
     *
     * @param phoneNumber A String representing the phone number to check for validity.
     * @return A boolean representing the result of the REGEX check.
     */
    public static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches(PHONE_REGEX);
    }

    /**
     * Method that checks a given credits achieved for validity against a REGEX statement.
     *
     * @param creditsAchieved A String representing the credits achieved to check for validity.
     * @return A boolean representing the result of the REGEX check.
     */
    public static boolean isValidCreditsAchieved(String creditsAchieved) {
        return creditsAchieved.matches(CREDIT_REGEX);
    }

    /**
     * Method that checks a given balance owing for validity against a REGEX statement.
     *
     * @param balanceOwing A String representing the balance owing to check for validity.
     * @return A boolean representing the result of the REGEX check.
     */
    public static boolean isValidBalanceOwing(String balanceOwing) {
        return balanceOwing.matches(OWING_REGEX);
    }
}
