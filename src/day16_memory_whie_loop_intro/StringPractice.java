package day16_memory_whie_loop_intro;

public class StringPractice {
    public static void main(String[] args) {
        String word="jav";//always 3 characters
        String reserved ="";//vaj
        /* 
        read third letter from word 
        and concatenate to reserved
        read second letter from word 
        and concatenate to reserved
        read first letter from word 
        and concatenate to reserved
         */
        System.out.println(word.charAt(2));
        reserved=reserved+word.charAt(2);
        System.out.println("reserved = " + reserved);
        System.out.println(word.charAt(1));
        reserved+=word.charAt(1);
        System.out.println("reserved = " + reserved);
        System.out.println(word.charAt(0));
        reserved=reserved+word.charAt(0);
        System.out.println("reserved = " + reserved);
        String reserved2="";
        reserved2=reserved2+word.charAt(2)+word.charAt(1)+word.charAt(0);
        System.out.println("reserved2 = " + reserved2);
        if(word.equals(reserved)){
            System.out.println("Palindrome 3 letter word");
        }else{
            System.out.println("Non-palindrome 3 letter word");

        }
        String rev="";
        rev=rev.concat("abc").concat("ers");
        System.out.println(rev);
        rev=rev.concat(""+word.charAt(0));
        System.out.println(rev);
    }
}
