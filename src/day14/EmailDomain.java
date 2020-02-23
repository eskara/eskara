package day14;

public class EmailDomain {
    public static void main(String[] args) {
        String email="employee@yahoo.com";
        if(email.contains("@gmail")){
            System.out.println("Google Account");}else if(email.contains("@yahoo")){
            System.out.println("Yahoo Account");}else if(email.contains("@hotmail")){
            System.out.println("Hotmail Account");}else if(email.contains("@icloud")){
            System.out.println("Icloud Account");
        }
    }
}
