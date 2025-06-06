package main.java.ca.nl.cna.ed.christian.barrett.assignment3;

public class Student {

    public static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z0-9.-]+$";

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


    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //TODO isValidX Methods

    public static boolean isValidEmail(String email) {
        return email.matches(EMAIL_REGEX);
    }
}
