package Escudero.Balance;
import java.util.Scanner;
/**
 * Created by Kayleigh Escudero on 2/12/2016.
 */
public class AccountApp{

    public static void main(String args[]){
        // get the scanner
        Scanner s = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Account Calculator\n");

        System.out.println("Starting Balance");
        System.out.println("Checking: $1,000.00\n\nEnter the transactions for the month\n");

        boolean stop = false;

        while (!stop){


            String type = "z";
            while (!(type.equalsIgnoreCase("w") && !(type.equalsIgnoreCase("d")))){
                System.out.print("Withdrawal or deposit? (w/d): ");
                type = s.nextLine();
            }

            if (type.equalsIgnoreCase("w")){

            }else{

            }

            String answer = "z";
            while (!(answer.equalsIgnoreCase("y") && !(answer.equalsIgnoreCase("n")))){
                System.out.print("Continue? (y/n): ");
                answer = s.nextLine();
            }

            if (answer.equalsIgnoreCase("n")){
                stop = true;
            }




        }

    }
}
