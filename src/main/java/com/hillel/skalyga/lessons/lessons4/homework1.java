package com.hillel.skalyga.lessons.lessons4;

public class homework1 {
    public static void main(String[] args) {

        int warrior_li = 13;
        int archer_li = 24;
        int rider_li = 46;

        int warrior_min = 9;
        int archer_min = 35;
        int rider_min = 12;

        int n_li=860;
        double n_min=n_li * 1.5;

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


        System.out.println("\n TOTAL ATTACK LI:"+  total_li+ "\n TOTAL ATTACK MIN:"+total_min);

    }
}
