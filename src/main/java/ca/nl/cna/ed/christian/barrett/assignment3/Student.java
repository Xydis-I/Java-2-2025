package main.java.ca.nl.cna.ed.christian.barrett.assignment3;

public class Student {

    public static final String NAME_REGEX = "^[a-zA-Z]+$";
    public static final String STUDENT_NUMBER_REGEX = "^\\d{8}$";
    public static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z0-9.-]+$";
    public static final String PHONE_REGEX = "^\\d{3}-\\d{3}-\\d{4}$";
    public static final String CREDIT_REGEX = "^\\d+$";
    public static final String OWING_REGEX = "^\\$\\d+.\\d{2}$";

    //TODO Create the student class

        /*
    •	First Name
    •	Last Name
    •	Student Number
    •	Email
    •	Phone Number
    •	Course Credits Achieved
    •	Balance Owing ($)
     */

    private String firstName;
    private String lastName;
    private int studentNumber;
    private String email;
    private String phoneNumber;
    private int creditsAchieved;
    private float balanceOwing;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getCreditsAchieved() {
        return creditsAchieved;
    }

    public void setCreditsAchieved(int creditsAchieved) {
        this.creditsAchieved = creditsAchieved;
    }

    public float getBalanceOwing() {
        return balanceOwing;
    }

    public void setBalanceOwing(float balanceOwing) {
        this.balanceOwing = balanceOwing;
    }

    //TODO isValidX Methods

    public static boolean isValidName(String name) {
        return name.matches(NAME_REGEX);
    }

    public static boolean isValidStudentNumber(String studentNumber) {
        return studentNumber.matches(STUDENT_NUMBER_REGEX);
    }

    public static boolean isValidEmail(String email) {
        return email.matches(EMAIL_REGEX);
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches(PHONE_REGEX);
    }

    public static boolean isValidCreditsAchieved(String creditsAchieved) {
        return creditsAchieved.matches(CREDIT_REGEX);
    }

    public static boolean isValidBalanceOwing(String balanceOwing) {
        return balanceOwing.matches(OWING_REGEX);
    }
}
