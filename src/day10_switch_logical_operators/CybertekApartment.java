package day10_switch_logical_operators;

public class CybertekApartment {
    public static void main(String[] args) {
        double startingPrice =0.0;
        int numberOfBedrooms=2;
        switch (numberOfBedrooms){
            case 0:
                startingPrice=1200.0;
                System.out.println("Studio is selected");
                break;
            case 1:
                startingPrice=1400.0;
                System.out.println("One bedroom is selected");
                break;
            case 2:
                startingPrice=1650.0;
                System.out.println("Two bedroom is selected");
                break;
            case 3:
                startingPrice=2000.0;
                System.out.println("Three bedroom is selected");
                break;

            default:
                System.out.println("No such bedroomis selected");

        }
        System.out.println("Starting price is : $"+startingPrice);
    }
}
