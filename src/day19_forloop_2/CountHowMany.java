package day19_forloop_2;

public class CountHowMany {
    public static void main(String[] args) {
        String str="java loops are fun";
        int count=0;
        char myChar='a';
        for(int n=0;n<=str.length()-1;n++){
            if(str.charAt(n)==myChar){
                count++;
                System.out.println(myChar+" found at "+n);

        }

            System.out.println("count = " + count);
            System.out.println("There are "+count+ " [myChar] "+n);


        }
    }
}
