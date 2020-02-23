package day37_arraylist;
import java.util.*;
public class TeamMates {
    public static void main(String[] args) {
        //declare arraylist
        ArrayList<String>team=new ArrayList<>();
        team.add("Marufjon");
        team.add("Vasyl");
        team.add("Master Muhtar");
        team.add("Kuazzat Altay");
        team.add("Luis The Boss");
        team.add("Murodil");
        team.add("Nadir - dont forget");
        team.add("Mike -YNFJ");
        team.add("Asiya - in our group");
        team.add("Walid");

        System.out.println("Team size: "+team.size());
        team.add("Akbar - Online Java");
        System.out.println("Team size: "+team.size());
        //print first | last person
        System.out.println(team.get(0)+" | "+team.get(team.size()-1));
        System.out.println();
        //print each value using for each loop
        for(String eachPerson:team){
            System.out.println(eachPerson);

        }//Print each value using for loop
        System.out.println();
        for (int i = 0; i <team.size() ; i++) {
            System.out.println(team.get(i));

        }//Print each person in reserved order
        System.out.println();
        for (int i = team.size()-1; i >=0 ; i--) {
            System.out.print(team.get(i)+", ");

        }
        for (int z = 0; z <team.size() ; z+=2) {
            if(z==team.size()-1){
                System.out.println(team.get(z));
            }else{

            System.out.println(team.get(z)+" | "+team.get(z+1));

        }

    }
        //declare String allTeam and add everyone into that string
        //Sapereted by-
        //Marufjan -Vasly- Master Muhtar
        //print out all team
        System.out.println();
        String allTeam="";
        for (String eachPerson : team){
            allTeam+=eachPerson+" - ";

        }allTeam=allTeam.substring(0,allTeam.length()-3);
        System.out.println("allTeam"+allTeam);
    }
}
