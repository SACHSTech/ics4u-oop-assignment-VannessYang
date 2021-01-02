package vkickz;

import vkickz.*;

public class Customer extends Human{

  private String address;
  private String cardNumber;

  public Customer(String fname, String lname, String addr, String card){
    super(fname, lname);
    this.address = addr;
    this.cardNumber = card;
  }

  public String getAddress(){
    return address;
  }

  public String getCardNumber(){
    return cardNumber;
  }  

}