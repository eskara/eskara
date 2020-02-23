package day41_encapsulation;

public class BestBuyTVs {
    public static void main(String[] args) {
        //Create TV object
        TV lg=new TV();
        lg.brand="LG 1122";
        lg.isOn=false;
        lg.channel=5;
        lg.setTVInfo("LG 1122", false, 5);
        System.out.println(lg.toString());
        System.out.println(lg);//same
        lg.turnOff();
        TV sm = new TV();
        sm.setTVInfo("Samsung 003", true, 21);
        System.out.println(sm.toString());
        sm.turnOn();

        TV sony =new TV();
        System.out.println(sony.toString());
        sony.setTVInfo("Sony One", true,1);
        sony.channelUp();
        System.out.println(sony.toString());
       /* for (int i = 0; i < 121; i++) {
            sony.channelUp();

        }
        System.out.println(sony.toString());
        */
       sony.setChannell(123);
        System.out.println(sony.toString());

        sony.channelDown();
        System.out.println(sony.toString());//122


    }
}
