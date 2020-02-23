package day34_methodspactice;

public class StringActions {
    public static void main(String[] args) {
        int num = countWord("java is fun");//3
        System.out.println("nums ="+num);
        System.out.println(countWord("java"));
        System.out.println(countWord(""));
        System.out.println("a in java: "+countChars("java", 'a'));
        System.out.println("i in Ersin: "+countChars("Ersin",'i'));
        int countOfchars=countChars("String value",'v');
        System.out.println("countOfChars = "+countOfchars);
    }public static int countWord(String sentence){
       if(sentence.isEmpty()) {
           return 0;
       }else{
       String[] array=sentence.split(" ");
       return array.length;

       }
    }
       public static int countChars(String str, char ch){
           int count=0;
           for (int i = 0; i <str.length() ; i++) {
               if(str.charAt(i)==ch){
                   count++;
               }

           }
           return count;
        }
    }

