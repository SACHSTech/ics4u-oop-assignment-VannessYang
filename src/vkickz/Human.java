package vkickz;

/**
* OOP Assignment VKICKZ Auction Simulation (Human Superclass)
* @author: V. Yang
* 
*/
public class Human{

  // Instance Variables
  private String firstName;
  private String lastName;

  /**
  * Constructor - creates a new human instance
  *
  * @param fname - the human first name
  * @param lname - the human last name
  * @author: V. Yang
  */
  public Human(String fname, String lname){
    firstName = fname;
    lastName = lname;
  }

  /**
  * Getter for Human first name 
  *
  * @return the first name of the human
  * @author: V. Yang
  */
  public String getFirstName(){
    return firstName;
  }

  /**
  * Getter for Human last name   
  *
  * @return the last name of the human 
  * @author: V. Yang
  */
  public String getLastName(){
    return lastName;
  }

}