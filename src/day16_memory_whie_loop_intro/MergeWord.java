package day16_memory_whie_loop_intro;

public class MergeWord {
    public static void main(String[] args) {
        String str="{[]}";
        String word="java";
        //{[java]}
        System.out.println(str.substring(0,2)+word+str.substring(2));
        String merged= str.substring(0,2)+word+str.substring(2);
        System.out.println(merged);
    }
}
