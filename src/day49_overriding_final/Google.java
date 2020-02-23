package day49_overriding_final;

public class Google extends SearchEngine {

    public int search(String item){
        System.out.println("Googling for ... "+item+"\nreturning result count..");
        return item.length()*2;
    }
    protected void getResult(){
        System.out.println("Google displaying results...");
    }
    @Override
     public String clickResult(){ //burada public ekledim ama overriding bozulmadi ama private olursa bozulur
        System.out.println("Clicking result of Google");
        return "Google item details";
    }
}
