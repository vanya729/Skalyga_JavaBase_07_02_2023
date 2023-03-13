package com.hillel.skalyga.lessons.lessons8;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = getCorrectNum(scanner);
        int m = getCorrectNum(scanner);

        int [][] arr1 = new int[n][m];
        int [][] arr2 = new int[m][n];
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr1[i].length ; j++) {
                arr1[i][j]= (int) (Math.random()*101);
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < arr2.length ; i++) {
            for (int j = 0; j < arr2[i].length ; j++) {
                arr2[i][j]= arr1[j][i];
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

/*
Транспонуйте матрицю M x N. Розміри M та N задаються з консолі.
Після введення повинні автоматично створюватися два масиви розміром M x N перший та N x M другий.
 */
    }

    static int getCorrectNum(Scanner scanner) {
        int num = 0;
        System.out.println("Enter n, m");
        while (true) {
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
            if (num < 0) {
                System.out.println("Enter positive number");
            } else {
                break;
            }
            scanner.nextLine();
        }else{
            System.out.println("Error");
            scanner.nextLine();
        }
    }
        return num;
    }
}

