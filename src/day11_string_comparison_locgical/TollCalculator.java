package day11_string_comparison_locgical;

public class TollCalculator {
    public static void main(String[] args) {
        String vehicleType="car";
        boolean isRushHour=true;
        double totalPrice=0;
        if (vehicleType.equals("car")&&isRushHour==false){
            totalPrice=3.0;}else if(vehicleType.equals("car")&&isRushHour==true){
            totalPrice=7.50;}else if(vehicleType.equals("truck")&&isRushHour==false){
            totalPrice=4.75;}else if(vehicleType.equals("truck")&&isRushHour==true){
            totalPrice=11.50;
        }
        System.out.println("Toll cost: $"+totalPrice);
    }
}
