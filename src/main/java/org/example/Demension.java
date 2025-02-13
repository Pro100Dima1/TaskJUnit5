package org.example;

public class Demension {
    public Integer demension(String demensions) {
        int costOfDemension = 0;

        if (demensions == "large") {
            costOfDemension += 200;
        } else if (demensions == "small") {
            costOfDemension += 100;
        }
        return costOfDemension;
    }
}
