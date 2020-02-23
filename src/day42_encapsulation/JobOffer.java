package day42_encapsulation;

public class JobOffer {
    private int hourlyPay;
    private String location;
    public void setHourlyPay(int newHourlyPay){
        hourlyPay=newHourlyPay;
    }
    public int getHourlyPay(){
        return hourlyPay;

    }
    public void setLocation(String newLocation){
        location=newLocation;
    }
    public String getLocation(){
        return location;
    }


    public String toString() {
        return "JobOffer{" +
                "hourlyPay=" + hourlyPay +
                ", location='" + location + '\'' +
                '}';
    }
}
