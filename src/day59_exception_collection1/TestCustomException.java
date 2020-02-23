package day59_exception_collection1;

public class TestCustomException {
    public static void main(String[] args) throws LunchTimeException {
        //throw new InsuficientFundsException();
        double balance =1000;
        double price=145.99;
        String itemName="Shoes";
        if(price>balance){
            throw new InsufficientFundException("Not enough funds for this transaction");
        }else{
            balance-=price;
            System.out.println("Purchase transaction successful enjoy your new "+itemName);
            System.out.println("Remaining balance: "+balance);
        }
        int time=1;
        if(time>=1){
            throw new LunchTimeException("BREAK TILL 22:23");

        }else {
            System.out.println("Keeping coding java...");
        }
    }
}
