package com.hillel.skalyga.lessons.lessons10;

public class Burger {
    int countMeat;
    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;


    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise,int countMeat) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println(bun+" "+meat+" "+greens+" "+mayonnaise);
    }

    public Burger(String bun, String meat,int countMeat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println(bun+" "+meat+" "+greens);
    }

    public Burger (String bun,int countMeat ,String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat + " x2";
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println(bun+" "+this.meat+" "+greens+" "+mayonnaise);
    }

}
