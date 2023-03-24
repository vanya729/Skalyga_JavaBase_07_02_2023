package com.hillel.skalyga.lessons.lessons15;

public class ArrayUnit {

    public static double sumArray(int[] array, int length){
        int sum=0;
        for (int i = 0; i <array.length ; i++) {
            sum += array[i];
        }
        return array.length == 0 ? 0.0 : (double) sum/ array.length;
        //что бы при проверке не было NaN
    }

    public static boolean matrix(int[][] arr){
        int row = arr.length;
        int col = arr.length;
        return (row==col);
    }
}

