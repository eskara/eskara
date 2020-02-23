package day21_forloop_4_arrayintro;

import java.util.Scanner;

public class cFindUniqueChars {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter word:");
        String str =scan.nextLine();
        String unique="";
        //1)loop from beginning until end of str
        for (int n = 0; n < str.length(); n++) {
            String temp = str.charAt(n) + "";
            System.out.println("temp= " + temp);
            if(!unique.contains(temp)){
                unique=unique+temp;//unique+temp
            }


        }
        System.out.println("unique = " + unique);
    }
}
