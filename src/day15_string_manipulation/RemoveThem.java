package day15_string_manipulation;

public class RemoveThem {
    public static void main(String[] args) {
        String sentence="Java is fun";
        //" "=> ""
        String withNoSpace=sentence.replace(" ","");
        System.out.println("sentence = " + sentence);
        System.out.println("withNoSpace = " + withNoSpace);

        String etsyResult="iphone case (212,713 results)";
        etsyResult=etsyResult.replace(etsyResult,"212713");
        System.out.println("etsyResult = " + etsyResult);
        
        String mixed="!@J$A%^VA*(";
        System.out.println("mixed = " + mixed);
        mixed=mixed.replace("!@","")
       .replace("$","")
        .replace("%^","")
        .replace("*(","");
        System.out.println("mixed = " + mixed);
        //SUBSTRING
        String word = "java";
        System.out.println(word.substring(0,2));//"ja"
        System.out.println(word.substring(0,1));//"j"
        System.out.println(word.substring(1,3));//"av"
        System.out.println(word.substring(2,4));//"va"
        //this method is use to extract a partial string from whole string.we need to provide starting index i/pozition
        //and ending index.Character at ending index is not inclusive.


    }
}
