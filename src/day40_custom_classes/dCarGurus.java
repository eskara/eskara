package day40_custom_classes;

public class dCarGurus {
    public static void main(String[] args) {
        cCar acura=new cCar();
        acura.model="Acura ILX";
        acura.price=28150.0;
        acura.color="White";
        acura.year=2020;
        System.out.println("acura model: "+acura.model);
acura.drive();
acura.showPrice();
cCar bmw=new cCar();
bmw.model="530i";
bmw.price=51115.0;
bmw.color="Black";
bmw.year=2019;

bmw.drive();
bmw.showPrice();
//another car object
        cCar porsche= new cCar();
        porsche.setCarInfo("Porsche 911", 127500, "Red", 2020 );
        porsche.drive();

        cCar toyota=new cCar();
        toyota.setCarInfo("Toyota Prius", 21400.0, "Blue", 2019);
        System.out.println(toyota.model);
        System.out.println(toyota.price);
        System.out.println(toyota.color);
        System.out.println(toyota.year);

        //call getCarInfo for all car object we have
        acura.getCarInfo();
        bmw.getCarInfo();
        porsche.getCarInfo();
        toyota.getCarInfo();

        //compare prices of bmw and porsche and print which one is more expensive

        if(bmw.price>porsche.price){
            System.out.println("BMW is more expensive");}else{
            System.out.println("Porsche is more expensive");
        }
    }
}
