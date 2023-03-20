package com.hillel.skalyga.lessons.lessons14;

public class Drinks {
    public static final double COFFEE_PRICE =3.0;
    public static final double TEA_PRICE =1.5;
    public static final double LEMONADE_PRICE =3.2;
    public static final double MOJITO_PRICE =5.0;
    public static final double MINERAL_PRICE =2.0;
    public static final double COLA_PRICE =3.5;


    private String type;


    public Drinks(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
