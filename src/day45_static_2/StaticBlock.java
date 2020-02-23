package day45_static_2;

public class StaticBlock {
//static block
    static {
    System.out.println("STATI BLOCK - ONCE BEFORE EVERYTHING ELSE");
}
public StaticBlock(){
        System.out.println("CONSTRUCTOR");
    }
    public static void staticMethod(){
        System.out.println("STATIC METHOD");
    }
    public static class InnerClass{
        public static void InnerClassStaticMethod(){
            System.out.println("Hello from Inner class!!");
        }
    }
}
