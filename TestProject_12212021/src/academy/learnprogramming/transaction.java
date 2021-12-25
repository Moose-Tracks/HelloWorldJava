package academy.learnprogramming;

import java.time.LocalDate;
import java.util.Date;

public class transaction {
    LocalDate transactionSentDate;
    private Date transactionReceivedDate;
    long transactionAmount;
    private int transactionLimit;
    int transactionqty;

    public String setTransactionSentDate(String transactionSentDate) {
        LocalDate x = LocalDate.parse(transactionSentDate);
        String newLine = System.getProperty("line.separator"); //This will retrieve line separator dependent on OS.
        if (LocalDate.now().isAfter(x)) {
            return newLine + newLine + "Transaction Date has been Accepted." + newLine +
                    newLine + "Amount Transacted On: " + x;
        } else {
            return "ERROR: Transaction Date Declined";
        }

    }

    public double setTransactionAmount(double transactionAmount) {
        if (transactionAmount > 0) {
            return transactionAmount;
        } else {
            return -1;
        }
    }

    public boolean setTransactionQtyValidation(int transactionQty, int transactionLimit) {
        if (transactionQty++ > transactionLimit) {
            return false;
        } else {
            return true;
        }
    }

    public int setCurrentTransactionQty(int beginningTransactionQty) {
        int presentTransactionQty = beginningTransactionQty + 1;
        return presentTransactionQty;
    }
}
