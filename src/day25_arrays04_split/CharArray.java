package day25_arrays04_split;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        String word = "java";
        char[] letters = word.toCharArray();
        System.out.println("letters length: " + letters.length);
        for (char l : letters) {
            System.out.println(l);
        }
        Arrays.sort(letters);//aajv
        //print all in same line separated by comma
        System.out.println(Arrays.toString(letters));
        
        String str="jbsajdbhjkbadsbkdbsa";
        char[] strArr=str.toCharArray();
        Arrays.sort(strArr);
        //After sorting , create a new string with that value of array
        String sorted=new String(strArr);
        System.out.println("sorted = " + sorted);
    }
}