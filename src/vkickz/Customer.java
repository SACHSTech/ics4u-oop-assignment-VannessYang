package vkickz;

import vkickz.*;

/**
* Customer Subclass  
*/
public class Customer extends Human{

  // Instance Variables
  private String address;
  private String cardNumber;

  // Class Variable 
  private static int totalCustomers = 0;

  /**
  * Customer Constructor 
  */
  public Customer(String fname, String lname, String addr, String card){
    // Gets variables from Human superclass
    super(fname, lname);

    this.address = addr;
    this.cardNumber = card;

    // Increases Customer Count
    totalCustomers++;
  }

  /**
  * Returns total number of customer objects   
  */
  public static int getTotalCustomers(){
    return totalCustomers;
  }

  /**
  * Getter for customer address
  */
  public String getAddress(){
    return address;
  }

  /**
  * Human for customer card number  
  */
  public String getCardNumber(){
    return cardNumber;
  }  

  /**
  * toString to return values of variables  
  */
  public String toString(){
    return this.getFirstName() + " " + this.getLastName() + " on " + address + " with card number: " + cardNumber;
  }

}