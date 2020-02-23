package day22_arrays_intro;

public class ArrayIntro {
    public static void main(String[] args) {
        int [] nums=new int[4];
        nums[0]=100;
        nums[1]=200;
        nums[2]=700;
        nums[3]=-5;
        //nums[4]=234; ArrayIndexOutOfBoundsException
        //print first number in the array
        System.out.println("number at index 0: "+ nums[0]);
        System.out.println("number at index 1: "+ nums[1]);
        System.out.println("number at index 2: "+ nums[2]);
    }
}
