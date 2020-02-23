package day16_memory_whie_loop_intro;

public class StartEnd {
    public static void main(String[] args) {
        String str="I am a [java] programmer";
        int start=str.indexOf("[");
        int end=str.indexOf("]");
        System.out.println(str.substring(start+1,end));

    }
}
