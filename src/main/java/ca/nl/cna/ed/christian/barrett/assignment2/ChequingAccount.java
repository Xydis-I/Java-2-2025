package main.java.ca.nl.cna.ed.christian.barrett.assignment2;

/**
 * Class that represents a basic Chequing Account.
 *
 * @author christian.barrett
 */
public class ChequingAccount extends BankAccount {

    final int FREE_TRANSACTIONS = 3;
    final double TRANSACTION_FEE = 2;

    private int transactionCnt;

    /**
     * Constructor for a chequing account with no initial deposit.
     */
    public ChequingAccount() {
        super();
        transactionCnt = 0;
    }

    /**
     * Constructor for a chequing account with an initial deposit.
     *
     * @param balance A double representing the initial deposit.
     * @throws InvalidAccountActionException Exception thrown by entering negative balance.
     */
    public ChequingAccount(double balance) throws InvalidAccountActionException {
        super(balance);
    }

    /**
     * Method used to deduct transaction fees from current balance.
     */
    private void chargeFees(){
        this.balance -= TRANSACTION_FEE;
        transactionCnt = 0;
    }

    /**
     * Override Method that deposits given amount into the account if it is
     * greater than 0, also increments the current transaction count and
     * charges the transaction fee if free transactions has been exceeded.
     *
     * @param amount A double representing about to be deposited.
     * @throws InvalidAccountActionException Exception thrown by entering amount less than or equal to 0.
     */
    @Override
    public void depositAmt(double amount) throws InvalidAccountActionException {
        super.depositAmt(amount);
        transactionCnt++;
        if(transactionCnt > FREE_TRANSACTIONS){
            chargeFees();
        }
    }

    /**
     * Override Method that withdraws given amount from the account if it is
     * less than or equal to current balance, also increments the current
     * transaction count and charges the transaction fee if free transactions
     * has been exceeded.
     *
     * @param amount A double representing about to be withdrawn.
     * @throws InvalidAccountActionException Exception thrown by entering amount less than or equal to 0 or greater than current balance.
     */
    @Override
    public void withdrawAmt(double amount) throws InvalidAccountActionException {
        super.withdrawAmt(amount);
        transactionCnt++;
        if(transactionCnt > FREE_TRANSACTIONS){
            chargeFees();
        }
    }
}
