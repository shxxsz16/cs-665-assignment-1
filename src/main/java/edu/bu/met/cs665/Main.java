/**
 * Name: Zihan Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/06/2026
 * File Name: Main.java
 * Description: here is the main class
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.beverage.*;
import edu.bu.met.cs665.vendingmachine.VendingMachine;



/**
 * This is the Main class.
 */


public class Main {

  public static void main(String[] args) {

    VendingMachine v = new VendingMachine();

    Beverage drink = new YellowTea();

    v.makeBeverage(drink, 3, 2);

    System.out.println("Milk: " + drink.getMilk());
    System.out.println("Sugar: " + drink.getSugar());
    System.out.println("Final price: " + v.getPrice(drink));
  }
}