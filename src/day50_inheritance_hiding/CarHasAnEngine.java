package day50_inheritance_hiding;

public class CarHasAnEngine {
    public static void main(String[] args) {
        Engine myCarEngine=new Engine("m50b25", 192, 6);
        System.out.println(myCarEngine.toString());

        Car bmw=new Car("BMW 525i", myCarEngine);
        System.out.println(bmw.getEngine().toString());

        //new car with new engine
        //m256, 577, 8 -> Mercedes GT Amg
        Engine gtEngine = new Engine("m256", 577, 8);
        Car gt = new Car("Mercedes GT AMG", gtEngine);
        System.out.println(gt.toString());
        Car mercedes = new Car("Mercedes GT AMG", new Engine("m256", 577, 8));
        System.out.println(mercedes.toString());

        Car corolla=new Car();
        corolla.setModel("Toyota Corolla");
         Engine corollaEng=new Engine("c45i",180,4);
        corolla.setEngine(corollaEng);
        System.out.println(corolla.toString());

    }
}
