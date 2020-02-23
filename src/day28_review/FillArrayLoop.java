package day28_review;
import  java.util.*;
public class FillArrayLoop {
    public static void main(String[] args) {
        int [] nums=new int [101];//declare int array with size 101
        for (int i = 0; i <=100; i++) {
           nums[i]=i;

        }
        System.out.println(Arrays.toString(nums));
        //Print same array in reverse in same line
        System.out.print("[");
        for (int r=nums.length-1;r>=0;r--){
            System.out.print(nums[r]+", ");
        }
        System.out.print("]");
    }
}
