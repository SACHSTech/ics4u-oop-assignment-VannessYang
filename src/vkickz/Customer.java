package vkickz;

import vkickz.*;

/**
* OOP Assignment VKICKZ Auction Simulation (Customer Subclass)
* @author: V. Yang
* 
*/
public class Customer extends Human{

  // Instance Variables
  private String address;
  private String cardNumber;

  // Class Variable 
  private static int totalCustomers = 0;

  /**
  * Constructor - creates a new customer instance
  *
  * @param fname - the customer first name
  * @param lname - the customer last name
  * @param addr - the customer address 
  * @param card - the customer card number 
  * @author: V. Yang
  */
  public Customer(String fname, String lname, String addr, String card){
    super(fname, lname);
    this.address = addr;
    this.cardNumber = card;

    // Increases Customer Count
    totalCustomers++;
  }

  /**
  * Returns total number of customer objects   
  *
  * @return total number of customers 
  * @author: V. Yang
  */
  public static int getTotalCustomers(){
    return totalCustomers;
  }

  /**
  * Getter for customer address
  * 
  * @return the address of the customer 
  * @author: V. Yang
  */
  public String getAddress(){
    return address;
  }

  /**
  * Human for customer card number  
  *
  * @return the customer's card number 
  * @author: V. Yang
  */
  public String getCardNumber(){
    return cardNumber;
  }  

  /**
  * toString to return values of variables  
  *
  * @return a description of the customer's account details 
  * @author: V. Yang
  */
  public String toString(){
    return this.getFirstName() + " " + this.getLastName() + " on " + address + " with card number: " + cardNumber;
  }

}