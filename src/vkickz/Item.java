package vkickz;

/**
* OOP Assignment VKICKZ Auction Simulation (Item Superclass)
* @author: V. Yang
* 
*/
public class Item{
  
  // Instance Variables
  private String itemType;
  private String brand;
  private String colourway;
  private double price;

  /**
  * Constructor - creates a new item instance
  *
  * @param item - the type of item 
  * @param theBrand - the brand of the item
  * @param colour - the colour of the item
  * @param thePrice - the price of the item  
  * @author: V. Yang
  */
  public Item(String item, String theBrand, String colour, double thePrice){
    this.itemType = item;
    this.brand = theBrand;
    this.colourway = colour;
    this.price = thePrice;
  }

  /**
  * Getter for the item type 
  *
  * @return the item type 
  * @author: V. Yang
  */
  public String getItemType(){
    return itemType;
  }

  /**
  * Getter for the item brand 
  * 
  * @return the brand of the item 
  * @author: V. Yang
  */
  public String getBrand(){
    return brand;
  }

  /**
  * Getter for the item colourway
  *
  * @return the colourway of the item 
  * @author: V. Yang
  */
  public String getColourway(){
    return colourway;
  }

  /**
  * Getter for the item price
  *
  * @return the price of the item 
  * @author: V. Yang
  */
  public double getPrice(){
    return price;
  }

}