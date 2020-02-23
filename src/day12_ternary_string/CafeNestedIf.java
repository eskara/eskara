package day12_ternary_string;

public class CafeNestedIf {
    public static void main(String[] args) {
        String order = "drink";
        String drink = "soda";
        String food = "";
        double price = 0;
        if (order.equals("drink")) {
            if (drink.equals("soda")) {
                price = 1.99;
            } else if (drink.equals("coffee")) {
                    price = 4.99;
                } else if (drink.equals("water")) {
                        price = 1.55;
                    }
                    System.out.println("Total Price is: "+price);
                }
            }
        }