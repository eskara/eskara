package day35_wrapper_classes;

public class ApartmentLease {
    public static void main(String[] args) {
        applyForApartment(750);
        applyForApartment(450);
    }
    public static void Qualify(){
        System.out.println("Congratulations, your applications for apartment is approved!");
    }
    public static void notQualify(){
        System.out.println("Unfortunately, your application for apartment is denied! Bye mor code java");

    }public static void applyForApartment(int creditScore){
        if(creditScore>=650&&creditScore<=850){
            Qualify();
        }else{
            notQualify();
        }
    }
}
