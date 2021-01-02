package vkickz;

import vkickz.*;
import java.io.*;

public class StoreMain{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader (new InputStreamReader(System.in));

    int numCustomer = 0;
    String fname = "a";
    String lname;
    String address;
    String cardNumber; 

    while(!fname.equalsIgnoreCase("")){
      System.out.print("First Name: ");
      fname = key.readLine();
      if(!fname.equalsIgnoreCase("")){
        System.out.print("Last Name: ");
        lname = key.readLine();
        System.out.print("Address: ");
        address = key.readLine();
        System.out.print("Card Number: ");
        cardNumber = key.readLine();
        numCustomer++; 
      }
    }

  }
}