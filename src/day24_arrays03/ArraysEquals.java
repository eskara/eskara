package day24_arrays03;
import java.util.*;
public class ArraysEquals {
    public static void main(String[] args) {
        int[] nums1={4,5,2,10};
        int[] nums2 ={4,5,2,10};
        int[] nums3={10,4,5,2};
        int[] nums4={5,5,2,10,90};
        int[] nums5 ={11,45,32,45,323};


        System.out.println(" < nums1==nums2 > "+Arrays.equals(nums1,nums2));
        System.out.println(" < nums1==nums2 > "+(nums1==nums2));
        boolean bool1 =Arrays.equals(nums2, nums3);
        System.out.println("nums2==nums3 >"+bool1);

        Arrays.sort(nums2);
        Arrays.sort(nums3);
        System.out.println("After sorting; nums2==nums3>  "+Arrays.equals(nums2 ,nums3));

        //Arrays.equals(nums1, num2)&& Arrays.equals(nums1, nums3)
        String [] cars1={"Toyata","Honda","Tesla","BMW","Dodge"};
        String [] cars2={"Toyata","Honda","Tesla","BMW","Dodge"};
        String [] cars3={"toyata","honda","tesla","bmw","dodge"};
        String [] cars4={"Toyata","Honda","Tesla"};

        System.out.println(Arrays.equals(cars1, cars2));
        System.out.println(Arrays.equals(cars2,cars3));
        //work around for cars2==cars43
       boolean equal= Arrays.toString(cars2).equalsIgnoreCase(Arrays.toString(cars3));
        System.out.println(equal);


        String[] newCars=Arrays.copyOf(cars1,3);
        System.out.println(Arrays.toString(newCars));
    }
}
