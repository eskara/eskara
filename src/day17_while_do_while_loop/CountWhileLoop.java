package day17_while_do_while_loop;

public class CountWhileLoop {
    public static void main(String[] args)throws Exception {
        int counter =1;
        while(counter<=10){
            System.out.print(counter+" ");
            ++counter;
            Thread.sleep(100);
        }
        System.out.println();
        int counter2=10;
                while(counter2>=1){
                    System.out.println(counter2+" ");
                    counter2--;
                }
    }
}
