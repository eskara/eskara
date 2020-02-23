package day25_arrays04_split;

public class TimesArray {
    public static void main(String[] args) {
        int [] time1={16,40};
        int[] time2 ={16,43};
        //homework:Check if time1 and time2 have valid values
        //hour -0-23 minute -0-59
        //Assume time1 and time2 have valid data
        if(time1[0]<time2[0]){
            System.out.println("time1 is earlier "+time1[0]+":"+time1[1]);}else if(time2[0]<time1[0]){
            System.out.println("time2 is earlier "+time2[0]+":"+time2[1]);}else if(time1[0]==time2[0]&&time1[1]<time2[1]){
            System.out.println("time1 is earlier "+time1[0]+":"+time1[1]);}else if(time1[0]==time2[0]&&time1[1]>time2[1]){
            System.out.println("time2 is earlier "+time2[0]+":"+time2[1]);}else{
            System.out.println("time1 equals time2");
        }
    }
}
