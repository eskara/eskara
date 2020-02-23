package day28_review;
import java.util.*;
public class ArrayRandomNumbers {
    public static void main(String[] args) {
        //create a random object
        Random rd = new Random();
        //how to generate 0-100 number using Random
        System.out.println(rd.nextInt(101));
        System.out.println(rd.nextInt(101));
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = rd.nextInt(101);

        }
        System.out.println(Arrays.toString(nums));
        //Sort it
        //Print again
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        while (true) {
            int[] nums2 = {rd.nextInt(101), rd.nextInt(101), rd.nextInt(101), rd.nextInt(101), rd.nextInt(101), rd.nextInt(101), rd.nextInt(101), rd.nextInt(101), rd.nextInt(101), rd.nextInt(101)};
            System.out.println(Arrays.toString(nums2));
        }
    }
}