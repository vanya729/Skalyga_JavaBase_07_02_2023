package com.hillel.skalyga.lessons.lessons5;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name for first team:");
        String first_Team = scanner.nextLine();
        System.out.println("Enter name for second team: ");
        String second_Team = scanner.nextLine();


// ENTER SCORE FOR FIRST TEAM

        int first_pl1=0,first_pl2=0,first_pl3=0,first_pl4=0,first_pl5=0;

        System.out.println("Enter count kills 1 players first team:");
        if (scanner.hasNextInt()) {
            first_pl1 = scanner.nextInt();
        } else {
            System.out.println("Input ONLY NUMBER");
            System.exit(0);
        }

        System.out.println("Enter count kills 2 players first team:");
        if (scanner.hasNextInt()) {
            first_pl2 = scanner.nextInt();
        } else {
            System.out.println("Input ONLY NUMBER");
            System.exit(0);
        }

        System.out.println("Enter count kills 3 player first team:");
        if (scanner.hasNextInt()) {
            first_pl3 = scanner.nextInt();
        } else {
            System.out.println("Input ONLY NUMBER");
            System.exit(0);
        }

        System.out.println("Enter count kills 4 player first team:");
        if (scanner.hasNextInt()) {
            first_pl4 = scanner.nextInt();
        } else {
            System.out.println("Input ONLY NUMBER");
            System.exit(0);
        }

        System.out.println("Enter count kills 5 player first team:");
        if (scanner.hasNextInt()) {
            first_pl5 = scanner.nextInt();
        } else {
            System.out.println("Input ONLY NUMBER");
            System.exit(0);
        }

        double score_first = ((double) first_pl1+first_pl2+first_pl3+first_pl4+first_pl5)/5;
        System.out.println("SCORE FIST TEAM:"+score_first );

        // ENTER SCORE FOR SECOND TEAM

        int second_pl1=0,second_pl2=0,second_pl3=0,second_pl4=0,second_pl5=0;

        System.out.println("Enter count kills 1 player second team:");
        if (scanner.hasNextInt()) {
            second_pl1 = scanner.nextInt();
        } else {
            System.out.println("Input ONLY NUMBER");
            System.exit(0);
        }

        System.out.println("Enter count kills 2 player second team:");
        if (scanner.hasNextInt()) {
            second_pl2 = scanner.nextInt();
        } else {
            System.out.println("Input ONLY NUMBER");
            System.exit(0);
        }

        System.out.println("Enter count kills 3 player second team:");
        if (scanner.hasNextInt()) {
            second_pl3 = scanner.nextInt();
        } else {
            System.out.println("Input ONLY NUMBER");
            System.exit(0);
        }

        System.out.println("Enter count kills 4 player second team:");
        if (scanner.hasNextInt()) {
            second_pl4 = scanner.nextInt();
        } else {
            System.out.println("Input ONLY NUMBER");
            System.exit(0);
        }

        System.out.println("Enter count kills 5 player second team:");
        if (scanner.hasNextInt()) {
            second_pl5 = scanner.nextInt();
        } else {
            System.out.println("Input ONLY NUMBER");
            System.exit(0);
        }

        double score_second = ((double) second_pl1+second_pl2+second_pl3+second_pl4+second_pl5)/5;
        System.out.println("SCORE FIST TEAM:"+score_second);

        if (score_first>score_second){
            System.out.println("Win "+first_Team+" scored "+score_first+" points");
        }else if (score_first<score_second){
            System.out.println("Win "+second_Team+" scored "+score_second+" points");
        }else{
            System.out.println("A DRAW!");
        }

    }
}

