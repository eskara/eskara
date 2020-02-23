package day51_abstraction;

public class TeslaSemi extends ElectricCar {


    public void load(String item) {
        System.out.println("TeslaSemi - load " + item + " by lowering the truck and opening...");
    }
    @Override
    public void start() {
        System.out.println("TeslaSemi - start truck by pressing a button...");
    }
    @Override
    public void charge() {
        System.out.println("TeslaSemi - plugin charge for 1 day...");
    }
    @Override
    public void drive() {
        System.out.println("TeslaSemi -  is driving...");
    }
}
