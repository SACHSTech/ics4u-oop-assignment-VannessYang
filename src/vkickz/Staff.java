package vkickz;

import vkickz.*;

/**
* OOP Assignment VKICKZ Auction Simulation (Staff Subclass)
* @atuhor: V. Yang
* 
*/
public class Staff extends Human{
  
  // Instance Variables
  private String title;
  private String experience;

  /**
  * Constructor - creates a new staff instance
  * @param fname - the staff first name
  * @param lname - the staff last name
  * @param jobTitle - the staff job title 
  * @param jobExperience - the staff years of experience 
  */
  public Staff(String fname, String lname, String jobTitle, String jobExperience){
    super(fname, lname);
    this.title = jobTitle;
    this.experience = jobExperience;
  }

  /**
  * Getter for the Staff job title 
  */
  public String getTitle(){
    return title;
  }

  /**
  * Getter for the Staff job experience 
  */
  public String getExperience(){
    return experience;
  }

  /**
  * toString to return the values of the Staff variables
  */
  public String toString(){
    return "My name is " + this.getFirstName() + " " + this.getLastName() + " and I am the " + title + " of VKickz with " + experience + " of sneaker experience.";
  }

}