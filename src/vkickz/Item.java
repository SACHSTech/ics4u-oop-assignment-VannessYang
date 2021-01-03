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

  /**
  * Getter for the item type 
  */
  public String getItemType(){
    return itemType;
  }

  /**
  * Getter for the item brand 
  */
  public String getBrand(){
    return brand;
  }

  /**
  * Getter for the item colourway
  */
  public String getColourway(){
    return colourway;
  }

  /**
  * Getter for the item price
  */
  public double getPrice(){
    return price;
  }

}