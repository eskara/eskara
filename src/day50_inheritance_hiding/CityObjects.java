package day50_inheritance_hiding;

public class CityObjects {
    public static void main(String[] args){
        City city=new City("Calamba");
        CapitalCity capital=new CapitalCity("Moscow", "Russia", 231414124L);

        System.out.println(city.toString());
        System.out.println(capital.toString());

        //static way of calling: ClassName.methodName
        City.buildARoad();
        CapitalCity.buildARoad();
        System.out.println("----TESTING HIDING----");
        //Test method hiding
        CapitalCity astana=new CapitalCity("Astana", "Kazakhstan", 2000000L);
        astana.letsBuildARoad();//this calling buildARoad which is hidden

    }
}
