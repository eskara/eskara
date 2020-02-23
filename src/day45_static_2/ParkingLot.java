package day45_static_2;

public class ParkingLot {
    public static void main(String[] args) {
        //print number of vehicles static way
        System.out.println(Vehicle.numberOfVehicle);
        //System.out.println(Vehicle.model);Model is non static
        Vehicle v1=new Vehicle("tesla cybertruck");
        System.out.println(Vehicle.numberOfVehicle);//1
        System.out.println(v1.numberOfVehicle);

        Vehicle v2=new Vehicle("Ford f150");
        System.out.println(Vehicle.numberOfVehicle);//2
        System.out.println(v2.numberOfVehicle);//2

        Vehicle.numberOfVehicle=10;
        System.out.println(v1.numberOfVehicle);
        System.out.println(v2.numberOfVehicle);
        Vehicle v3=new Vehicle("Chevy Silverado");//Vehicle constructor runs
        System.out.println(Vehicle.numberOfVehicle);
        System.out.println(v1.numberOfVehicle);
        System.out.println(v2.numberOfVehicle);
        System.out.println(v3.numberOfVehicle);

        v2.numberOfVehicle=300;


    }
}
