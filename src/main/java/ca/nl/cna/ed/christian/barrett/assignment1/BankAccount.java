package main.java.ca.nl.cna.ed.christian.barrett.assignment1;

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
     */
    public BankAccount(double balance) {
        this.balance = balance;
    }

    /**
     * Method that deposits given amount into the account if it is
     * greater than 0.
     *
     * @param amount A double representing about to be deposited.
     */
    public void depositAmt(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    /**
     * Method that withdraws given amount from the account if it is
     * less than or equal to current balance.
     *
     * @param amount A double representing about to be withdrawn.
     */
    public void withdrawAmt(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
        }
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
     */
    public void transferAmt(BankAccount account, double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.withdrawAmt(amount);
            account.depositAmt(amount);
        }
    }
}
