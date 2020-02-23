package day56_exceptions;

public class ExceptionsExample {
    public static void main(String[] args) {
        System.out.println("Hello B15 Online Friends!");
        //int num=2.5; COMPILE ERROR
        int[] nums=new int[3];
        nums[0]=55;
        nums[1]=56;
        nums[2]=100;
       // nums[3]=200;//ArrayIndexOutOfBoundsException is thrown here.
        //System.out.println("Bye Bye B15 online friends!");//this line does not run
        int result=10/0;
        System.out.println("result is "+ result);


    }
}
