package day09_multibranch_switch;

public class LanguagesV2 {
    public static void main(String[] args) {
        String language= "";
        String greeting="";
        int option =6;
        if(option==1) {
            language = "English";
            greeting = "Hello!";
        }else if(option==2) {
            language = "Espanol";
            greeting = "Hola!";
        }else if(option==3) {
            language = "France";
            greeting = "Bonjour!";
        }else if(option==4) {
            language = "Arabia";
            greeting = "Salam!";
        }else if(option==5){
            language="Russkiy";
            greeting="Privet!";}else if (option==6){
            language="Turkce";
            greeting="Merhaba";
        }
        System.out.println(language+" : "+greeting);}
    }

