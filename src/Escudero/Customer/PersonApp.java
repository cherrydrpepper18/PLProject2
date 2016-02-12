package Escudero.Customer;

// import scanner
import java.io.Console;

// start of main class
public class PersonApp {

    // class method to print a person
    public static void print(Person guy){
        System.out.println(guy.getDisplayText());
    }

    // start of main method
    public static void main(String[] args) {

        // create a console
        Console C = System.console();

        Boolean stop = false;

        // run loop until user instructs to stop
        while (!stop) {

           String type = "";
            // error check for letters other than c and e
            while (!type.equalsIgnoreCase("c") && !type.equalsIgnoreCase("e")) {

                type = C.readLine("Create customer or employee? (c/e)");
            }


            // accept input for first, last, email address, and cust number or ssn for customers & employees
            if (type.equalsIgnoreCase("c")) {
                Customer ppl = new Customer();

                ppl.setFirst(C.readLine("Enter first name: "));
                ppl.setLast(C.readLine("Enter last name: "));
                ppl.setEmail(C.readLine("Enter email address: "));
                ppl.setCustomerNumber(C.readLine("Customer number: "));

                // print created person
                print(ppl);

            } else {
                Employee ppl = new Employee();

                ppl.setFirst(C.readLine("Enter first name: "));
                ppl.setLast(C.readLine("Enter last name: "));
                ppl.setEmail(C.readLine("Enter email address: "));
                ppl.setSSN(C.readLine("Social security number: "));

                // print created person
                print(ppl);
            }

            String answer = "";

            while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")){
                answer = C.readLine("Continue? (y/n): ");
            }

            if (answer.equalsIgnoreCase("n")){
                stop = true;
            }



        }

    }
}
