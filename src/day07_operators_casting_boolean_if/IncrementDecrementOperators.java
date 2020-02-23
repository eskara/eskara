package day07_operators_casting_boolean_if;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int number = 300;
        -- number;
        --number;
        System.out.println(number);
        ++number;//its meaning add 1
        System.out.println(number);
        number++;//same
        System.out.println(number);
        char letter ='A';
        System.out.println(letter);
        letter++;//B
        System.out.println(letter);
        letter++;//C
        System.out.println(letter);
    }
}
