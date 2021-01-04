package vkickz;

/**
* OOP Assignment VKICKZ Auction Simulation (Human Superclass)
* @atuhor: V. Yang
* 
*/
public class Human{

  // Instance Variables
  private String firstName;
  private String lastName;

  /**
  * Constructor - creates a new human instance
  * @param fname - the human first name
  * @param lname - the human last name
  */
  public Human(String fname, String lname){
    firstName = fname;
    lastName = lname;
  }

  /**
  * Getter for Human first name 
  */
  public String getFirstName(){
    return firstName;
  }

  /**
  * Getter for Human last name   
  */
  public String getLastName(){
    return lastName;
  }

}