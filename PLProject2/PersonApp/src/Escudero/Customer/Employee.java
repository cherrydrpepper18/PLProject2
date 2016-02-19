package Escudero.Customer;

/**
 * Created by Kayleigh Escudero on 2/12/2016.
 */
public class Employee extends Person{

    private String SSN;

    //constructor for employee
    public Employee(){

    }

    // getter and setting for social security number
    public String getSSN(){
        return  SSN;
    }

    public void setSSN(String number){
        this.SSN = number;
    }

    //implement abstract method getDisplay Text. Display ssn in addition to first and last name
    @Override public String getDisplayText(){
        return this.toString() + "\nSocial security number: " + SSN;

    }
}

