package vkickz;

import vkickz.*;

/**
* Bag Constructor 
*/
public class Bag extends Item{
  
  private String bagType;
  private String season;

  public Bag(String item, String theBrand, String colour, double thePrice, String bag, String theSeason){
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