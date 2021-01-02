package vkickz;

import vkickz.*;

public class Bag extends Item{
  
  private String bagType;
  private String season;

  public Bag(String item, String theBrand, String colour, double thePrice, int theStock, String bag, String theSeason){
    super(item, theBrand, colour, thePrice, theStock);
    this.bagType = bag;
    this.season = theSeason;
  }

  public String getBagType(){
    return bagType;
  }

  public String getSeason(){
    return season;
  }
  
}