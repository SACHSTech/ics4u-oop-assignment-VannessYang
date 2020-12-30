package vkickz;

public class Item{
  // Instance Variables
  private String itemType;
  private String brand;
  private String colourway;
  private double price;
  private int stock;

  public Item(String item, String theBrand, String colour, double thePrice, int theStock){
    this.itemType = item;
    this.brand = theBrand;
    this.colourway = colour;
    this.price = thePrice;
    this.stock = theStock;
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

  public int getStock(){
    return stock;
  }

}