package day51_abstraction;

public class Tesla extends ElectricCarObjects {
//public abstract void start();
//public abstract void start();
public void start(){
    System.out.println("Tesla is starting quietly...");
    System.out.println("Change to DRIVE MODE...");
}
    //public abstract void charge();
    public void charge(){
        System.out.println("Tesla charging - Plugin to Electric outlet...");
    }

    public void drive() {
        System.out.println("DRIVING MODE ACTIVATED - Tesla Ready to Drive");
    }
    // public abstract void turn();  error

}
