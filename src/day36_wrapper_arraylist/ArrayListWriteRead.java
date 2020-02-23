package day36_wrapper_arraylist;

import java.util.ArrayList;

public class ArrayListWriteRead {
    public static void main(String[] args) {
        ArrayList<Integer>nums=new ArrayList<>();
        nums.add(10);
        nums.add(10);
        nums.add(20);
        nums.add(21);
        nums.add(-7);
        //print numbers of values in the arraylist
        System.out.println("number of values: "+nums.size());
        System.out.println("All values: "+nums.toString());
        System.out.println("First number: "+nums.get(0));
        System.out.println("Third number: "+ nums.get(2));

        int i =4;
        //print number at index i
        System.out.println(nums.get(4));
        System.out.println(nums.get(i));
        for (int n=0; n<nums.size();n++){
            System.out.println(nums.get(n));
        }
    }
}
