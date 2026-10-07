package edu.bu.met.cs665.vendingmachine;
import edu.bu.met.cs665.beverage.Beverage;

public class VendingMachine {
    
    public Beverage makeBeverage(Beverage beverage, int milkunit, int sugarunit){
        beverage.addMilk(milkunit);
        beverage.addSugar(sugarunit);
        beverage.brew();
        return beverage;
    }

    public double getPrice(Beverage beverage){

        return beverage.getPrice();

    }
}
