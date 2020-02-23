package day06_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 15;
        System.out.println("Cars in parking lot: "+cars);//15
        cars = cars+2;
        System.out.println("Cars in parking lot: "+cars);//17
        cars+=3;//add 3 more to cars
        System.out.println("Cars in parking lot: "+cars);//20
        cars=cars-1;
        System.out.println("Cars in parking lot: "+cars);//19
        cars-=2;
        System.out.println("Cars in parking lot: "+cars);//17
        cars*=3;//cars=cars*3;
        System.out.println("Cars in parking lot: "+cars);//51
        cars/=3;
        System.out.println("Cars in parking lot: "+cars);//17
        String letter ="A";
        System.out.println("Letters: "+letter);
        letter=letter+"B";
        System.out.println("Letters: "+letter);
        letter+="CD";
        System.out.println("Letters: "+letter);
        //letters-="CD"; will not work
        int apples = 10;
        apples%=3;
        System.out.println("Apples left: "+apples);

    }
}
