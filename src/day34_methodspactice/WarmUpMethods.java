package day34_methodspactice;

public class WarmUpMethods {
    public static void main(String[] args) {
        login("student@cybertek.com", "cybertekb15");
        login("student@cybertek.com", "cybertekb15");
        drive("Tesla",56);
        drive("Kara&Dogan Oto", 240);
        drive("toyota",-1);
    }
    /*
    Method"drive
     */
    public static void drive(String car, int speed){
        if(speed<0) {
            System.out.println("ERROR: Invalid speed!");
        }else if(speed==0) {
            System.out.println(car + " is not moving at 0 speed");
        }else if(speed<=55) {
            System.out.println(car + "is driving at " + speed + " mph");
        }else if(speed>55 && speed<200) {
                System.out.println(car + " is speeding at " + speed + " mph");
            }else if(speed>=200){
            System.out.println(car+" is flying at "+speed+ " mph");
            }
        }

    //Methods: login
    //2 Params/input: String userName, String password
    //return:void

    public static void login(String userName, String password){
        if(userName.equalsIgnoreCase("student@cybertek.com")&& password.equalsIgnoreCase("cybertekb15")){
            System.out.println("Login successfully!");
        }
    }
}
