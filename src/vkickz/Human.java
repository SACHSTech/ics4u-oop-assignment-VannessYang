package vkickz;

/**
* Human Super Class
*/
public class Human{

  // Instance Variables
  private String firstName;
  private String lastName;

  /**
  * Human Constructor  
  */
  public Human(String fname, String lname){
    firstName = fname;
    lastName = lname;
  }

  /**
  * Getter for First Name 
  */
  public String getFirstName(){
    return firstName;
  }

  /**
  * Getter for Last Name  
  */
  public String getLastName(){
    return lastName;
  }

}