package com.hillel.skalyga.lessons.lessons6;

public class Homework2 {
    public static void main(String[] args) {

        int counter = 0;
        for (int i = 1; i <= 200; i++) {
            int secondNum = (i/10)%10;
            if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9 || secondNum==4 || secondNum==9) {
                continue;
            }
            System.out.println("shuttle number = " + i);
            counter++;
            if (counter==100){
                break;
            }
        }

        System.out.println("count shuttle = " + counter);
    }
}
