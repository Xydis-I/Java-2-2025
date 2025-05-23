package main.java.ca.nl.cna.ed.christian.barrett.assignment2;

/**
 * Class that represents a basic Savings Account.
 *
 * @author christian.barrett
 */
public class SavingsAccount extends BankAccount {

    private double interestRate = 3;

    /**
     * Constructor for a savings account with no initial deposit.
     */
    public SavingsAccount() {
        super();
    }

    /**
     * Constructor for a savings account with an initial deposit.
     *
     * @param balance A double representing the initial deposit.
     * @throws InvalidAccountActionException Exception thrown by entering negative balance.
     */
    public SavingsAccount(double balance) throws InvalidAccountActionException {
        super(balance);
    }

    /**
     * Method for changing the current interest rate of the savings account.
     * @param interest A double representing the new percent interest. (3% => 3)
     */
    public void changeInterest(double interest) {
        this.interestRate = interest;
    }

    /**
     * Method used to calculate and add interest to the current balance.
     */
    public void addInterest() {
        var interestAmt = this.balance * this.interestRate / 100.0;
        this.balance += interestAmt;
    }
}
