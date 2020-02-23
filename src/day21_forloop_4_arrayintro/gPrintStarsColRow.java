package day21_forloop_4_arrayintro;

import java.util.Random;

public class gPrintStarsColRow {
    public static void main(String[] args) {
        Random rnd=new Random();
        int rows = rnd.nextInt(11)+1;
        int columns = rnd.nextInt(25)+1;
        for (int r = 1; r <= rows; r++) {
            for (int col = 1; col <= columns; col++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
