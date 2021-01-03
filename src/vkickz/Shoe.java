package vkickz;

import vkickz.*;

/**
* Shoe Subclass
*/
public class Shoe extends Item{
  
  // Instance variables 
  private double size;
  private String model;

  /**
  * Shoe Constructor 
  */
  public Shoe(String item, String theBrand, String colour, double thePrice, double theSize, String theModel){
    // Gets variables from Item superclass
    super(item, theBrand, colour, thePrice);

    this.size = theSize;
    this.model = theModel;
  }
  
  /**
  * Getter for the Shoe size
  */
  public double getSize(){
    return size;
  }

  /**
  * Getter for the Shoe model 
  */
  public String getModel(){
    return model;
  }

  /**
  * toString to return the values of the Shoe variables
  */
  public String toString(){
    return "The " + this.getItemType() + " available is the " + this.getBrand() + " " + model + " " + this.getColourway() + " in a size " + size + ". The starting price is $" + this.getPrice() + ".";
  }
  
}