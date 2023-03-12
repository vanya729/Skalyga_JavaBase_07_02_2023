package com.hillel.skalyga.lessons.lessons12;

public class RockMusic extends MusicStyles {

    public RockMusic(String pop, String rock, String classic) {
        super(pop, rock, classic);
    }

    @Override
    void playMusic(){
        System.out.println("Playing ROCK music!!!");
    }


}
