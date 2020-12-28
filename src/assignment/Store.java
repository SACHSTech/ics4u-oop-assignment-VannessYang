package assignment; 

import assignment.*; 
import java.util.ArrayList;

public class Store {
  
  private ArrayList<Customer> customer;
  private ArrayList<Staff> staff;
  private ArrayList<Item> item;

  public Store(){
    customer = new ArrayList<Customer>();
    staff = new ArrayList<Staff>();
    item = new ArrayList<Item>();
  }

}