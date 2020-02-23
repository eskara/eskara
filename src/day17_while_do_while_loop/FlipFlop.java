package day17_while_do_while_loop;

public class FlipFlop {
    public static void main(String[] args) {
        String word="code java";
        word=word.substring(5,9).toUpperCase()+word.substring(0,4).toUpperCase();
        System.out.println("word = " + word);

        String words="Wooden Spoon";
        System.out.println("space is at index "+words.indexOf(" "));
        int spaceIdx=words.indexOf(" ");
        System.out.println(words.substring(0,spaceIdx));
        System.out.println(words.substring(spaceIdx+1));
        String word1=words.substring(0,spaceIdx);
        String word2= words.substring(spaceIdx+1);
        System.out.println(word2+" "+word1);



    }
}
