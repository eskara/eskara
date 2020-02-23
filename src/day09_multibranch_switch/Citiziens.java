package day09_multibranch_switch;

public class Citiziens {
    public static void main(String[] args) {
        String citizienType = "";//empty string
        int age = 37;
        if(age >=65) {
            citizienType = "Senior";
        }else{
            citizienType = "Non-senior";

        }
        System.out.println("Citizien type is "+citizienType);
    }
}
