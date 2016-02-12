package Escudero.Customer;

// import scanner
import java.util.Scanner;

// start of main class
public class PersonApp {

    // class method to print a person
    public static void print(Person guy){
        System.out.println(guy.getDisplayText());
    }

    // start of main method
    public static void main(String[] args) {

        // create a scanner
        Scanner C = new Scanner(System.in);

        // print introduction
        System.out.println("Welcome to the Person Tester application");

        boolean stop = false;

        // run loop until user instructs to stop
        while (!stop) {


           String type = "";
            // error check for letters other than c and e
            while (!(type.equalsIgnoreCase("c")) && !(type.equalsIgnoreCase("e"))) {

                System.out.print("\nCreate customer or employee? (c/e)");
                type = C.nextLine();
                //type = C.readLine("Create customer or employee? (c/e)");

            }


            // accept input for first, last, email address, and cust number or ssn for customers & employees
            if (type.equalsIgnoreCase("c")) {
                Customer ppl = new Customer();

                System.out.print("\nEnter first name: ");
                ppl.setFirst(C.nextLine());
                System.out.print("Enter last name: ");
                ppl.setLast(C.nextLine());
                System.out.print("Enter email address: ");
                ppl.setEmail(C.nextLine());
                System.out.print("Customer number: ");
                ppl.setCustomerNumber(C.nextLine());

                /**ppl.setFirst(C.readLine("Enter first name: "));
                ppl.setLast(C.readLine("Enter last name: "));
                ppl.setEmail(C.readLine("Enter email address: "));
                ppl.setCustomerNumber(C.readLine("Customer number: "));*/

                System.out.println("\nYou entered: ");
                // print created person
                print(ppl);

            } else {
                Employee ppl = new Employee();


                System.out.print("\nEnter first name: ");
                ppl.setFirst(C.nextLine());
                System.out.print("Enter last name: ");
                ppl.setLast(C.nextLine());
                System.out.print("Enter email address: ");
                ppl.setEmail(C.nextLine());
                System.out.print("Social security number: ");
                ppl.setSSN(C.nextLine());

                /**ppl.setFirst(C.readLine("Enter first name: "));
                ppl.setLast(C.readLine("Enter last name: "));
                ppl.setEmail(C.readLine("Enter email address: "));
                ppl.setSSN(C.readLine("Social security number: "));*/

                // print created person
                System.out.println("\nYou entered: ");
                print(ppl);
            }

            String answer = "g";

            while (!(answer.equalsIgnoreCase("y")) && !(answer.equalsIgnoreCase("n"))){
                System.out.print("\nContinue? (y/n): ");
                answer = C.nextLine();
            }

            if (answer.equalsIgnoreCase("n")){
                stop = true;
            }

        }

    }
}
