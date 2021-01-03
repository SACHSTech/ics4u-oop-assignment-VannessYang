package vkickz;

import vkickz.*;

public class Customer extends Human{

  private String address;
  private String cardNumber;

  private static int totalCustomers = 0;

  public Customer(String fname, String lname, String addr, String card){
    super(fname, lname);
    this.address = addr;
    this.cardNumber = card;

    totalCustomers++;
  }

  public static int getTotalCustomers(){
    return totalCustomers;
  }

  public String getAddress(){
    return address;
  }

  public String getCardNumber(){
    return cardNumber;
  }  

  public String toString(){
    return this.getFirstName() + " " + this.getLastName() + " on " + address + " with card number: " + cardNumber;
  }

}