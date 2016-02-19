package Escudero.Balance;

/**
 * Created by Kayleigh Escudero on 2/12/2016.
 */
public class Transactions {
    // method to deposit to a depositable account
    public static void deposit(Depositable account, double amount){
        account.deposit(amount);
    }
    // method to withdraw from a withdrawable account
    public static void withdraw(Withdrawable account, double amount){
        account.withdraw(amount);
    }
}
