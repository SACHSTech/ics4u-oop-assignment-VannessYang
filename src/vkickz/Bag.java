package vkickz;

import vkickz.*;

/**
* Bag Subclass
*/
public class Bag extends Item{
  
  // Instance Variables
  private String bagType;
  private String season;

  /**
  * Bag Constructor  
  */
  public Bag(String item, String theBrand, String colour, double thePrice, String bag, String theSeason){
    // Gets variables from Item superclass 
    super(item, theBrand, colour, thePrice);
    
    this.bagType = bag;
    this.season = theSeason;
  }

  /**
  * Getter for Bag Type   
  */
  public String getBagType(){
    return bagType;
  }

  /**
  * Getter for Season of the Bag  
  */
  public String getSeason(){
    return season;
  }

  /**
  * toString method to return values of variables 
  */
  public String toString(){
    return "The " + this.getItemType() + " available is the " + this.getBrand() + " " + season + " " + this.getColourway() + " " + bagType + ". The starting price is $" + this.getPrice();
  }
  
}