package com.hillel.skalyga.lessons.lessons2;

public class Main {
    public static void main(String[] args) {

        double side1=4, side2=5, side3=6, volume;
        volume= side1*side2*side3;
        System.out.println("Volume of a parallelepiped = " + volume);
        double length = side1+side2+side3;
        System.out.println("The total length of all sides "+length);

        //      пробував колись писати використовуючи ввід з клавіатури, тому написав ще так

        /*
        Scanner scanner = new Scanner(System.in);
        double side1, side2, side3, volume;

        System.out.println("Input first side:");
        side1 = scanner.nextInt();
        System.out.println("First side:"+side1);

        System.out.println("Input second side:");
        side2 = scanner.nextInt();
        System.out.println("Second side:"+side2);

        System.out.println("Input third side:");
        side3 = scanner.nextInt();
        System.out.println("Third side :"+side3);

        volume = side1*side2*side3;
        System.out.println("\nVolume of a parallelepiped = " + volume);

        double length = side1+side2+side3;
        System.out.println("The total length of all sides "+length);

         */
    }
}

