package com.hillel.skalyga.lessons15;

import com.hillel.skalyga.lessons.lessons15.ArrayUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMain {

    @Test
    void TestMethodSumArr1(){
        int[] arr = { };
        assertEquals(0.0, ArrayUnit.sumArray(arr, arr.length));
        //перевірка на пустий масив
    }
    @Test
    void TestMethodSumArr2(){
        int[] arr = {1};
        assertEquals(1.0, ArrayUnit.sumArray(arr, arr.length));
        //передача масиву з одного елемента
    }
    @Test
    void TestMethodSumArr3(){
        int[] arr = {1, 2, 3};
        assertEquals(2.0, ArrayUnit.sumArray(arr, arr.length));
        //передача масиву з декількох елементів
    }
    @Test
    void TestMethodSumArr4(){
        int[] arr = {0, 0, 0};
        assertEquals(0.0, ArrayUnit.sumArray(arr, arr.length));
        // передача масивів тільки з 0
    }
    @Test
    void TestMethodSumArr5(){
        int[] arr = {-1, -2, -3};
        assertEquals(-2.0, ArrayUnit.sumArray(arr, arr.length));
        // передача масивів з від'ємними значеннями
    }

    //----------------------------------------

    @Test
    void TestMethodmatrixElement1(){
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertTrue(ArrayUnit.matrix(arr));
        //перевіряємо, чи метод повертає true для квадратної матриці.
    }
    @Test
    void TestMethodMatrixElement2(){
        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};
        assertFalse(ArrayUnit.matrix(arr));
        //перевіряємо, що метод повертає false для квадратної матриці.
    }
    @Test
    void TestMethodMatrixElement3(){
        int[][] arr = {};
        assertTrue(ArrayUnit.matrix(arr));
        //перевіряємо, що метод повертає true для порожнього масиву.
    }
    @Test
    void TestMethodMatrixElement4(){
        int[][] arr = {{1}};
        assertTrue(ArrayUnit.matrix(arr));
        //перевіряємо, що метод повертає true для квадратної матриці 1х1
    }
}
