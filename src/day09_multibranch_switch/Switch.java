package day09_multibranch_switch;

public class Switch {
    public static void main(String[] args) {
        int day =2;
        switch (day){
            case 1:
                System.out.println("Monday");}
                switch (day){
            case 2:
                System.out.println("Tuesday");}
        switch (day){
            case 3:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Tuesday");
        }


    }
}
