package day14;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word="Selenium";

            System.out.println(word.startsWith("S"));//True
        System.out.println(word.startsWith("Se"));//True
        System.out.println(word.startsWith("el"));//false
        //endsWith practise
        System.out.println(word.endsWith("m"));//True
        System.out.println(word.endsWith("nium"));//True
        System.out.println(word.endsWith("nn"));

        String name= "Mr. Omer";
        if (name.startsWith("Mr.")){
            System.out.println("Man");}else if(name.startsWith("Mrs.")){
            System.out.println("Married woman");

            String website = "www.google.com";
            if(website.endsWith(".com")){
                System.out.println("English site");}else if(website.endsWith(".edu")){
                System.out.println("College site");}else if(website.endsWith(".gov")){
                System.out.println("Goverment site");

            }
        }

    }
}
