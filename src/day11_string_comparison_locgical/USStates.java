package day11_string_comparison_locgical;

public class USStates {
    public static void main(String[] args) {
        String state = "va";
        if (state.equalsIgnoreCase("VA")){
            System.out.println("Virginia");}else if(state.equalsIgnoreCase("NY")){
            System.out.println("New York");}else if(state.equalsIgnoreCase("IL")){
            System.out.println("Illinois");}else if(state.equalsIgnoreCase("CA")){
            System.out.println("California");}else{
            System.out.println("Some state, not in database");
        }
    }
}