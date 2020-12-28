package assignment;

import assignment.*;

public class Customer extends Human{
  
  private int phone;
  private String address;
  private int cardNumber;
  private int CVV;

  public Customer(String fname, String lname, int phoneNumber, String addr, int card, int cvv){
    super(fname, lname);
    this.number = phoneNumber;
    this.address = addr;
    this.cardNumber = card;
    this.CVV = cvv;
  }

  public int getPhone(){
    return phone;
  }

  public String getAddress(){
    return address;
  }

  public int getCardNumber(){
    return cardNumber;
  }

  public int getCVV(){
    return CVV;
  }

}