package day31_multiarrays_methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        //declare 2 D String array list
        //String list [] [];
        //String [] list []; all the same thing
        String[][] list=new String[4][3];
        //add vegetable
        list[0] [0]="Potatoes";
        list[0] [1]="Carrots";
        list[0] [2]="Onions";
        //Add fruits
        list[1] [0]="Apple";
        list[1] [1]="Kiwi";
        list[1] [2]="Figs";

        list[2] [0]="Milk";
        list[2] [1]="Egg";
        list[2] [2]="Cheese";
        list[3] [0]="Bread";
        list[3] [1]="Bagel";
        list[3] [2]="Muffin";
        /*
        0->"Potatoes","Carrots","Onion"
        1->"Apple","Kiwi","Figs" ...

         */
        System.out.println(list[0] [0]+","+list[0] [1]+","+list[0] [2]);
        System.out.println(list[1] [0]+","+list[1] [1]+","+list[1] [2]);
        System.out.println(list[2] [0]+","+list[2] [1]+","+list[2] [2]);
        System.out.println(list[3] [0]+","+list[3] [1]+","+list[3] [2]);
        System.out.println();
        System.out.println(Arrays.deepToString(list));

        String fruit=list[1][1];
        System.out.println("My favourite fruit "+fruit);

        //lets find out how many arrays in the 2D array
        System.out.println("Number of arrays/rows: "+list.length);
        //How many vegetables:
        System.out.println("Number of vegetables: "+list[0].length);
        System.out.println("Number of fruits: "+list[1].length);
        System.out.println("Number of dairy: "+list[2].length);
        System.out.println("Number of bakery: "+list[3].length);

        //How to print using a loop
        //Print all vegetables using a loop
        for (int i = 0; i <list[0].length ; i++) {
            System.out.println(list[0][i]);
        }
        System.out.println();
        //Print all bakery items
        for (int i = 0; i <list[3].length ; i++) {
            System.out.println(list[3][i]);

        }
        System.out.println();
        //Print all dairy using for each loop
        for (String each:list[2]) {
            System.out.println(each);
            System.out.println();

        }
        //Print all items using nested for loop
        for (int i = 0; i <list.length; i++) {
            System.out.println();
            System.out.println("Row: "+i);

            for (int j=0; j<list[i].length;j++){
                System.out.print("Col: "+ j+"-");
                System.out.print(list[i][j]+" ");

            }

        }

    }
}
