package org.example;

public class Destination {

    public Integer destination(int destination) {
        int costOfDestination = 0;

        if (destination > 30) {
            costOfDestination += 300;
        } else if (destination < 30 && !(destination < 0)) {
            costOfDestination += 200;
        } else if (destination < 10 && !(destination < 0)) {
            costOfDestination += 100;
        } else if (destination < 2 && !(destination < 0)) {
            costOfDestination += 50;
        }
        return costOfDestination;
    }
}
