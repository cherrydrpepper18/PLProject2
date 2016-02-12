package Brezina.Customer;

// import scanner
import java.util.Scanner;

// start of main class
public class CustomerApp {

    // start of main method
    public static void main(String[] args) {

        // define scanner
        Scanner nSA = new Scanner(System.in);

        //welcome message
        System.out.println("Welcome to the Customer Viewer\n");

        // define flag for repeating to find another customer
        boolean repeat = true;

        // loop to receive input and output customer data and other messages
        while (repeat) {
            // prompting question
            System.out.print("Enter a customer number: ");

            // user prompt, must be an int
            int customerNumber = nSA.nextInt();

            System.out.println();

            // initialize customer data string
            String info;

            // error check: if number is correct
            if (customerNumber > 1000 && customerNumber < 1004) {

                // calls getCustomer method from Customer DB  and stores that customer object
                Customer hR = CustomerDB.getCustomer(customerNumber);
                // calls the getNameAndAddress method for hr object
                info = hR.getNameAndAddress();

            }

            // error message
            else {
                info = "There is no customer number " + customerNumber + " in our records";

            }

            // prints customer info
            System.out.println(info);
            System.out.println();

            // flag and initialization
            String response = "";

            // error check for whether to continue program
            while (!(response.equals("y") || response.equals("n"))) {

                // prompting message
                System.out.print("Display another customer? (y/n): ");
                // recieves user response
                response = nSA.next();

                // Print space
                System.out.println();

                // exits the while loop
                if (response.equals("n")) {
                    repeat = false;

                }

            }

        }

        // goodbye message
        System.out.println("Buh-bye");

    }
}
