package com.hillel.skalyga.lessons.lessons8;

import java.util.Arrays;
import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m=0,n=0;

        while (true) {
            System.out.println("Input number(m,n): ");
            if (scanner.hasNextInt()) {
                m = scanner.nextInt();
                n = scanner.nextInt();
                System.out.println("m= " + m);
                System.out.println("n= " + n);
                if (m < 0 ) {
                    System.out.println("Enter positive m");
                    scanner.nextLine();
                    continue;
                } if ( n < 0) {
                    System.out.println("Enter positive n");
                    scanner.nextLine();
                    continue;
                }
                else {
                    break;
                }
            } else {
                System.out.println("Input ONLY NUMBER");
                scanner.nextLine();

            }
        }
        int[][] array1 = new int[m][n];
        int[][] array2 = new int[n][m];

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                array1[i][j] = (int) ((Math.random() * 10));
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println();



        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array2[i][j]= array1[j][i];
                System.out.print(array2[i][j]+ " ");
            }
            System.out.println();
        }

/*
Транспонуйте матрицю M x N. Розміри M та N задаються з консолі.
Після введення повинні автоматично створюватися два масиви розміром M x N перший та N x M другий.
 */
    }
}
