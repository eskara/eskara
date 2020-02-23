package day40_custom_classes;

import day39_list_practice_custom_classes.ProductsCatalog;

/**
 * purpose of this class is have main method to execute, and create object
 * from product class
 */
public class bEtysShop {
    public static void main(String[] args) {
        //declare 2 product objects
        aProduct prodobj1=new aProduct();
        aProduct prodobj2=new aProduct();

        //assign values to prodobj1
        prodobj1.title="Wooden Banana";
        prodobj1.price=4.5;
        prodobj1.rating=5;
        prodobj1.seller="BananaSeller";
        System.out.println(prodobj1.title);
        System.out.println(prodobj2.title);
        prodobj2.title="Wool Gloves";
        prodobj2.price=25;
        prodobj2.rating=5;
        prodobj2.seller="WoolSeller";
        //print values from prodObj1
        System.out.println("prodobj1 title = "+prodobj1.title);
        System.out.println("prodobj1 price = "+prodobj1.price);
        System.out.println("prodobj1 rating = "+prodobj1.rating);
        System.out.println("prodobj1 seller = "+prodobj1.seller);
        //print values from prodobj2
        System.out.println("prodobj2 title = "+prodobj2.title);
        System.out.println("prodobj2 price = "+prodobj2.price);
        System.out.println("prodobj2 rating = "+prodobj2.rating);
        System.out.println("prodobj2 seller = "+prodobj2.seller);

        //call the method of Product class
        //objName.methodName();
        prodobj1.displayedInfo();
        prodobj2.displayedInfo();
    }
}
