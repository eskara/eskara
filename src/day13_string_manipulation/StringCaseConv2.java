package day13_string_manipulation;

public class StringCaseConv2 {
    public static void main(String[] args) {
        String word="Cybertek School";
        //print the word in all uppercase
        System.out.println(word.toUpperCase());
        //convert word to all uppercase and store into uWord veriable
        String uWord=word.toUpperCase();
        System.out.println("uWORD= "+uWord);
        word=word.toUpperCase();
        System.out.println("word = " + word);
        String lWord=word.toLowerCase();
        System.out.println("lWord = " + lWord);
        if(lWord.equals("cybertek school")){
            System.out.println("lWord is all lowercase");}else{
                    System.out.println("lWord is not all lowercase or does not match");
        }
    }
}
