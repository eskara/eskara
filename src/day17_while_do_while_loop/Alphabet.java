package day17_while_do_while_loop;

public class Alphabet {
    public static void main(String[] args) {
        char letter ='a';
        while (letter<='z'){
            System.out.print(letter+" ");
            letter++;
        }
        System.out.println();
        //print alphabet in  reverse
        letter='z';
        while (letter>='a'){
            System.out.println(letter+" ");
            letter--;

        }
        System.out.println();
        String letters ="";
        char l = 'A';
        letters+=l;
        l='B';
        letters+=l;
        System.out.println("letters: "+letters);
        char myLetter='A';
        String alphabet="";
        while (myLetter<='Z'){
            alphabet+=myLetter;
            System.out.println(alphabet);
            myLetter++;

        }
    }
}
