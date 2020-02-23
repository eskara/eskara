package day12_ternary_string;

public class AmazonNestedIf {
    public static void main(String[] args) {
        boolean isPrimeMemer =true;
        double totalOrderPrice=23.45;
        if(isPrimeMemer==true ){
            System.out.println("Eligible for free shipping");}else{
            if (totalOrderPrice>=25.0){
                System.out.println("Eligible for free shipping");}else{
                System.out.println("Not eligible for free shipping");
            }
        }

    }
}
