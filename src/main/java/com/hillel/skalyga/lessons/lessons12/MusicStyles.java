package com.hillel.skalyga.lessons.lessons12;

public abstract class MusicStyles {

     private String pop,rock,classic;

    public MusicStyles(String pop, String rock, String classic) {
        this.pop = pop;
        this.rock = rock;
        this.classic = classic;

    }

    public String getPop() {
        return pop;
    }

    public String getRock() {
        return rock;
    }

    public String getClassic() {
        return classic;
    }

    abstract void playMusic();

    @Override
    public String toString() {
        return "MusicStyles{" +
                "pop='" + getPop() + '\'' +
                ", rock='" + getRock() + '\'' +
                ", classic='" + getClassic() + '\'' +
                '}';
    }
}
