package day24_arrays03;
import java.util.*;
public class ArraysSort {
    public static void main(String[] args) {
      int [] nums={44, 12, 5, 900, 1};
        System.out.println("Before sorting");
      System.out.println(Arrays.toString(nums));

      Arrays.sort(nums);// sorting nums array values

        System.out.println("After sorting");
        System.out.println(Arrays.toString(nums));

        //declare companies array and assign 4 companies
        String[] companies={"Cybertek", "Capital one", "FreddieMac", "Apple", "Google", "Verizon"};
        Arrays.sort(companies);
        System.out.println(Arrays.toString(companies));
        System.out.println(companies[0]);

        String [] words={"apple", "banana", "cherries"};
    Arrays.sort(words);
        System.out.println(Arrays.toString(words));


    }
}
