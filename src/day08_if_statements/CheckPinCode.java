package day08_if_statements;

public class CheckPinCode {
    public static void main(String[] args) {
        System.out.println("Welcome to Wells Fargo ATM!");
        int secretPinCode = 2345;
        int inputPinCode = 2345;
        if (inputPinCode == secretPinCode) {
            System.out.println("Welcome to your account!");
            System.out.println("You can withdraw,deposit,view balances");
        } else {
            System.out.println("Invalid pincode!");
            System.out.println("Access denied!");
        }


        }

    }
