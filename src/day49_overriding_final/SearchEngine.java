package day49_overriding_final;

public class SearchEngine {
    public int search(String item) {
        System.out.println("Searching for ... "+item+"\nreturning result count..");
    return item.length();
    }
    protected void getResult(){
        System.out.println("Search Engine displaying results...");
    }
        String clickResult(){
        System.out.println("Clicking result of search engine");
        return "SearchEngine item details";
    }


}
