package day43_construction;

import java.util.ArrayList;
import java.util.List;

public class ComputersList {
    public static void main(String[] args) {
        //TASK 0Declare List of Computers
        List<Computer> compList=new ArrayList<>();
        compList.add(new Computer("Hp 14", "Win10", 219.99));
        Computer c =new Computer("Dell inspiron", "Win11", 419.99);
        compList.add(c);
        compList.add(new Computer("Sony Vio", "Win12", 819.99));
        compList.add(new Computer("HP 25", "Win7", 729.99));
        compList.add(new Computer("MacbookPro 13", "MacOs Catalina", 1819.99));
        compList.add(new Computer("Lenovo 44", "Win11", 2019.99));
        //TASK 1
        System.out.println("---- TASK 1 ----");
        System.out.println("Number of computers: "+compList.size());

        //TASK 2. print first computer brand price
        System.out.println("--- TASK 2 -- FIRST COMPUTER ----");
        System.out.println( compList.get(0).getBrand() );
        System.out.println( compList.get(0).getPrice() );
        Computer firstComp = compList.get(0);
        System.out.println(firstComp.getBrand());
        System.out.println(firstComp.getPrice());

        //TASK 3. using FOR loop. Print number then Computer description
        //System.out.println(firstComp.toString());
        System.out.println("---- TASK 3 -- TOSTRING FOR ALL COMPUTERS --");
        for (int i = 0; i < compList.size(); i++) {
            System.out.println( (i+1) +". "+ compList.get(i).toString() );
        }
        //TASK 4. using FOR EACH loop. Print number then Computer description
        System.out.println("---- TASK 4 -- TOSTRING FOR ALL COMPUTERS --");
        int counter = 1;
        for(Computer eachComp : compList ){
            System.out.println(counter + ". " + eachComp.toString());
            counter++;
        }
        //TASK 5. Print Brand and Price for computers within your budget
        System.out.println("---- TASK 5 -- Print Brand and Price for computers within your budget");
        double myBudget = 800.0;
        for(Computer eachComp : compList){
            if( eachComp.getPrice() <= myBudget ){
                System.out.println(eachComp.getBrand() +" | "+ eachComp.getPrice());
            }
        }
        for (int i = 0; i < compList.size(); i++) {
            if (compList.get(i).getPrice() <= myBudget){
                System.out.println(compList.get(i).getBrand() +" | " +
                        compList.get(i).getPrice());
            }
        }
        //TASK 6. Calculate Total price For all computers
        //TASK 7. Print Information of most expensive computer
        //TASK 8. Print Information of least expensive computer
        //TASK 9. 50% off for all computers then print toString for all of them
/*
//TASK 7. Calculate total price and print info of most expensive computer
        System.out.println("---------- TASK 7 ----------");
        double total =0;
        double max = comps.get(0).getPrice();
        for (Computer each: comps){
            total+=each.getPrice();
            if(each.getPrice()>=max){
                max=each.getPrice();
            }
        }
        System.out.println("total = " + total);
        System.out.println("max = " + max);
        //TASK 8. Print Info of least expensive computer
        System.out.println("---------- TASK 8 ----------");
        double min = comps.get(0).getPrice();
        for(Computer each: comps){
            if(each.getPrice()<=min){
                min=each.getPrice();
            }
        }
        System.out.println("min = " + min);
        //TASK 9. 50% off to all computer prices
        System.out.println("---------- TASK 9 ----------");
        for(Computer each: comps){
            System.out.println(each.getPrice()/2);

 */

    }
}
