package day18_for_loop;

public class StartEnd {
    public static void main(String[] args) {
        int start=6;
        int end=13;
        for(int startEnd=start;startEnd<=end;startEnd++){
            System.out.print(startEnd+" ");
        }
        System.out.println();
        //10 to 0
        for(int startEnd=10;startEnd>=0;startEnd--){
            System.out.print(startEnd+" ");
        }
        System.out.println();
        start=25;
        end=20;
        if(start<end)
        for(int n=start;n<=end;n++){
            System.out.print(n+" ");
        }else{
        for(int n=start;n>=end;n--){
            System.out.print(n+" ");
        }
        }
    }
}
