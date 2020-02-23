package day30_review;

public class CarInfo {
    public static void main(String[] args) {
        String car="MINI-Cooper";
        //MINI-Cooper ->MINI-******
        //Infiniti-QX56->Infiniti-****
        /*
        Split or use substring and get make and model
        Count number of chars in model and using a loop
        build that many stars
         */
        //1.using Split
            String[] carArray=car.split("-");
        String make=carArray[0];
        String model=carArray[1];
        /*
        2.using substring, indexOf
        String make=car.substring(0,car.indexOf("-"0));
        String model=car.substring(car.indexOf("-")+1)
         */
        String carModelMasked="";
        String stars="";
        for (int i = 1; i <=model.length(); i++) {
            stars+="*";
        }
        System.out.println(make+"-"+stars);
    }
}
