package Escudero.Balance;

// imported
import java.text.NumberFormat;
/**
 * Created by Kayleigh Escudero on 2/12/2016.
 */
public class Account implements Balanceable, Depositable, Withdrawable{
    double balance = 1000;

    public void deposit(double amount){
        if (amount > 10000){
            System.out.println("Unable to deposit amounts greater than $10,000");
        }else{
            balance = balance + amount;
        }

    }

    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("Unable to withdraw amounts greater than balance");
        }else{
            balance = balance - amount;
        }
    }

    public double getBalance(){

        return balance;
    }

    public void setBalance(double amount){
        balance = amount;
    }

    public String getBalanceFormatted(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(balance);
    }
}
