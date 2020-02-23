package day58_exception3;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatch {
    public static void main(String[] args) {
      //Unhandled exception: java.io.FileNotFoundException
        try {
            FileReader fr = new FileReader("file.csv");
        }catch (FileNotFoundException e){
            System.out.println("FileNotFoundException is caught/Handled!");
            e.printStackTrace();//for information
        }
        System.out.println("After try catch...");

        try {
        int [] nums={23,12,54};

            System.out.println(nums[0]);
            System.out.println(nums[2]);
            System.out.println(nums[3]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException is caught and handled ");

        }
        System.out.println("AFTER ARRAY...");

    }
}
