package day19_forloop_2;

public class Weekdays {
    public static void main(String[] args) {

        for(int num=1;num<=7;num++){
            System.out.println("num = " + num);
            switch (num){
                case 1:
                    System.out.println(num+". Monday");
                    break;
                case 2:
                    System.out.println(num+". Tuesday");
                    break;
                case 3:
                    System.out.println(num+". Wednesday");
                    break;
                case 4:
                    System.out.println(num+". Thursday");
                    break;
                case 5:
                    System.out.println(num+". Friday");
                    break;
                case 6:
                    System.out.println(num+". Saturday");
                    break;
                case 7:
                    System.out.println(num+". Sunday");
            }

        }
    }
}
