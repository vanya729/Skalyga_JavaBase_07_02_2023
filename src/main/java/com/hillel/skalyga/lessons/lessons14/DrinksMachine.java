package com.hillel.skalyga.lessons.lessons14;

public enum DrinksMachine {

    COFFEE("COFFEE"),
    TEA("TEA"),
    LEMONADE("LEMONADE"),
    MOJITO("MOJITO"),
    MINERAL("MINERAL"),
    COCA_COLA("COCA COLA");

    private String type;
    private String preparationDrink;
    DrinksMachine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

