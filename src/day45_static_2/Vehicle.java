package day45_static_2;

public class Vehicle {
    private String model;
    public static int numberOfVehicle=0;

    public Vehicle() {
        System.out.println("Parking a Unknown model Vehicle");
        numberOfVehicle++;
    }
    public Vehicle(String model) {
        System.out.println("parking "+model);
        this.model = model;
        numberOfVehicle++;
    }
    public String getModel() {

        return model;

    }
    public void setModel(String model) {
        this.model = model;
    }
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                '}';
    }
}




