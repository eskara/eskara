package day06_operators;

public class CentsToDollars {
    public static void main(String[] args) {
        int cents = 220;
        int dollar = cents/100;
        int remainingCents = cents%100;
        System.out.println(dollar+" dollars "+ remainingCents+ " cents.");
    }
}
