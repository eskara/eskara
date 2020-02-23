package day40_custom_classes;

public class fBankAccountsTest {
    public static void main(String[] args) {
        //create an account
        eCheckingAccount clientOne= new eCheckingAccount();
        //set data
        clientOne.accountNumber=3412873491L;
        clientOne.accountHolder="Wooden Spoon";
        clientOne.balance=500.0;
        System.out.println(clientOne.accountHolder);
        //call getAccountInfo method
        clientOne.getAccountInfo();

        eCheckingAccount clientTwo=new eCheckingAccount();
        clientTwo.setInfo(300.0, 2123123231, "Donald Trump");
        clientOne.getAccountInfo();
        //test deposit method
        clientOne.deposit(300);
        clientOne.getAccountInfo();

        clientTwo.deposit(1000);
        clientTwo.getAccountInfo();
        //test withdraw method
        clientOne.withdraw(100);
        clientOne.getAccountInfo();

        clientTwo.withdraw(500);
        clientTwo.getAccountInfo();
        //call purchase method
        eCheckingAccount myAccount=new eCheckingAccount();
        myAccount.setInfo(200, 23242349, "Master Muhtar");
       myAccount.purchase("book", 98);
        System.out.println("current balance: "+myAccount.balance);
       myAccount.purchase("shoes", 120.0);
       myAccount.purchase("car tyres", 450);

       //balance is -538
        System.out.println("Coded lots of java, and landed a SDET job");
        System.out.println("First month salary is direct deposited");

        myAccount.deposit(10000);
        myAccount.getAccountInfo();
    }
}
