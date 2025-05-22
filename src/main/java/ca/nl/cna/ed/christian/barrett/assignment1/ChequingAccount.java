package main.java.ca.nl.cna.ed.christian.barrett.assignment1;

/**
 * Class that represents a basic Chequing Account.
 *
 * @author christian.barrett
 */
public class ChequingAccount extends BankAccount{

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
     */
    public ChequingAccount(double balance) {
        super(balance);
        transactionCnt = 0;
    }

    /**
     * Method used to deduct transaction fees from current balance.
     */
    private void chargeFees(){
        this.balance -= TRANSACTION_FEE;
    }

    /**
     * Override Method that deposits given amount into the account if it is
     * greater than 0, also increments the current transaction count and
     * charges the transaction fee if free transactions has been exceeded.
     *
     * @param amount A double representing about to be deposited.
     */
    @Override
    public void depositAmt(double amount){
        super.depositAmt(amount);
        transactionCnt++;
        if(transactionCnt >= FREE_TRANSACTIONS){
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
     */
    @Override
    public void withdrawAmt(double amount) {
        super.withdrawAmt(amount);
        transactionCnt++;
        if(transactionCnt >= FREE_TRANSACTIONS){
            chargeFees();
        }
    }
}
