package day35_wrapper_classes;

public class MethodsWithArrays {
    public static void main(String[] args) {
        int[] myNums= {3, 1, 4,55,6,9,3};
        printArray(myNums);
        printArray(new int[]{34,10,33,55});
        System.out.println(has10(new int[]{3,4,5,10,1}));

    }
    public static void printArray(int[] nums) {
        for (int eachNum : nums) {
            System.out.println(eachNum);
        }
    }
        public static boolean has10(int[] nums){
            boolean found =false;
            for (int i = 0; i <nums.length ; i++) {
                if(nums[i] ==10){
                    found=true;
                    break;
                }
            }
            return found;
        }
    }

