package Escudero.Customer;


// declare, initialize, and combine to form customer objects
public class Customer extends Person{

    private String customerNum;

    //constructor for customer
    public Customer(){

    }

    // getter and setting for customer number
    public String getCustomerNumber(){
        return  customerNum;
    }

    public void setCustomerNumber(String number){
        this.customerNum = number;
    }

    //implement abstract method getDisplay Text. Display customer number in addition to first and last name
    @Override public String getDisplayText(){
        return this.toString() + "\nCustomer number: " + customerNum;

    }

}
