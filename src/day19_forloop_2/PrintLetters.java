package day19_forloop_2;

public class PrintLetters {
    public static void main(String[] args) {
        String name="Ersin";
        System.out.println(name.charAt(0));//E
        System.out.println(name.charAt(1));//r
        int n=0;
        System.out.println(name.charAt(n));//E
        n++;
        System.out.println(name.charAt(n));//r
        n++;
        for(int num=0;num<=name.length()-1;num++){
            System.out.println(name.charAt(num));
        }
    }
}
