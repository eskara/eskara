package day14;

public class StringsIndexOf {
    public static void main(String[] args) {
                    //012345
        String  word="github";
        System.out.println(word.indexOf("g"));//0
        System.out.println(word.indexOf("h"));//3
        System.out.println(word.indexOf("b"));//5
        System.out.println(word.indexOf("j"));//-1
        System.out.println(word.indexOf("hu"));//3(basladigi yeri veriyo )
    }
}
