package main.java.ca.nl.cna.ed.christian.barrett.assignment2;

/**
 * Class that represents the most basic functions of a Bank Account.
 *
 * @author christian.barrett
 */
public class BankAccount {

    protected double balance;

    /**
     * Constructor for a basic bank account with no initial deposit.
     */
    public BankAccount() {
        this.balance = 0;
    }

    /**
     * Constructor for a basic bank account with an initial deposit.
     *
     * @param balance A double representing the initial deposit.
     * @throws InvalidAccountActionException Exception thrown by entering negative balance.
     */
    public BankAccount(double balance) throws InvalidAccountActionException {
        if (balance < 0) {
            throw new InvalidAccountActionException("Cannot create an account with negative balance.");
        }

        this.balance = balance;
    }

    /**
     * Method that deposits given amount into the account if it is
     * greater than 0.
     *
     * @param amount A double representing about to be deposited.
     * @throws InvalidAccountActionException Exception thrown by entering amount less than or equal to 0.
     */
    public void depositAmt(double amount) throws InvalidAccountActionException {
        if (amount <= 0) {
            throw new InvalidAccountActionException("Cannot deposit a negative amount.");
        }

        this.balance += amount;
    }

    /**
     * Method that withdraws given amount from the account if it is
     * less than or equal to current balance.
     *
     * @param amount A double representing about to be withdrawn.
     * @throws InvalidAccountActionException Exception thrown by entering amount less than or equal to 0 or greater than current balance.
     */
    public void withdrawAmt(double amount) throws InvalidAccountActionException {
        if (amount > balance) {
            throw new InvalidAccountActionException("Cannot withdraw amount greater than balance.");
        }

        if (amount <= 0) {
            throw new InvalidAccountActionException("Cannot withdraw negative amount.");
        }

        this.balance -= amount;
    }

    /**
     * Method that returns current account balance.
     *
     * @return A double representing the current account balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Method for transferring funds from the current account to another
     * given account.
     *
     * @param account A BankAccount object representing the account you'd like to transfer funds to.
     * @param amount A double representing the amount of funds to transfer.
     * @throws InvalidAccountActionException Exception thrown by entering amount less than or equal to 0 or greater than current balance.
     */
    public void transferAmt(BankAccount account, double amount) throws InvalidAccountActionException {
        if (amount <= 0) {
            throw new InvalidAccountActionException("Cannot transfer amount greater than or equal to zero.");
        }

        if (amount > this.balance) {
            throw new InvalidAccountActionException("Cannot transfer amount greater than balance.");
        }

        this.balance -= amount;
        account.balance += amount;
    }
}
