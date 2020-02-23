package day11_string_comparison_locgical;

public class LoginTest {
    public static void main(String[] args) {
        String username="cbtuser";
        String password="abc123";
        if (username.equalsIgnoreCase("cbtuser") && password.equals("abc123")){
            System.out.println("Login successful, Welcome!");}else if(username.equalsIgnoreCase("cbtuser")&&!password.equals("abc123")){
                System.out.println("Invalid password, try again!");}else if(!username.equalsIgnoreCase("cbtuser")&&password.equals("abc123")){
            System.out.println("Invalid user name, try again!");}else if(!username.equalsIgnoreCase("cbtuser")&&!password.equals("abc123")){
            System.out.println("Invalid user naem and password, try again!");

        }
    }

}
