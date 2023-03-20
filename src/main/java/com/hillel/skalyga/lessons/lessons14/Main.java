package com.hillel.skalyga.lessons.lessons14;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
    }
    static void run() {
        Scanner scanner = new Scanner(System.in);


        DrinksMachine[] drinkType = DrinksMachine.values();
        DrinksMachine userDrinkType = null;

        while (true) {
            boolean isStop = false;
            while (true) {
                System.out.println("Please enter drink from list: " + Arrays.toString(drinkType));
                System.out.println("If you want to go to write NO");
                String userValue = scanner.nextLine();

                if (userValue.toUpperCase().equals("NO")) {
                    isStop = true;
                    break;
                }

                userValue = userValue.toUpperCase();
                for (DrinksMachine drinksMachine : drinkType) {
                    if (userValue.equals(drinksMachine.toString())) {
                        userDrinkType = DrinksMachine.valueOf(userValue);
                        break;
                    }
                    userDrinkType=null;
                }

                if (userDrinkType != null) {
                    break;
                } else {
                    System.out.println("Wrong data, try again");
                }
            }

            if (isStop) {
                break;
            }

            CountDrinks countDrinks = new CountDrinks();
            countDrinks.addDrink(userDrinkType);
            boolean isInputValid = false;
            if (isInputValid) {
                switch (userDrinkType) {
                    case TEA: {
                        System.out.println("Your drink: " + DrinksMachine.TEA.getType());
                        break;
                    }
                    case COFFEE: {
                        System.out.println("Your drink: " + DrinksMachine.COFFEE.getType());
                        break;
                    }
                    case LEMONADE: {
                        System.out.println("Your drink: " + DrinksMachine.LEMONADE.getType());
                        break;
                    }
                    case MOJITO: {
                        System.out.println("Your drink: " + DrinksMachine.MOJITO.getType());
                        break;
                    }
                    case MINERAL: {
                        System.out.println("Your drink: " + DrinksMachine.MINERAL.getType());
                        break;
                    }
                    case COCA_COLA: {
                        System.out.println("Your drink: " + DrinksMachine.COCA_COLA.getType());
                        break;
                    }
                    default: {

                        System.out.println("Wrong data, try again.");
                    }
                }
            } else {
                System.out.println("Wrong data, try again.");

            }
        }
    }
}


