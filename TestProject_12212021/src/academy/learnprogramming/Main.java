package academy.learnprogramming;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Main {

    private static final String Error = "Transaction Failed";
    public static void main(String[] args) {

	//here is what I would like to do
        //run a looping transaction that runs until all numbers are processed
        //make the numbers long to include decimals to the hundredth place
        //perform transformation on numbers

        //create a class that handles banking transactions with fields to capture:
            //account number: String
            //Account name: String
            //Account owner name: String
            //bank routing number: string
            //account balance: int
            //account activity status status: Bool "Open"/"Close"
            //account open date: Date
            //transaction sent date: Date
            //transaction received date: Date
            //transaction amount: int
            //transaction limit:
            //account annual interest: long
            //account executor: String
            //FDIC policy id: String
            //clerkStaff: String
            //
        int beginningTransactionQty = 0;
        int transactionLimit = 20;
        String TransactionStartDate = "2021-01-02";
        double TransactionAmount = 5172.83D;

        transaction Tim = new transaction();
        //code will refuse transactions that have occurred into the future (cannot break continuum)
        if ((Tim.setTransactionSentDate(TransactionStartDate).equals("ERROR: Transaction Date Declined")) ||
                (Tim.setTransactionAmount(TransactionAmount)<=0) ||
                !(Tim.setTransactionQtyValidation(beginningTransactionQty,transactionLimit))){

            System.out.println(Error);

        } else {
            System.out.println(Tim.setTransactionSentDate(TransactionStartDate));
            System.out.println("Transaction Amount: $" + Tim.setTransactionAmount(TransactionAmount));
            System.out.println("Transaction Number: " + Tim.setCurrentTransactionQty(beginningTransactionQty) +
                    " out of " + transactionLimit);
        }
    }
}
