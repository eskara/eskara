package day37_arraylist;
import java.util.*;
public class SortList {
    public static void main(String[] args) {
        List<Integer>nums=new ArrayList<>(Arrays.asList(100, 45, 200, 1, -30, 0));
        System.out.println("nums before sorting = " + nums);

       Collections.sort(nums);
        System.out.println("nums after sorting = " + nums);

       // Collections.sort(nums, Comparator.reverseOrder());
        Collections.reverse(nums);
        System.out.println("nums after sorting reverse = " + nums);

        List<Character>charlist=new ArrayList<>(Arrays.asList('k', 'a', 'n', '3', '-'));
        System.out.println("charlist before sort= " + charlist);
        Collections.sort(charlist);
        System.out.println("charlist after sort = " + charlist);

    }
}
