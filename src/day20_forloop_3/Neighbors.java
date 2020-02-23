package day20_forloop_3;

public class Neighbors {
    public static void main(String[] args) {
        String str="jaavvaa iis fuun";
        for(int idx=0;idx< str.length()-1;idx++){
           // System.out.println(str.charAt(idx)+""+str.charAt(idx+1));
        if(str.charAt(idx)==str.charAt(idx+1)){
            System.out.println("Beep - "+str.charAt(idx));
        }
        }

    }
}
