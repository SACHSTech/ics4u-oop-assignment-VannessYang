package vkickz;

/**
* super class
*/
public class Human{
  private String firstName;
  private String lastName;

  public Human(String fname, String lname){
    firstName = fname;
    lastName = lname;
  }

  public String getFirstName(){
    return firstName;
  }

  public String getLastName(){
    return lastName;
  }

}