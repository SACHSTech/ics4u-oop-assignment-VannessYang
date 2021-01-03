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
    // Gets variables from superclass 
    super(item, theBrand, colour, thePrice);
    this.bagType = bag;
    this.season = theSeason;
  }

  public String getBagType(){
    return bagType;
  }

  public String getSeason(){
    return season;
  }

  
  public String toString(){
    return "The " + this.getItemType() + " available is the " + this.getBrand() + " " + season + " " + this.getColourway() + " " + bagType + ". The starting price is $" + this.getPrice();
  }
  
}