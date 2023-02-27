package com.hillel.skalyga.lessons.lessons6;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userNum =0;
        int randNumber = (int) (Math.random() * 11);


        while (true) {
            if (scanner.hasNextInt() ) {
                userNum = scanner.nextInt();
                if(userNum>10){
                    System.out.println("Enter number for 0-10");
                    scanner.nextLine();
                }else {
                    break;
                }
            } else {
                System.out.println("Wrong data!!!");
                scanner.nextLine();
            }




//        while (true) {
//            if (scanner.hasNextInt() ) {
//                userNum = scanner.nextInt();
//                break;
//            } else {
//                System.out.println("Wrong data!!!");
//                scanner.nextLine();
////                continue;
//            }

        }
        for (int popitok = 3; popitok >0 ; --popitok) {

            if (popitok==1) {
                System.out.println("You lose( , correct answer =" + randNumber);
                break;
            }

            if (userNum>randNumber){
                System.out.println("Your number is less than expected, number of attempts:" + popitok);
                userNum=scanner.nextInt();
            } else if (userNum<randNumber){
                System.out.println("Your number is higher, number of attempts:" + popitok);
                userNum=scanner.nextInt();
            } else if (userNum==randNumber){
                System.out.println("You WIN!!!");
                break;
            }

        }
    }
}