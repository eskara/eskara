package day34_methodspactice;

public class FormatString {
    public static void main(String[] args) {
        System.out.println(getNumberOfGoogleSearchResuls("About 513,000,000 results (0.93 seconds)"));
        long cppResults=getNumberOfGoogleSearchResuls("About 102,000,000 results (0.71 seconds)");
        System.out.println("cppResults = " + cppResults);
       // System.out.println(repeatString("java",5,'%'));
        repeatString("java",5,'%');
    }
    public static long getNumberOfGoogleSearchResuls(String searchResults){
        String countOfRs = searchResults.split(" ")[1];//split and get index 1
        // System.out.println("countOfRs = " + countOfRs);
        //remove commas
        countOfRs=countOfRs.replace(",","");
        // System.out.println("countOfRs = " + countOfRs);
        //     "33432323333"
        long count = Long.parseLong(countOfRs); //convert string numbers into long
        return count;
    }
    public static void repeatString(String word, int times, char delimiter){
        for (int i = 1; i <=times ; i++) {
            System.out.print(word+delimiter);
        }
        System.out.println();
    }
}





