package day16_memory_whie_loop_intro;

public class WhileLoopIntro {
    public static void main(String[] args) {
       int num =1;
       while(num<=10){
           System.out.println("Hello word!");
           num++;
       }
        System.out.println();
       int steps=1;
       while (steps<=100){
           System.out.println("Taking a step "+steps);
           steps++;
       }
        System.out.println("steps = " + steps);
    }
}
