package day57_exception2;

import java.util.ArrayList;
import java.util.List;

public class outOfMemoryDemo {
    public static void main(String[] args) {
        List<Integer>nums=new ArrayList<>(9999999);
        for (int i = 1; i >0; i++) {
            nums.add(i);


        }

    }
}
