package day32_custommethods;

public class VoidMethods {
    public static void main(String[] args) {
        countFrom1to10();
        countFrom1to10();
        System.out.println("--- ENGLISH ALPHABET ---");
        printAtoZ();
    }

    /*
    method name:CountFrom1to10
    It prints 1-10 numbers in same line separated by space
     */
    public static void countFrom1to10(){
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" ");

        }
        System.out.println();
    }public static void printAtoZ(){
        for (char letter='A'; letter<='Z';letter++){
            System.out.print(letter+" ");
        }
        System.out.println();
    }
}
