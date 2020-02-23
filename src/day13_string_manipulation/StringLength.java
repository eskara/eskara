package day13_string_manipulation;

import jdk.swing.interop.SwingInterOpUtils;

public class StringLength {
    public static void main(String[] args) {
        String school="Cybertek School";
        //print number of characters
        System.out.println(school.length());
        //store school length
        int count=school.length();
        //cybertek school is 15 character.
        System.out.println(school+" is "+school.length()+" character.");
        String firstName="Ersin";
        String lastName="Kara";
        System.out.println(firstName.length()+lastName.length());
        int fullNameCount=firstName.length()+lastName.length();
        System.out.println(fullNameCount);
        String password="cybertek1123";
        //check if the password is more than or equal to 8 character.
        if(password.length()>=8){
            System.out.println("Password length matches requirement");}else{
            System.out.println("Password is too short.Needs to be minimum 8 character");


        }
    }
}
