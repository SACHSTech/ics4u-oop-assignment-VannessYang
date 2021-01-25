package vkickz;

import vkickz.*;

/**
* OOP Assignment VKICKZ Auction Simulation (Shoe Subclass)
* @author: V. Yang
* 
*/
public class Shoe extends Item{
  
  // Instance variables 
  private double size;
  private String model;

  /**
  * Constructor - creates a new shoe instance
  *
  * @param item - the type of the item
  * @param theBrand - the brand of the shoe
  * @param colour - the colour of the shoe
  * @param thePrice - the price of the shoe
  * @param theSize - the size of the shoe
  * @param theModel - the model of the shoe 
  * @author: V. Yang
  */
  public Shoe(String item, String theBrand, String colour, double thePrice, double theSize, String theModel){
    super(item, theBrand, colour, thePrice);
    this.size = theSize;
    this.model = theModel;
  }
  
  /**
  * Getter for the Shoe size
  * 
  * @return the size of the shoe 
  * @author: V. Yang
  */
  public double getSize(){
    return size;
  }

  /**
  * Getter for the Shoe model
  * 
  * @return the model of the shoe 
  * @author: V. Yang
  */
  public String getModel(){
    return model;
  }

  /**
  * toString to return the values of the Shoe variables
  * 
  * @return a description of the shoe for auction 
  * @author: V. Yang
  */
  public String toString(){
    return "The " + this.getItemType() + " available is the " + this.getBrand() + " " + model + " " + this.getColourway() + " in a size " + size + ". The starting price is $" + this.getPrice() + ".";
  }
  
}