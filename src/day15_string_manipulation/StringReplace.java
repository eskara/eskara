package day15_string_manipulation;

public class StringReplace {
    public static void main(String[] args) {
        String words="sad, cry, phyton";
        System.out.println(words.replace("sad","happy"));
        System.out.println(words.replace("cry", "smile"));
        System.out.println(words.replace("phyton","java" ));

        System.out.println("words = " + words);
        words=words.replace("sad","happy");
        words=words.replace("cry", "smile");
        System.out.println("words = " + words);
        //change "smile" to "SMILE"
        System.out.println(words.replace("simle","SMILE"));

        String capital="London is capital of UK";
        capital=capital.replace("London","Ankara");
        capital=capital.replace("UK","TURKEY");
        System.out.println(capital);

        capital=capital.replace("Ankara","Washington DC").replace("TURKEY","USA");
        System.out.println("capital = " + capital);

    }
}
