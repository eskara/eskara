package day21_forloop_4_arrayintro;

public class dNestedLoop1 {
    public static void main(String[] args) {
        for (int outer = 1; outer <= 5; outer++) {
            for (int inner = 0; inner <= 9; inner++) {
                System.out.print(inner + " ");
            }
            System.out.println();
        }
        /*
        0
        01
        012
        0123
        01234
        012345
        0123456
        01234567
        012345678
        0123456789
         */
        for(int outer = 0; outer <= 9; outer++){
            for(int inner = 0; inner <= outer; inner++){
                System.out.print(inner + " ");
            }
            System.out.println();
        }}}
