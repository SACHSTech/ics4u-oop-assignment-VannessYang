package vkickz; 

import vkickz.*; 
import java.util.ArrayList;

public class Store {
  
  private ArrayList<Customer> customer;
  private Staff staff;
  private Item item;

  public Store(Staff theStaff, Item theItem){
    this.staff = theStaff;
    this.item = theItem;
    customer = new ArrayList<Customer>();
  }

}