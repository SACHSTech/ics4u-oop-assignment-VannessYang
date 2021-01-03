package vkickz;

import vkickz.*;
import java.io.*;
import java.util.ArrayList;

public class StoreMain{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader (new InputStreamReader(System.in));

    // Variables
    int numCustomer = 0;
    int count = 0;
    String fname = "a";
    String lname;
    String address;
    String cardNumber; 
    int noBid = 0;
    double bid; 
    double highestBid = 0;
    int highestCount = 0; 

    // ArrayList for customers
    ArrayList<Customer> customers = new ArrayList<Customer>();

    //System.out.print("How many customers are participating in the auction?: ");
    //numCustomer = Integer.parseInt(key.readLine());

    // Asking for the customer's details 
    // Loop ends when the user inputs nothing as the first name 
    while(!fname.equals("")){
      System.out.print("First Name: ");
      fname = key.readLine();
      if(!fname.equals("")){
        System.out.print("Last Name: ");
        lname = key.readLine();
        System.out.print("Address: ");
        address = key.readLine();
        System.out.print("Card Number: ");
        cardNumber = key.readLine();

        
        Customer customer = new Customer(fname, lname, address, cardNumber);
      
        customers.add(customer);
      }
    }

    numCustomer = Customer.getTotalCustomers();
    // System.out.println(numCustomer);

    //System.out.println(customers.get(1));

    Staff boss = new Staff("Vanness", "Yang", "founder", "5 years");
    Staff host = new Staff("Jaysse", "Lopez", "auction host", "7 years");
    Bag fanny = new Bag("bag", "Supreme", "red", 249.99, "waist bag", "FW 2018");
    Shoe yeezy = new Shoe("shoe", "Yeezy", "Carbon", 499.99, 10.5, "350 V2");

    System.out.println("Welcome to VKickz!");
    System.out.println(boss);
    System.out.println(host);
    System.out.println("Today, we have a shoe and a bag for auction! We will start with the shoe!");
    
    // Shoe Auction  
    System.out.println(yeezy);

    highestBid = 499.99;

    while(noBid < numCustomer - 1){
      noBid = 0;
      
      for(count = 1; count <= numCustomer; count++){
        System.out.println(customers.get(count - 1));
        System.out.print("Bid: $");
        bid = Double.parseDouble(key.readLine());
        if(bid > highestBid){
          highestBid = bid;
          highestCount = count - 1; 
          System.out.println("The highest bid is " + highestBid);
        }else{
          noBid = noBid + 1; 
        }
      }

    }

    System.out.println(customers.get(highestCount) + " is the winner! Your card will be charged automatically and you will have your order shipped to you!");

    // Bag Auction  
    System.out.println("Next, we will auction the bag!");
    System.out.println(fanny);

    noBid = 0;
    highestBid = 249.99;

    while(noBid < numCustomer - 1){
      noBid = 0;
      
      for(count = 1; count <= numCustomer; count++){
        System.out.println(customers.get(count - 1));
        System.out.print("Bid: $");
        bid = Double.parseDouble(key.readLine());
        if(bid > highestBid){
          highestBid = bid;
          highestCount = count - 1; 
          System.out.println("The highest bid is " + highestBid);
        }else{
          noBid = noBid + 1; 
        }
      }

    }

    System.out.println(customers.get(highestCount) + " is the winner! Your card will be charged automatically and you will have your order shipped to you!");

  }
}