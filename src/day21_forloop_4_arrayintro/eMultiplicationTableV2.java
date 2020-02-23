package day21_forloop_4_arrayintro;

import org.w3c.dom.ls.LSOutput;

public class eMultiplicationTableV2 {
    public static void main(String[] args) {
        for(int outer=1; outer<=10;outer++){
            System.out.println("\nTABLE FOR #"+outer);
            System.out.println("--------------");
            for(int inner=1; inner<=10;inner++){
                int result=inner*outer;
                System.out.println(inner+" x "+outer+" = "+result);
            }
            System.out.println();


        }


    }


}
