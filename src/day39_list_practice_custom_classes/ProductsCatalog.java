package day39_list_practice_custom_classes;
import java.util.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ProductsCatalog {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>(Arrays.asList("iPhone 6s", "iPhone 6s Plus", "iPhone X", "MacBook Pro", "ThumbDrive", "Beats HeadPhones", "Mouse", "Charger", "iPad", "Dyson Vacuum", "TV", "Apple Watch"));
        ArrayList<Double> prices = new ArrayList(Arrays.asList(449, 549, 1149, 1499.99, 39.99, 349.99, 79.99, 39.99, 429, 399, 2199, 559));
        ArrayList<Double> monthlyPayments = new ArrayList(Arrays.asList(Arrays.asList(18.71, 22.88, 56.16, 79.49, 2.68, 15.12, 8.98, 4.56, 18.31, 16.25, 89.49, 21.18)));
//TASK 0. print each list
        System.out.println("items = " + items);
        System.out.println("prices = " + prices.toString());
        System.out.println("monthlyPayments = " + monthlyPayments);
        //TASK 1. print whole catalog
        // 1. [iPhone 6s - 449.0 - 18.71]
        // 2. [iPhone 6s Plus - 549.0 - 22.88]...
        //try with first one first
        System.out.println(1 + ". [" + items.get(0) + " - " + prices.get(0) + " - " + monthlyPayments.get(0) + "]");
        //print all now, using for loop
        for (int i = 0; i < items.size(); i++) {
            System.out.println(i + 1 + ". [" + items.get(i) + " - " + prices.get(i) + " - " + monthlyPayments.get(i) + "]");
        } /*TASK 2. Declare String arraylist wholeCatalog and add all items info to it
        by concatenating it:
        [iPhone 6s - 449.0 - 18.71]
        [iPhone 6s Plus - 549.0 - 22.88]
        ...
        */
        ArrayList<String> wholeCatalog = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            wholeCatalog.add("[" + items.get(i) + " - " + prices.get(i) + " - " + monthlyPayments.get(i) + "]");
        }
        System.out.println("wholeCatalog = " + wholeCatalog);
 /*
          TASK 3. String item = "Dyson Vacuum"
          Look for the item in the items list, then print out:
          Dyson Vacuum | 399.0 | 16.25

          if not found found:
          Dyson Vacuum is not found! Keep coding java!
         */
        String item = "iPad";
//        for (int i = 0; i < items.size(); i++) {
//            if(items.get(i).equalsIgnoreCase(item)){
//
//            }
//        }
        if (items.contains(item)) {
            //find the index of item in items list then print all details
            int index = items.indexOf(item);
            System.out.println(item + " | " + prices.get(index) + " | " + monthlyPayments.get(index));
        } else {
            System.out.println(item + " is not found! Keep coding java!");
        }
 /*
          TASK 4. updatePrice for item
          String product = "TV";
          double newPrice = 1099.0;
          find the product index in items, then update the price in prices list
          if done
            print "Price updates successfully"
            TV new price is 1099.0
          else
            System.out.println(item+" is not found! Keep coding java!");
         */
        System.out.println("-----  TASK 4. updatePrice for item ------");
        String product = "TV";
        double newPrice = 1099.0;
        if (items.contains(product)) {
            int idx = items.indexOf(product);
            System.out.println(product + " was found at index " + idx);
            prices.set(idx, newPrice);//update the price to newPrice
            monthlyPayments.set(idx, newPrice / 25);
            System.out.println(items.get(idx) + " new price : " + prices.get(idx));
            System.out.println("new monthly payment: " + monthlyPayments.get(idx));
        } else {
            System.out.println(product + " is not found! Keep coding java!");
        }

        /*
        TASK 5. delete item from catalog
        String prodToDelete = "ThumbDrive";
        Find the index of prodToDelete and remove it from
        items, prices, monthlyPayments
         if done
            print "ThumbDrive deleted successfully"
          else
            System.out.println(item+" is not found! Keep coding java!");
         */
        //items.remove("ThumbDrive"); => removes ThumbDrive from items list
        System.out.println("------ TASK 5. delete item from catalog -----");
        String prodToDelete = "ThumbDrive";
        if (items.contains(prodToDelete)) {
            int idx = items.indexOf(prodToDelete);
            System.out.println(prodToDelete + " found at index " + idx);
            items.remove(idx); //items.remove(items.indexOf(prodToDelete));
            prices.remove(idx);
            monthlyPayments.remove(idx);
            System.out.println(prodToDelete + " still there? - " + items.contains(prodToDelete));
        } else {
            System.out.println(prodToDelete + " is not found! Keep coding java!");
        }
         /*
        TASK 6. remove all iphones from all lists.
         */
        System.out.println("------ TASK 6. remove all iphones from all lists. -----");

        /*
        TASK 7. print info for products that cost less than $500
         */
        System.out.println("------ TASK 7. print info for products that cost less than $500 ------ ");


        for (int i = 0; i < prices.size(); i++) {
            if (prices.get(i) < 500.0) {
                System.out.println(items.get(i) + " - " + prices.get(i) + " - " + monthlyPayments.get(i));
                //HOMEWORK:​
        /*
        TASK 8. find the most expensive item and print out details
        MacBook Pro - 1499.99 - 79.49
         */
                System.out.println("------- TASK 8. find the most expensive item and print out details");
                int maxPriceIndex = 0;
                for (int b = 0; b < prices.size(); b++) {
                    if (prices.get(b) > prices.get(maxPriceIndex)) {
                        maxPriceIndex = b;
                    }
                }
                System.out.println(items.get(maxPriceIndex) + " - " + prices.get(maxPriceIndex) + " - " + monthlyPayments.get(maxPriceIndex));
                System.out.println();
                    /*TASK 8. find the cheapest item and print out details
                Charger - 39.99 - 4.56*/
                System.out.println("---- TASK 8. find the cheapest item and print out details");
                int minPriceIndex = 0;
                for (int a = 0; a < prices.size(); a++) {
                    if (prices.get(a) < prices.get(minPriceIndex)) {
                        minPriceIndex = a;
                    }
                }
                System.out.println(items.get(minPriceIndex) + " - " + prices.get(minPriceIndex) + " - " + monthlyPayments.get(minPriceIndex));
                System.out.println();


            }

        }
    }
}
