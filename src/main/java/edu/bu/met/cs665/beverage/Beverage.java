package edu.bu.met.cs665.beverage;

public abstract class Beverage {
    private int milk;
    private int sugar;
    private double price;

    protected Beverage(double basePrice){
        milk = 0;
        sugar = 0;
        price = basePrice;
    }

    public void addMilk(int units){
        if(units >= 0 && milk + units <= 3){
            milk += units;
            price += 0.50;
        }
        else{
             throw new IllegalArgumentException("less milk please" );
        }
    }

    public void addSugar(int units){
        if(units >= 0 && sugar + units <= 3){
            sugar += units;
            price += 0.50;
        }
        else{
             throw new IllegalArgumentException("less sugar please" );
        }
    }

    public int getMilk(){
        return milk;
    }
    public int getSugar(){
        return sugar;
    }
    public double getPrice(){
        return price;
    }
 
    public abstract void brew();
}
