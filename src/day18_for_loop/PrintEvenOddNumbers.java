package day18_for_loop;

public class PrintEvenOddNumbers {
    public static void main(String[] args) {

                for(int num=1; num<=100;num++){
                    if(num%2==0){
                        System.out.print(num+" ");
                    }

                }
        System.out.println();
                for(int num=1; num<=100;num++){
                    if(num%2!=0){
                        System.out.print(num+" ");
                    }
        }
    }
}
