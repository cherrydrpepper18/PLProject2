package Brezina.Customer;

/**
 * Created by blainebrezina on 1/29/16.
 */
// declare, initialize, and combine to form customer objects
public class Customer {

    // declaring parts of customer object
    private String name;

    private String address;

    private String city;

    private String state;

    private int postalCode;

    // initializing the customer object
    public Customer (String name, String address, String city, String state, int postalCode){
        this.name = name;

        this.address = address;

        this.city = city;

        this.state = state;

        this.postalCode = postalCode;
    }

    // returns the formatted string of the customer info
    public String getNameAndAddress (){
        String message =
                name + "\n" +
                address + "\n" +
                city + ", " +
                state + " " +
                postalCode;

        return message;

    }

}
