package vkickz;

/**
* Item Super Class
*/
public class Item{
  
  // Instance Variables
  private String itemType;
  private String brand;
  private String colourway;
  private double price;

  /**
  * Item Constructor
  */
  public Item(String item, String theBrand, String colour, double thePrice){
    this.itemType = item;
    this.brand = theBrand;
    this.colourway = colour;
    this.price = thePrice;
  }

  public String getItemType(){
    return itemType;
  }

  public String getBrand(){
    return brand;
  }

  public String getColourway(){
    return colourway;
  }

  public double getPrice(){
    return price;
  }

}