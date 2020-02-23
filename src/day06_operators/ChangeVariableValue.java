package day06_operators;

public class ChangeVariableValue {
    public static void main(String[] args) {
        int steps = 200;
        steps = steps+20;
                System.out.println(steps);
                int students=50;
                System.out.println("Students: "+students);
                students=students+10;
                System.out.println("Students: "+students);
                students = students -2;
        System.out.println("Students: "+students);
                int b12Students = 3;
                students=students+b12Students;
        System.out.println("Students: "+students);
        double balance = 250;
        double shoesPrice = 75.5;
        System.out.println("Balance: "+balance);
       balance=balance-shoesPrice;
        System.out.println("Balance: "+balance);
        double socksPrice=10.99;
        balance=balance-socksPrice;
        System.out.println("Balance: "+balance);

    }
}
