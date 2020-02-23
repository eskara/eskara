package day59_exception_collection1;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {
        sleep(10);
        myMethod();
    }
    public static void sleep(int seconds) throws InterruptedException{
        System.out.println("sleeping for "+seconds+" seconds");
        Thread.sleep(seconds*1000);
    }
    public static void myMethod() throws NullPointerException{
        System.out.println("myMethod, I might throw NullPointer Exception");
    }
}
