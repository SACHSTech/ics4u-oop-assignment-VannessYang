package vkickz; 

import vkickz.*; 
import java.util.ArrayList;

/**
* Store class
*/
public class Store {
  
  // Attributes
  private ArrayList<Customer> customer;
  private Staff staff;
  private Bag bag;
  private Shoe shoe;

  /**
  * Constructor - creates a new store instance
  * @param theStaff - store has staff
  * @param theBag - store has bags
  * @param theShoe - store has shoes
  */
  public Store(Staff theStaff, Bag theBag, Shoe theShoe){
    this.staff = theStaff;
    this.bag = theBag;
    this.shoe = theShoe;
    
    // Initializing the customer list 
    customer = new ArrayList<Customer>();
  }

  public 

}