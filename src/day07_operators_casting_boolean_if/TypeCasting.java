package day07_operators_casting_boolean_if;

public class TypeCasting {
    public static void main(String[] args) {
        //Automatic casting ->Implicit casting
        //From Small to large
        byte b = 100;
        short sh=b;
        int i = sh;
        System.out.println("b: "+b);
        System.out.println("sh: "+sh);
        System.out.println("i: "+i);

        int n = 1234567;
        long l=n;//no need for L at end
        System.out.println("n: "+n);
        System.out.println("l: "+l);

        double d = n;
        System.out.println("d: "+d);
        //Explicit casting: paranthesis before veriable name and type

        int n2 = 120;
        byte b2 = (byte)n2;
        System.out.println("n2: "+n2);
        System.out.println("b2: "+b2);
        double price = 120.44;
        int intPrice=(int)price;
        System.out.println("price: "+price);
        System.out.println("intPrice: "+intPrice);
        int num3 = 1000;
        byte b3 = (byte)num3;
        System.out.println(b3);//-24 cunku byte 4 sayi alir.1000=11101000 4 unu alinca -24 olarak okuyor.

        int num5=3456;
        //String str=(String)num5;
        String str=num5+"";//->3456
        System.out.println("num5: "+num5);
        System.out.println("str: "+str);
        System.out.println("abc"+123);

    }
}
