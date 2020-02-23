package day27_arrays06;

public class MallShopping {
    public static void main(String[] args) {
        String [] items={"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iPhone 11 case"};
        double[] prices={99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int [] itemIDs={12345, 12346, 12347, 12348, 12349, 12350};
        if(items.length==prices.length&&prices.length==itemIDs.length){
            System.out.println("All arrays are equals length. Good to go!");}else{
            System.out.println(" Error");
            return;
        }
        System.out.println("item counts = " + items.length);

        double totalPrice = 0.0;
        for (int i = 0; i <items.length; i++) {
            System.out.println(itemIDs[i]+" - "+items[i]+" - $"+prices[i]);
            totalPrice+=prices[i];


        }totalPrice=totalPrice*1.06;
        System.out.println("Total price: $"+(int)totalPrice);

        for (int i = 0; i <items.length ; i++) {
            if(items[i].equals("Airpods")){
                System.out.println(itemIDs[i]+" - "+items[i]+" - "+prices[i]);
                break;
            }
        }
        double maxPrice=prices[0];
        int maxPriceIndex=-1;
        for (int i = 0; i <prices.length ; i++) {
            if(prices[i]>maxPrice){
                maxPrice=prices[i];
                maxPriceIndex=i;
            }
        }

    }
}
