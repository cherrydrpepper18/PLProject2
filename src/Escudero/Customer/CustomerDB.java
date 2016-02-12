package Brezina.Customer;

/**
 * Created by blainebrezina on 1/29/16.
 */
// holds customer information
public class CustomerDB {

    // returns customer objects
    public static Customer getCustomer(int customerNumber) {

        if (customerNumber == 1001 ) {
            return new Customer ("Barbara White", "3400 Richmond Parkway #3423", "Bristol", "CT", 06010 );
        }

        else if (customerNumber == 1002) {
            return new Customer ("Karl Vang", "327 Franklin Street", "Edina", "MN", 55435);
        }

        else {
            return new Customer ("Ronda Chavan", "518 Comanche Dr.", "Greensboro", "NC", 27410);
        }
    }

}
