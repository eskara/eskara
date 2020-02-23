package day25_arrays04_split;
import java.util.*;
public class SplitMethod {
    public static void main(String[] args) {
       //create a string
        String words="java,ruby,phyton,c++";
        //split the words by "," and assign to String[]
        String[] wordsArray=words.split(",");
        System.out.println("Length of wordsArray : "+wordsArray.length);
        System.out.println(wordsArray[2]);//phyton
        System.out.println(wordsArray[1]);//ruby
        System.out.println(Arrays.toString(wordsArray));

        String results="About 117,000,000 results(1.33 seconds)";
        String [] resultsArray=results.split(" ");
        System.out.println(resultsArray[0]+" "+resultsArray[2]+" "+resultsArray[3]);


    }
}
