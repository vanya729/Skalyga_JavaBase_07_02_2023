package com.hillel.skalyga.lessons.lessons4;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input warrior_li attack rate: ");
        int warrior_li = scanner.nextInt();
        System.out.println("Input archer_li attack rate: ");
        int archer_li = scanner.nextInt();
        System.out.println("Input rider_li attack rate: ");
        int rider_li = scanner.nextInt();

        System.out.println("Input warrior_min attack rate: ");
        int warrior_min = scanner.nextInt();
        System.out.println("Input archer_min attack rate: ");
        int archer_min = scanner.nextInt();
        System.out.println("Input rider_min attack rate: ");
        int rider_min = scanner.nextInt();

        System.out.println("Enter the number of people in the army Li:");
        int n_li=scanner.nextInt();
        System.out.println("Enter the number of people in the army Min:");
        double n_min=scanner.nextInt() * 1.5;

        int power_warrior_li = warrior_li*n_li;
        int power_archer_li = archer_li*n_li;
        int power_rider_li = rider_li*n_li;
        int total_li= power_archer_li+power_rider_li+power_warrior_li;
        System.out.println(" total attack rate warrior_li: "+power_warrior_li);
        System.out.println(" total attack rate archer_li: "+power_archer_li);
        System.out.println(" total attack rate rider_li: "+power_rider_li);
        System.out.println(" total attack Li : "+total_li);


        double power_warrior_min = warrior_min*n_min;
        double power_archer_min = archer_min*n_min;
        double power_rider_min = rider_min*n_min;
        double total_min= power_archer_min+power_rider_min+power_warrior_min;
        System.out.println("\n total attack rate warrior_min: "+power_warrior_min);
        System.out.println(" total attack rate archer_min: "+power_archer_min);
        System.out.println(" total attack rate rider_min: "+power_rider_min);
        System.out.println(" total attack Min : "+total_min);

    }
}
