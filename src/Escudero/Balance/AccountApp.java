package Escudero.Balance;
import java.util.Scanner;
/**
 * Created by Kayleigh Escudero on 2/12/2016.
 */
public class AccountApp{

    public static void main(String args[]){
        // get the scanner
        Scanner s = new Scanner(System.in);

        // instantiate the new checking account
        CheckingAccount account = new CheckingAccount();

        // Welcome message
        System.out.println("Welcome to the Account Calculator\n");

        System.out.println("Starting Balance");
        System.out.println("Checking: " + account.getBalanceFormatted() + "\n\nEnter the transactions for the month\n");

        boolean stop = false;

        while (!stop){


            String type = "z";
            while (!(type.equalsIgnoreCase("w")) && !(type.equalsIgnoreCase("d"))){
                System.out.print("Withdrawal or deposit? (w/d): ");
                type = s.nextLine();
            }

            if (type.equalsIgnoreCase("w")){

                // prompt the user for input of the amount they would like to withdraw
                System.out.print("Amount: ");
                String amount = s.nextLine();
                // takes string input from user and casts as int primitive
                int amountInt = Integer.parseInt(amount);

                // UNNECESSARY with methods for error checking in account?
                // checks that user input is less than current amount in account
                while (amountInt > account.getBalance()) {
                    System.out.print("Enter an amount less than " + account.getBalanceFormatted() + ": ");
                    amount = s.nextLine();
                    amountInt = Integer.parseInt(amount);
                }

                // perform the operation of withdrawing from the account
                Transactions.withdraw(account, amountInt);

            }else if (type.equalsIgnoreCase("d")){

                // prompt the user for input of the amount they would like to deposit
                System.out.print("Amount: ");
                String amount = s.nextLine();
                // takes string input from user and casts as int primitive
                int amountInt = Integer.parseInt(amount);

                // IS THIS NECESSARY IF CHECKING IN ACCOUNT CLASS?
                // checks that user input is less $10,000
                while (amountInt > 10000) {
                    System.out.print("Enter an amount less than $10,000: ");
                    amount = s.nextLine();
                    amountInt = Integer.parseInt(amount);
                }

                // perform the operation of withdrawing from the account
                Transactions.deposit(account, amountInt);
            }

            String answer = "z";
            while (!(answer.equalsIgnoreCase("y")) && !(answer.equalsIgnoreCase("n"))){
                System.out.print("Continue? (y/n): ");
                answer = s.nextLine();
            }

            if (answer.equalsIgnoreCase("n")){

                // subtract the monthly fee from the balance before it is printed
                account.subtractMonthlyFee();

                // print checking fees and final balance
                System.out.println("Monthly Fees\nChecking Fee: " + account.getMonthlyFeeFormatted());
                System.out.println("\nFinal Balance\nChecking: " + account.getBalanceFormatted());

                stop = true;
            }


        }

    }
}
