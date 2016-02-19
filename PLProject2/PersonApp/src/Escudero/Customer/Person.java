package Escudero.Customer;


// abstract class with Person methods & attributes
public abstract class Person {
    private String first;
    private String last;
    private String email;

    //constructor for Person
    public Person(){
        //does nothing
    }

    // methods to retrieve first, last, & email
    public String getFirst(){
        return first;
    }
    public String getLast(){
        return last;
    }
    public String getEmail(){
        return email;
    }
    // methods to set first,last,email
    public void setFirst(String first){
        this.first = first;
    }
    public void setLast(String last){
        this.last = last;
    }
    public void setEmail(String email){
        this.email = email;
    }

    // override toString method to display first and last name and email
    public String toString(){
        return "Name: " + first + " " + last +"\nEmail: " + email;
    }

    // abstract class for subclasses to display text
    public abstract String getDisplayText();



}
