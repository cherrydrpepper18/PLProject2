package Escudero.Customer;


// start of main class
public class PersonApp {

    // class method to print a person
    public static void print(Person guy){
        System.out.println(guy.getDisplayText());
    }

    // start of main method
    public static void main(String[] args) {

        // print introduction
        System.out.println("Welcome to the Person Tester application");

        boolean stop = false;

        // run loop until user instructs to stop
        while (!stop) {


           String type = "";
            // error check for letters other than c and e
            while (!(type.equalsIgnoreCase("c")) && !(type.equalsIgnoreCase("e"))) {

                type = Console.getString("\nCreate customer or employee? (c/e)");
                //type = Console.getString("Create customer or employee? (c/e)");

            }


            // accept input for first, last, email address, and cust number or ssn for customers & employees
            if (type.equalsIgnoreCase("c")) {
                Customer ppl = new Customer();
                
                /*
                System.out.print("\nEnter first name: ");
                ppl.setFirst(Console.getString());
                System.out.print("Enter last name: ");
                ppl.setLast(Console.getString());
                System.out.print("Enter email address: ");
                ppl.setEmail(Console.getString());
                System.out.print("Customer number: ");
                ppl.setCustomerNumber(Console.getString());
                */

                ppl.setFirst(Console.getString("Enter first name: "));
                ppl.setLast(Console.getString("Enter last name: "));
                ppl.setEmail(Console.getString("Enter email address: "));
                ppl.setCustomerNumber(Console.getString("Customer number: "));

                System.out.println("\nYou entered: ");
                // print created person
                print(ppl);

            } else {
                Employee ppl = new Employee();

                /*
                System.out.print("\nEnter first name: ");
                ppl.setFirst(Console.getString());
                System.out.print("Enter last name: ");
                ppl.setLast(Console.getString());
                System.out.print("Enter email address: ");
                ppl.setEmail(Console.getString());
                System.out.print("Social security number: ");
                ppl.setSSN(Console.getString());
                */

                ppl.setFirst(Console.getString("Enter first name: "));
                ppl.setLast(Console.getString("Enter last name: "));
                ppl.setEmail(Console.getString("Enter email address: "));
                ppl.setSSN(Console.getString("Social security number: "));

                // print created person
                System.out.println("\nYou entered: ");
                print(ppl);
            }

            String answer = "g";

            while (!(answer.equalsIgnoreCase("y")) && !(answer.equalsIgnoreCase("n"))){
                //System.out.print("\nContinue? (y/n): ");
                answer = Console.getString("\nContinue? (y/n): ");
            }

            if (answer.equalsIgnoreCase("n")){
                stop = true;
            }

        }

    }
}
