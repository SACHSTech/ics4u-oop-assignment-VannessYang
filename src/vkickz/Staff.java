package vkickz;

import vkickz.*;

/**
* OOP Assignment VKICKZ Auction Simulation (Staff Subclass)
* @author: V. Yang
* 
*/
public class Staff extends Human{
  
  // Instance Variables
  private String title;
  private String experience;

  /**
  * Constructor - creates a new staff instance
  *
  * @param fname - the staff first name
  * @param lname - the staff last name
  * @param jobTitle - the staff job title 
  * @param jobExperience - the staff years of experience 
  * @author: V. Yang
  */
  public Staff(String fname, String lname, String jobTitle, String jobExperience){
    super(fname, lname);
    this.title = jobTitle;
    this.experience = jobExperience;
  }

  /**
  * Getter for the Staff job title 
  *
  * @return the staff job title 
  * @author: V. Yang
  */
  public String getTitle(){
    return title;
  }

  /**
  * Getter for the Staff job experience 
  *
  * @return the staff job experience 
  * @author: V. Yang
  */
  public String getExperience(){
    return experience;
  }

  /**
  * toString to return the values of the Staff variables
  *
  * @return a description of the staff 
  * @author: V. Yang
  */
  public String toString(){
    return "My name is " + this.getFirstName() + " " + this.getLastName() + " and I am the " + title + " of VKickz with " + experience + " of sneaker experience.";
  }

}