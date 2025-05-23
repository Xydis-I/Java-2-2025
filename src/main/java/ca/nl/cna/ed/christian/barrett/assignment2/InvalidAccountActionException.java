package main.java.ca.nl.cna.ed.christian.barrett.assignment2;

/**
 * Exception representing any invalid account actions.
 *
 * @author christian.barrett
 */
public class InvalidAccountActionException extends Exception {
    private static final String MSG = "The action attempted is not valid!";

    /**
     * Constructor for invalid account exception with no params.
     */
    public InvalidAccountActionException() {
        super(MSG);
    }

    /**
     * Constructor for invalid account exception with message override.
     * @param message A string representing an alternate message to be displayed.
     */
    public InvalidAccountActionException(String message) {
        super(message);
    }

    /**
     * Constructor for invalid account exception with message and cause override.
     * @param message A string representing an alternate message to be displayed.
     * @param cause A Throwable object representing the cause of the exception.
     */
    public InvalidAccountActionException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor for invalid account exception with cause override.
     * @param cause A Throwable object representing the cause of the exception.
     */
    public InvalidAccountActionException(Throwable cause) {
        super(MSG, cause);
    }
}
