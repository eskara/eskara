package day50_inheritance_hiding;

import javax.xml.namespace.QName;

public class CapitalCity extends City{
    private String country;
    private long population;

    public CapitalCity(){
      super();
    }
    public CapitalCity(String name, String country, long population){
       //super(name);
        setName(name);

        this.country=country;
        setCountry(country);
    }

    public static void buildARoad(){
        System.out.println("Capital city - building a road...");
    }

    @Override
    public String toString() {
        //return "name"+getName()+", country = "+ country+", population = "+population;
        return super.toString()+", "+"country = " + country+ " population = "+  population;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
