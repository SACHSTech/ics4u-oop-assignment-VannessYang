package vkickz; 

import vkickz.*; 
import java.util.ArrayList;

public class Store {
  
  // Attributes
  private ArrayList<Customer> customer;
  private Staff staff;
  private Bag bag;
  private Shoe shoe;

  
  public Store(Staff theStaff, Bag theBag, Shoe theShoe, int numCustomer){
    this.staff = theStaff;
    this.bag = theBag;
    this.shoe = theShoe;
    
    // Initializing the customer list 
    customer = new ArrayList<Customer>();
  }

}