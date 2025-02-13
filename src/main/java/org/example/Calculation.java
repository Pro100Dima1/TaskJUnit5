package org.example;

public class Calculation {

    static Destination destination1 = new Destination();
    static Demension demension = new Demension();
    static Fragility fragility = new Fragility();
    static WorkLoadService workLoadService = new WorkLoadService();

    public static Float costCalculation(int destination, String demensions, boolean infoAboutFragility, String workloadService) {

        int a = destination1.destination(destination);
        int b = demension.demension(demensions);
        int c = fragility.fragility(infoAboutFragility, destination);
        float z = workLoadService.workLoadService(workloadService);

        float cost = (a + b + c) * z;

        if (cost < 400) {
            System.out.println("Минимальная сумма доставки 400 рублей");
        } else {
            return cost;
        }
        return cost;
    }
}
