package vkickz; 

import vkickz.*; 
import java.util.ArrayList;

/**
* OOP Assignment VKICKZ Auction Simulation (Store Class)
* @atuhor: V. Yang
* 
*/
public class Store {
  
  // Attributes
  private ArrayList<Customer> customer;
  private Staff staff;
  private Bag bag;
  private Shoe shoe;

  /**
  * Constructor - creates a new store instance
  *
  * @param theStaff - store has staff
  * @param theBag - store has bags
  * @param theShoe - store has shoes
  * @author: V. Yang
  */
  public Store(Staff theStaff, Bag theBag, Shoe theShoe){
    this.staff = theStaff;
    this.bag = theBag;
    this.shoe = theShoe;
    
    // Initializing the customer list 
    customer = new ArrayList<Customer>();
  }
}