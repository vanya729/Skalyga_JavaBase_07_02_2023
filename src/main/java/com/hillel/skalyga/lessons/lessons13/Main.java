package com.hillel.skalyga.lessons.lessons13;

public class Main {
    public static void main(String[] args) {
        Androids smartphones=new Androids();
        IPhones iphone=new IPhones();

        smartphones.call("1234567");
        smartphones.sms("1234567 ","Hello its android");
        smartphones.internet("https://www.google.com/search");
        System.out.println("Operation system "+smartphones.getOS());

        System.out.println();

        iphone.call("76543210");
        iphone.sms("76543210 ","Hello its iPhone");
        iphone.internet("https://www.safari.com/search");
        System.out.println("Operation system "+iphone.getOS());


    }
}
