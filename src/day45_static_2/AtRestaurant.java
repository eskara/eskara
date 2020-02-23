package day45_static_2;

public class AtRestaurant {
    public static void main(String[] args) {
        Dinner mom=new Dinner();
        Dinner dad=new Dinner();
        Dinner kid=new Dinner();

        System.out.println("Total Slice: "+Dinner.pizzaSlice);
        kid.takeASlice();
        mom.takeASlice();
        dad.takeASlice(2);
        System.out.println("Total Slice: "+Dinner.pizzaSlice);
        System.out.println("Kid: "+kid.pizzaSlice);
        System.out.println("Mom: "+mom.pizzaSlice);
        System.out.println("Dad: "+dad.pizzaSlice);

        dad.pizzaSlice=8;
        System.out.println("Total Slice: "+Dinner.pizzaSlice);
        System.out.println("Kid: "+kid.pizzaSlice);
        System.out.println("Mom: "+mom.pizzaSlice);
        System.out.println("Dad: "+dad.pizzaSlice);


    }
}
