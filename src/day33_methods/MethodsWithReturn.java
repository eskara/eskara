package day33_methods;

public class MethodsWithReturn {
    public static void main(String[] args) {
        System.out.println( getName() );
        String myName=getName();
        System.out.println("myName = " + myName);
        //call giveMe5Dollars method
        int wallet = giveMe5Dollars();
        System.out.println("How much in wallet? - $" + wallet);
        //5
        System.out.println(giveMe5Dollars());
    }
    public static int giveMe5Dollars(){
        int dollar = 5;
        return dollar;
    }
    public static String getName(){
        return "John";
    }

}
