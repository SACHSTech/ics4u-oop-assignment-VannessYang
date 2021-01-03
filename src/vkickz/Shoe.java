package vkickz;

import vkickz.*;

public class Shoe extends Item{
  
  private double size;
  private String model;

  public Shoe(String item, String theBrand, String colour, double thePrice, double theSize, String theModel){
    super(item, theBrand, colour, thePrice);
    this.size = theSize;
    this.model = theModel;
  }

  public double getSize(){
    return size;
  }

  public String getModel(){
    return model;
  }

  public String toString(){
    return "The " + this.getItemType() + " available is the " + this.getBrand() + " " + model + " " + this.getColourway() + " in a size " + size + ". The starting price is $" + this.getPrice() + ".";
  }
  
}