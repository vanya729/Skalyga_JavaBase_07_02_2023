package com.hillel.skalyga.lessons.lessons12;

public class PopMusic extends MusicStyles {

    public PopMusic(String pop, String rock, String classic) {
        super(pop, rock, classic);
    }

    @Override
    void playMusic(){
        System.out.println("Playing POP music!!!");
    }

    @Override
    public String toString() {
        return "PopMusic{}"+getPop();
    }
}
