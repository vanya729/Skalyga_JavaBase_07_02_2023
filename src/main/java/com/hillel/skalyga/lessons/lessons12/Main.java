package com.hillel.skalyga.lessons.lessons12;

public class Main {
    public static void main(String[] args) {


        MusicStyles[] musicStyles = {
                new PopMusic("Fools Garden ", "Pink Floyd ","Bethoven"),
                new RockMusic("Queen ", "The Beatles ","BAH"),
                new ClassicMusic("ABBA ", "Rolling Stones ","Chaykovskiy")
        };

        for (MusicStyles musicStyles1 : musicStyles) {
            musicStyles1.playMusic();
//            System.out.println(musicStyles1.getClassic()+musicStyles1.getRock()+musicStyles1.getPop());
        }
        System.out.println();
        for (MusicStyles musicStyles1 : musicStyles) {
            System.out.println(musicStyles1.getClassic()+musicStyles1.getRock()+musicStyles1.getPop());

        }

    }
}

