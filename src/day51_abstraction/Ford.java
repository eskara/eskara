package day51_abstraction;

public class Ford extends ElectricCarObjects{

    public void start() {
        System.out.println("Ford - Push button to start...");
    }

    public void charge() {
        System.out.println("Ford - plugin to electric outlet...");
    }

    public void drive() {
        System.out.println("DRIVING MODE ACTIVATED - Ford Ready to Drive");
    }
}