package day11_string_comparison_locgical;

public class CreditScore {
    public static void main(String[] args) {
        int score=777;
        if (score>=750 && score<=850){
            System.out.println(score+" is exellent");}else if(score>=700&&score<=749){
            System.out.println(score+" is good");}else if(score>=650&&score<=699){
            System.out.println(score+" is fair");}else if(score>=550&&score<=649){
            System.out.println(score+" is poor");}else if(score>=549){
            System.out.println(score+" is bad");
        }
    }
}
