package org.example;

public class Fragility {
    public Integer fragility(boolean fragility, int destination) {
        int costOfFragility = 0;

        if (fragility && destination < 30) {
            costOfFragility += 300;
        } else if (!fragility) {
            System.out.println("Груз не хрупкий");
        }
        return costOfFragility;
    }
}
