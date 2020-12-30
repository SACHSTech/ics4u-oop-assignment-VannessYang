package vkickz;

import vkickz.*;

public class Shoe extends Item{
  
  private double size;
  private String model;

  public Shoe(String item, String theBrand, String colour, double thePrice, int theStock, double theSize, String theModel){
    super(item, theBrand, colour, thePrice, theStock);
    this.size = theSize;
    this.model = theModel;
  }

  public double getSize(){
    return size;
  }

  public String getModel(){
    return model;
  }
  
}