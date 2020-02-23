package day08_if_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double salary = 1000.0;
        double sales = 10000.4;
        double bonus=0;
        if(sales>=10000.0) {
            bonus += 500;//bonus = bonus + 500
            salary += bonus;//salary=salary+bonus
        }else{
            bonus+=50;
            salary+=bonus;
        }
        System.out.println("Your total salary is $"+salary+" and it includes bonus is  $"+bonus);
    }
}
