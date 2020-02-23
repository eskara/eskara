package day_29;

public class newssk {
    public static void main(String[] args) {
        String str="Phil Salt [SDET] psalt@g.co";
        //i want to extract job title
        //find index of "[" and"]"
        int n1 =str.indexOf("[");//10
        int n2=str.indexOf("]");//15
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        //using substring extract job title - using n1, n2
        //1. sunstring(start, end) 2.substring(start) from start till end
        String job=str.substring(n1+1,n2);
        System.out.println("job = " + job);


    }
}
