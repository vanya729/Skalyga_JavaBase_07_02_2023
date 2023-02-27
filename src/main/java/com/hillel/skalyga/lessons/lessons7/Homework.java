package com.hillel.skalyga.lessons.lessons7;

public class Homework {
    public static void main(String[] args) {

        int [] team1 = new int[25];
        int [] team2 = new int[25];
        int sumTeam1 = 0;
        int sumTeam2 = 0;
        double sredTeam1 = 0;
        double sredTeam2 = 0;

        System.out.println("Years man to first team: ");
        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int )((Math.random()*(40-18+1))+18);
            System.out.print(team1[i] + " ");

        }

        for (int i = 0; i < team1.length; i++) {
            sumTeam1+=team1[i];
        }
        sredTeam1=(double) sumTeam1/team1.length;
        System.out.println("\nArithmetic average of the first team: "+sumTeam1 +"/"+team1.length+ "="+sredTeam1);


// -----------------------------------------------------------------------------------------------------



        System.out.println("\n \nYears man to second team: ");
        for (int i = 0; i < team2.length; i++) {
            team2[i] = (int )((Math.random()*(40-18+1))+18);
            System.out.print(team2[i] + " ");

        }
            for (int j = 0; j < team2.length; j++) {
                sumTeam2+=team2[j];
            }

        sredTeam2=(double) sumTeam2/team2.length;
        System.out.println("\nArithmetic average of the second team: "+sumTeam2 +"/"+team2.length+ "="+sredTeam2+"\n");

        if (sredTeam1>sredTeam2){
            System.out.println("First team older");

        }else if (sredTeam1<sredTeam2){
            System.out.println("Second team older");

        }else{
            System.out.println("Age is the same");
        }
            /*
            Є дві команди регбі з 25 гравців різного віку у кожній.

            Вік беремо випадковим чином в діапазоні від 18 до 40.

            Виведіть у двох рядках вік гравців кожної команди.

            Порахуйте середній вік гравців кожної команди та виведіть на екран.
             */
    }
}
