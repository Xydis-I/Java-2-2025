package main.java.ca.nl.cna.ed.christian.barrett.assignment2;

/**
 * Test application that demonstrates the assignments' functionality.
 *
 * @author christian.barrett
 */
public class TransactionsTest {
    public static void main(String[] args) {
        try {
            var christianSavingsFail = new SavingsAccount(-500);
        } catch (InvalidAccountActionException e) {
            System.err.println(e.getMessage());
        }

        try {
            var christianChequingFail = new ChequingAccount(-500);
        } catch (InvalidAccountActionException e) {
            System.err.println(e.getMessage());
        }

        var christianSavings = new SavingsAccount();
        var christianChequing = new ChequingAccount();

        try {
            christianSavings.depositAmt(5000);
            christianSavings.addInterest();
            christianSavings.transferAmt(christianChequing, 1000);
            christianChequing.withdrawAmt(200);
            christianChequing.withdrawAmt(400);
            christianChequing.withdrawAmt(300);
            christianChequing.withdrawAmt(50);
            christianSavings.changeInterest(5);
            christianSavings.addInterest();
        } catch (InvalidAccountActionException e) {
            System.err.println(e.getMessage());
        }

        try {
            christianSavings.depositAmt(-5000);
        } catch (InvalidAccountActionException e) {
            System.err.println(e.getMessage());
        }

        try {
            christianChequing.withdrawAmt(-500);
        } catch (InvalidAccountActionException e) {
            System.err.println(e.getMessage());
        }

        System.out.println(String.format("Final Savings Balance: $%.2f", christianSavings.getBalance()));
        System.out.println(String.format("Final Chequing Balance: $%.2f", christianChequing.getBalance()));
    }
}
