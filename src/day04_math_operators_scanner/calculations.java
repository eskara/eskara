package day04_math_operators_scanner;

public class calculations {
    public static void main(String[] args){
        double privce1 = 15.5;
        double price2 = 55.1;
        double price3 = 10.0;
        double totolprice = privce1 * 3+price2+price3;
        System.out.println("total price: "+totolprice);
        double balance = 1200.0;
        double remainingbalance = balance - totolprice;
        System.out.println("Remaining balance: " + remainingbalance);
        //declare veriable int linesOfCode and assign 25
        //declare veriable int classCount and assign 6
        //Calculate how many lines of code written and print out
        double linesOfCode = 25;
                double classCount = 6;
                System.out.println("total lines of code: " + linesOfCode * classCount);
                double totalLinesOfCode = linesOfCode * classCount;
                System.out.println("total lines of code: " +totalLinesOfCode);



    }
}
