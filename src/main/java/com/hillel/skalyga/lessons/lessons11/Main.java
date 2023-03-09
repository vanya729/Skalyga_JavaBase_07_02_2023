package com.hillel.skalyga.lessons.lessons11;

public class Main {
    public static void main(String[] args) {
        FitnesData user1 = new FitnesData("Piter", "Parker", 12, 12, 1990,
                "piter.parker@gmail.com", "+3801324567", 80, 65, 10581);
        FitnesData user2 = new FitnesData("Oleg", "Viktorov", 17, 7, 2004,
                "ileg.viktorov@gmail.com", "+3807896452", 75, 73, 13508);
        FitnesData user3 = new FitnesData("Petya", "Pypkin", 25, 7, 2001,
                "patya.ouokin@gmail.com", "+38078595452", 86, 71, 11588);

        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();

        user2.setLastName("Bykin");
        user2.setPressure(84);
        user2.setWeight(76);

        user3.setLastName("Rooney");
        user3.setPressure(64);
        user3.setWeight(105);

        user2.printAccountInfo();
        user3.printAccountInfo();
    }
}
