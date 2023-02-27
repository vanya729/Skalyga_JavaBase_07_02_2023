package com.hillel.skalyga.lessons.lessons8;

import java.util.Arrays;

public class Homework1 {
    public static void main(String[] args) {
        int number = 7;
        int points = 0;
        int[] lottery_organizer = new int[number];
        int[] player = new int[number];

        for (int i = 0; i < lottery_organizer.length; i++) {
            lottery_organizer[i] = (int) ((Math.random() * 10));
            System.out.print(lottery_organizer[i] + " ");
        }
        System.out.println("lottery_organizer");
        for (int j = 0; j < player.length; j++) {
            player[j] = (int) ((Math.random() * 10));
            System.out.print(player[j] + " ");
        }

        System.out.println("player");
        Arrays.sort(lottery_organizer);
        Arrays.sort(player);
        System.out.println(Arrays.toString(lottery_organizer) + " lottery_organizer");
        System.out.println(Arrays.toString(player) + " player");


        for (int k = 0; k < lottery_organizer.length; k++) {

                if (lottery_organizer[k] == player[k]) {

                System.out.println("Coincidence index: "+ k);
                    points++;
                }

            }
        System.out.println("Number of matches: " + points);
        }

    }

        /*
        Зробити два масиви з 7 цифр, заповнених випадковими цифрами (від 0 до 9).
Перший масив - це числа, які загадані фірмою-організатором лотереї.
Другий масив - це числа, які вгадав гравець.
Після того, як обидва масиви заповнені цифрами, потрібно відсортувати їх за зростанням будь-яким способом.
У відсортованих масивах визначити кількість збігів, тобто чисел у двох масивах з однаковим індексом; Наприклад:
first[3] повинен дорівнювати second[3], як показано нижче.
Приклад виведення в консоль (збіглися 1й, 4й та 6й елементи):
[0, 1, 4, 5, 5, 8, 9]
[1, 1, 2, 3, 5, 6, 9]
Кількість збігів: 3
         */

