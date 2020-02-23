package myfolder;
import java.util.*;
public class asalsayi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        boolean c;
        int a=scan.nextInt();
        String d="";
            for (int i = 2; i < a; i++) {
                int b = a - i;
                if (a / b % 2 != 0) {
                    d+=a;
                }


            } System.out.println(d+" asal sayidir");
        }}
