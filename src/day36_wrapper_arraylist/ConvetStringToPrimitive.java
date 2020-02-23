package day36_wrapper_arraylist;

public class ConvetStringToPrimitive {
    public static void main(String[] args) {
        //Boolean, Character, Byte, Short, Integer, Long, Float,Double.
        boolean b1=Boolean.parseBoolean("true");
        char ch="a".charAt(0);//work around for String > char. Character class does not have parse method.

        byte byteValue=Byte.parseByte("100");

        short shortValue=Short.parseShort("10000");

        int intValue =Integer.parseInt("342313313");

        long longValue =Long.parseLong("231763764762476417");

        float floatValue=Float.parseFloat("23928.34");

        double doubleValue =Double.parseDouble("3281484.4214");

        String strPrice ="23124.2";
        double doublePrice=Double.parseDouble(strPrice);


        System.out.println("b1 = " + b1);
        System.out.println("ch = " + ch);
        System.out.println("byteValue = " + byteValue);
        System.out.println("shortValue = " + shortValue);
        System.out.println("intValue = " + intValue);
        System.out.println("longValue = " + longValue);
        System.out.println("floatValue = " + floatValue);
        System.out.println("doubleValue = " + doubleValue);
        System.out.println("strPrice = " + strPrice);
        System.out.println("doublePrice = " + doublePrice);


    }
}
