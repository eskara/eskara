package day16_memory_whie_loop_intro;

public class PrintLast {
    public static void main(String[] args) {
        String word="USA";
        System.out.println(word.charAt(2));
        /*
        find out number characters in string
        use that number as input to charAt method(-1)

         */
        System.out.println(word.length());
        System.out.println(word.charAt(word.length()-1));

    }
}
