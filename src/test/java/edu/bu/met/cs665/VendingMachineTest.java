package edu.bu.met.cs665;

import edu.bu.met.cs665.beverage.Americano;
import edu.bu.met.cs665.beverage.Beverage;
import edu.bu.met.cs665.beverage.BlackTea;
import edu.bu.met.cs665.beverage.GreenTea;
import edu.bu.met.cs665.beverage.LatteMacchiato;
import edu.bu.met.cs665.beverage.YellowTea;
import edu.bu.met.cs665.vendingmachine.VendingMachine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest{
    @Test
    public void testAddMilk() {

        VendingMachine v = new VendingMachine();
        Beverage drink = new YellowTea();
        v.makeBeverage(drink, 3, 0);

        assertEquals(3, drink.getMilk());
    }

    @Test
    public void testAddSugar() {

        VendingMachine v = new VendingMachine();
        Beverage drink = new Americano();
        v.makeBeverage(drink, 1, 2);

        assertEquals(2, drink.getSugar());
    }

    @Test
    public void testFinalPrice() {

        VendingMachine v = new VendingMachine();
        Beverage drink = new LatteMacchiato();
        v.makeBeverage(drink, 1, 3);

        assertEquals(4.0, v.getPrice(drink),0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMilkOverLimit() {

        VendingMachine v = new VendingMachine();
        Beverage drink = new BlackTea();
        v.makeBeverage(drink, 4, 3);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testSugarOverLimit() {

        VendingMachine v = new VendingMachine();
        Beverage drink = new GreenTea();
        v.makeBeverage(drink, 2, 5);

    }
}