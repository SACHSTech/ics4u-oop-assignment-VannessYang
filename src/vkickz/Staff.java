package vkickz;

import vkickz.*;

public class Staff extends Human{
  private String title;
  private String experience;

  
  public Staff(String fname, String lname, String jobTitle, String jobExperience){
    super(fname, lname);
    this.title = jobTitle;
    this.experience = jobExperience;
  }

  public String getTitle(){
    return title;
  }

  public String getExperience(){
    return experience;
  }

  public String toString(){
    return "My name is " + this.getFirstName() + " " + this.getLastName() + " and I am the " + title + " of VKickz with " + experience + " of sneaker experience.";
  }

}