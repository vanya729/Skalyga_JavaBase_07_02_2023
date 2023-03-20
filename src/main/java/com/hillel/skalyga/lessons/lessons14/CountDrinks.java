package com.hillel.skalyga.lessons.lessons14;

public class CountDrinks {

    private int coffeeCount = 0;
    private int teaCount = 0;
    private int lemonadeCount = 0;
    private int mojitoCount = 0;
    private int mineralWaterCount = 0;
    private int cocaColaCount = 0;

    public void makeCoffee() {
        System.out.println("Making coffee...");
    }
    public void makeTea() {
        System.out.println("Making tea...");
    }

    public void makeLemonade() {
        System.out.println("Making lemonade...");
    }

    public void makeMojito() {
        System.out.println("Making mojito...");
    }

    public void makeMineralWater() {
        System.out.println("Getting mineral water...");
    }

    public void makeCocaCola() {
        System.out.println("Getting Coca Cola...");
    }

    private static int totalDrinksMade = 0;
    private static double totalSales = 0.0;

    public void addDrink(DrinksMachine drink){
        switch (drink){
            case COFFEE:{
                makeCoffee();
                coffeeCount++;
                totalDrinksMade++;
                totalSales += Drinks.COFFEE_PRICE;
                break;
            }case TEA:{
                makeTea();
                teaCount++;
                totalDrinksMade++;
                totalSales += Drinks.TEA_PRICE;
                break;
            }case LEMONADE:{
                makeLemonade();
                lemonadeCount++;
                totalDrinksMade++;
                totalSales += Drinks.LEMONADE_PRICE;
                break;
            }case MOJITO:{
                makeMojito();
                mojitoCount++;
                totalDrinksMade++;
                totalSales += Drinks.MOJITO_PRICE;
                break;
            }case MINERAL:{
                makeMineralWater();
                mineralWaterCount++;
                totalDrinksMade++;
                totalSales += Drinks.MINERAL_PRICE;
                break;
            }case COCA_COLA:{
                makeCocaCola();
                cocaColaCount++;
                totalDrinksMade++;
                totalSales += Drinks.COLA_PRICE;
                break;
            }default:
                System.out.println("Invalid drink selected");
        }
        System.out.println("Count drinks: "+getTotalDrinksMade());
        System.out.println("Sum for pay: "+getTotalSales());
    }

    public static int getTotalDrinksMade() {
        return totalDrinksMade;
    }

    public static double getTotalSales() {
        return totalSales;
    }
}


