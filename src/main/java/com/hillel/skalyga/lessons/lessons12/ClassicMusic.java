package com.hillel.skalyga.lessons.lessons12;

public class ClassicMusic extends MusicStyles {

    public ClassicMusic(String pop, String rock, String classic) {
        super(pop, rock, classic);
    }

    @Override
    void playMusic(){
        System.out.println("Playing CLASSIC music!!!");

    }

}


