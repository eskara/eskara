package day11_string_comparison_locgical;

public class WeatherActivities {
    public static void main(String[] args) {
        String weather="sunny";
        switch(weather){
            case"sunny":
                System.out.println("Go to park");
                System.out.println("Code java");
                break;
            case"hot":
                System.out.println("Go swimming");
                System.out.println("Code java");
                break;
            case"windy":
                System.out.println("Fly a kite");
                System.out.println("Code java");
            case"snowy":
                System.out.println("build a snow man");
                System.out.println("Code java");
                break;
            case"rainy":
                System.out.println("Stay home");
                System.out.println("Code java");
                break;
            default:
                System.out.println("Keep coding java in any weather,anywhere");
        }
    }
}
