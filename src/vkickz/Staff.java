package vkickz;

import vkickz.*;

public class Staff extends Human{
  private String title;
  private String legitCheck;
  private String experience;

  public Staff(String fname, String lname, String jobTitle, String legit, String jobExperience){
    super(fname, lname);
    this.title = jobTitle;
    this.legitCheck = legit;
    this.experience = jobExperience;
  }

  public String getTitle(){
    return title;
  }

  public String getLegitCheck(){
    return legitCheck;
  }

  public String getExperience(){
    return experience;
  }

}