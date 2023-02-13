package com.hillel.skalyga.lessons.lessons2;

public class Second_homework {
    public static void main(String[] args) {
        //40° 41′ 21.15″ N
        // 74° 2′ 39.93″ W
        int value0_N = 40;
        int value1_N = 41;
        double value2_N = 21.15;

        int value0_W = 74;
        int value1_W = 2;
        double value2_W = 39.93;

        char degree = '°';
        char chN ='N';
        char chW ='W';
        char stroke = '′';
        char double_stroke = '″';

        System.out.println("Statue of Liberty location:"+
                value0_N+degree+" "+value1_N+stroke+" "+value2_N+double_stroke+chN+ ";  "+
                value0_W+degree+" "+value1_W+stroke+" "+value2_W+double_stroke+ " "+ chW);
    }
}

