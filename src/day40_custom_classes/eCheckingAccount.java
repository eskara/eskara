package day40_custom_classes;

public class eCheckingAccount {
    double balance;
    long accountNumber;
    String accountHolder;
    String type="checking";
    public void setInfo(double pBalance, int pAccNumber, String pAccHolder){
        System.out.println("Setting account info...");
        balance=pBalance;
        accountNumber=pAccNumber;
        accountHolder=pAccHolder;
    }
    public void getAccountInfo(){
        System.out.println("Checking account: $"+balance+", "+accountNumber+", "+accountHolder);
    }
    public void deposit(double amount){
        System.out.println("depositing $"+amount+" to account number: "+accountNumber);
        balance+=amount;
    }
    public void withdraw(double amount){
        System.out.println("withdrawing $"+amount+" from account number: "+accountNumber);
        if(amount<=balance) {
            balance -= amount;
        }else {
            System.out.println("ERROR: InsufficientFundException. keep coding java");
        }
    }public void purchase(String item, double price){
        System.out.println("purchasing "+item+" for $"+price);
        if(price<=balance){
            System.out.println("transaction successful for "+item);
            balance-=price;
        }else{
            System.out.println("InsufficientFundsException - Overdraft fee is applied");
            balance-=(price+35);

        }
        System.out.println("transaction completed for "+item+" current balance "+balance);
    }
}
