package day41_encapsulation;

public class TV {
    //instance variable
    String brand;
    boolean isOn;
    int channel;

    public void turnOn() {
        if (isOn) {
            System.out.println("WARNING: " + brand + " TV is already on");
        } else {
            System.out.println("INFO: Turning on " + brand + " TV");
            isOn = true;
        }
    }
        public void turnOff(){
        if(isOn){
            System.out.println("INFO: Turning off "+brand+" TV");
            isOn=false;
        }else {
            System.out.println("WARNING: " + brand + " TV is already off");

        }

}

    public void setTVInfo(String pBrand, boolean pIsOn, int pChannel) {
        System.out.println("INFO: setting TV information..");
        brand=pBrand;
        isOn=pIsOn;
        channel=pChannel;


    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", isOn=" + isOn +
                ", channel=" + channel +
                '}';

    }
    public void setChannell(int newChannel){
        System.out.println("INFO: Chancing channel...");
        channel=newChannel;

        }public void channelUp(){
        System.out.println("INFO: next channel...");
        channel++;

    }
    public void channelDown(){
        System.out.println("INFO: previous channel...");
        channel--;
    }
    }

