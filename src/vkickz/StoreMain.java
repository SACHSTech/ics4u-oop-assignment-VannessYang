package vkickz;

import vkickz.*;
import java.io.*;
import java.util.ArrayList;

/**
* Store Main Class  
*/
public class StoreMain{
  public static void main(String[] args) throws IOException{

    welcome();
    auction();
    closing();

  }

  public static void welcome() throws IOException{
    BufferedReader key = new BufferedReader (new InputStreamReader(System.in));

    // Variables
    String next; 

    // Creating new staff objects 
    Staff boss = new Staff("Vanness", "Yang", "founder", "5 years");
    Staff host = new Staff("Jaysse", "Lopez", "auction host", "7 years");

    System.out.print("\033[H\033[2J");
    
    System.out.println("");
    System.out.println("Welcome to VKickz!");
    System.out.println("");
    System.out.println(boss);
    System.out.println("");
    System.out.println(host);
    System.out.println("");
    System.out.println("Press Enter when you want to move on to account creation!");
    next = key.readLine();
  }

  public static void auction() throws IOException{
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
    int round = 1;
    String next;

    // ArrayList for customers
    ArrayList<Customer> customers = new ArrayList<Customer>();

    // Creating new bag object
    Bag fanny = new Bag("bag", "Supreme", "red", 249.99, "waist bag", "FW 2018");

    // Creating new shoe object
    Shoe yeezy = new Shoe("shoe", "Yeezy", "Carbon", 499.99, 10.5, "350 V2");

    // Asking for the customer's details 
    // Loop ends when the user inputs nothing as the first name 
    while(!fname.equals("")){
      System.out.print("\033[H\033[2J");
      System.out.println("ACCOUNT CREATION");
      System.out.println("Enter blank for the first name if there are no more customers.");
      System.out.println("");
      System.out.print("First Name: ");
      fname = key.readLine();
      if(!fname.equals("")){
        System.out.print("Last Name: ");
        lname = key.readLine();
        System.out.print("Address: ");
        address = key.readLine();
        System.out.print("Card Number: ");
        cardNumber = key.readLine();

        // Creates a new customer object 
        Customer customer = new Customer(fname, lname, address, cardNumber);

        // Adds the customer object to the ArrayList
        customers.add(customer);

      }
    }

    // Getting the total number of customers
    numCustomer = Customer.getTotalCustomers();

    // Introduction
    System.out.print("\033[H\033[2J");
    System.out.println("Today, we have a shoe and a bag for auction! We will start with the shoe!");
    System.out.println("");
    System.out.println("Press Enter when you want to move on!");
    next = key.readLine();
    
    // Rules
    System.out.print("\033[H\033[2J");
    System.out.println("Here are the rules...");
    System.out.println("");
    System.out.println("You must enter a bid higher than the starting price and the other bids.");
    System.out.println("If you would like to skip, enter 0 as the input.");
    System.out.println("");
    System.out.println("Press Enter when you want to move on!");
    next = key.readLine();

    // Begin the auction
    System.out.print("\033[H\033[2J");
    System.out.println("We will now begin the auction with the shoe!");
    System.out.println("");
    System.out.println("Press Enter when you want to move on!");
    next = key.readLine();

    // Shoe Auction  
    System.out.print("\033[H\033[2J");
    System.out.println(yeezy);

    // Presetting the highest bid 
    highestBid = 499.99;

    while(noBid < numCustomer){
      // Resetting the number of no bids to 0
      noBid = 0;

      // Displaying the round number and highest bid
      System.out.print("\033[H\033[2J");
      System.out.println("ROUND " + round);
      System.out.println("The highest bid is $" + highestBid);
      System.out.println("");
      
      // Loop to keep asking the user for bids
      for(count = 1; count <= numCustomer; count++){
        System.out.println(customers.get(count - 1));
        System.out.print("Bid: $");
        bid = Double.parseDouble(key.readLine());
        System.out.println("");
        if(bid > highestBid){
          highestBid = bid;
          highestCount = count - 1; 
        }else{
          noBid = noBid + 1; 
        }
      }

      // Increasing the round number
      round++;

    }

    // Printing out the results of the shoe auction 
    System.out.print("\033[H\033[2J");
    if(highestBid > 499.99){
      System.out.println(customers.get(highestCount) + " is the winner! Your card will be charged automatically and you will have your order shipped to you!");
    }else{
      System.out.println("There is no winner.");
    }
    
    // Moving on to the next auction
    System.out.println("");
    System.out.println("Press Enter when you want to move on!");
    next = key.readLine();
    
    // Bag Auction  
    System.out.print("\033[H\033[2J");
    System.out.println("Next, we will auction the bag!");
    System.out.println("");
    System.out.println(fanny);
    System.out.println("");
    System.out.println("Press Enter when you want to move on!");
    next = key.readLine();

    // Re-initializing variables
    noBid = 0;
    highestBid = 249.99;
    round = 1;

    while(noBid < numCustomer){
      // Resetting the number of no bids to 0
      noBid = 0;

      // Displaying the round number and highest bid
      System.out.print("\033[H\033[2J");
      System.out.println("ROUND " + round);
      System.out.println("The highest bid is $" + highestBid);
      System.out.println("");
      
      // Loop to keep asking the user for bids
      for(count = 1; count <= numCustomer; count++){
        System.out.println(customers.get(count - 1));
        System.out.print("Bid: $");
        bid = Double.parseDouble(key.readLine());
        System.out.println("");
        if(bid > highestBid){
          highestBid = bid;
          highestCount = count - 1; 
        }else{
          noBid = noBid + 1; 
        }
      }

      // Increasing the round number
      round++;

    }

    // Printing out the results of the bag auction 
    System.out.print("\033[H\033[2J");
    if(highestBid > 249.99){
      System.out.println(customers.get(highestCount) + " is the winner! Your card will be charged automatically and you will have your order shipped to you!");
    }else{
      System.out.println("There is no winner.");
    }

    // Moving on to the closing 
    System.out.println("");
    System.out.println("Press Enter when you want to move on!");
    next = key.readLine();
  }

  public static void closing() throws IOException{
    BufferedReader key = new BufferedReader (new InputStreamReader(System.in));

    String next;

    System.out.print("\033[H\033[2J");
    
    System.out.println("");
    System.out.println("That concludes the auction! Thank you for participating! We hope to see you again!");
    System.out.println("");
    System.out.println("Press Enter to exit!");
    next = key.readLine();
  }

}