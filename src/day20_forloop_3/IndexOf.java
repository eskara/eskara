package day20_forloop_3;

import org.w3c.dom.ls.LSOutput;

public class IndexOf {
    public static void main(String[] args) {

        String word = "Java is fun";
      //print everything to lowercase
        char letter='v';//we will look for this letter in the word

        int index=-1;//position of a letter - assume not there and assign -1
        //loop from first char until last
        for(int i =0; i<word.length();++i) {
            //System.out.println(word.charAt(i));
            if (word.charAt(i) == letter) {
                index = i;
                // System.out.println(letter+" found at "+i);
                System.out.println(letter+" was found at index #"+index);
            }
        }







    }
}