package day13_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String company="Cybertek";
        System.out.println(company.length());
        System.out.println(company.charAt(0));
        System.out.println(company.charAt(1));
        System.out.println(company.charAt(2));
        System.out.println(company.charAt(3));
        System.out.println(company.charAt(4));
        System.out.println(company.charAt(5));
        System.out.println(company.charAt(6));
        System.out.println(company.charAt(7));
        char first=company.charAt(1);
        System.out.println("first = " + first);
        if (first== 'C'){
            System.out.println("C is first letter");}else{
            System.out.println("C is not first letter");
        }
        String word="civic";
        char firstl=word.charAt(0);
        char lastl=word.charAt(4);
        if(firstl==lastl){
            System.out.println("first and last match");}else{
            System.out.println("first and last do not match");
        }
        System.out.println(word.charAt(0)+" "+word.charAt(1)+" "+word.charAt(2)+" "+word.charAt(3)+" "+word.charAt(4));
String str="WOODEN SPOON";
        System.out.println(str.contains("D"));//true
        System.out.println(str.contains("SPOON"));//true
        System.out.println(str.contains("Z"));//false
    }
}
