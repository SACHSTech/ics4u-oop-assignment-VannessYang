package vkickz;

import vkickz.*;

/**
* OOP Assignment VKICKZ Auction Simulation (Bag Subclass)
* @author: V. Yang
* 
*/
public class Bag extends Item{
  
  // Instance Variables
  private String bagType;
  private String season;

  /**
  * Constructor - creates a new bag instance
  *
  * @param item - the item type 
  * @param theBrand - the brand of the bag 
  * @param colour - the colour of the bag 
  * @param thePrice - the price of the bag  
  * @param bag - the bag type 
  * @param theSeason - the season of the bag 
  * @author: V. Yang
  */
  public Bag(String item, String theBrand, String colour, double thePrice, String bag, String theSeason){
    super(item, theBrand, colour, thePrice);
    this.bagType = bag;
    this.season = theSeason;
  }

  /**
  * Getter for Bag Type  
  * 
  * @return the bag type 
  * @author: V. Yang
  */
  public String getBagType(){
    return bagType;
  }

  /**
  * Getter for Season of the Bag  
  *
  * @return the season of the bag 
  * @author: V. Yang
  */
  public String getSeason(){
    return season;
  }

  /**
  * toString to return values of variables 
  * 
  * @return a description of the bag for auction 
  * @author: V. Yang
  */
  public String toString(){
    return "The " + this.getItemType() + " available is the " + this.getBrand() + " " + season + " " + this.getColourway() + " " + bagType + ". The starting price is $" + this.getPrice();
  }
  
}