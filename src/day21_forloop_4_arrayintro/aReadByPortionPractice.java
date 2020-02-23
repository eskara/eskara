package day21_forloop_4_arrayintro;

public class aReadByPortionPractice {
    public static void main(String[] args) {
        String str = "java, github username, javajava, phyton, automation java tools, java is most popular";
        System.out.println(str.substring(0, 1));
        System.out.println(str.substring(1, 2));
int e =0;
        int idx = 0;
        System.out.println(str.substring(idx, idx + 1));
        idx++;//1
        System.out.println(str.substring(idx, idx + 1));
        //read 2 letters using a variable
        idx = 0;
        System.out.println(str.substring(idx, idx + 2));//ja
        idx++;//1
        System.out.println(str.substring(idx, idx + 2));//av
        //read 3 letters using a variable
        idx = 0;
        System.out.println(str.substring(idx, idx + 3));//jav

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.substring(i, i + 1));
            System.out.println();}
            for (int i = 0; i < str.length() - 1; i++) {
                System.out.println(str.substring(i, i + 2));
            }
            //red 3 or more at a time using for loop and substring

            for (int i=0;i<str.length()-3;i++){
                   // System.out.println(str.substring(i,i+4));
            String temp=str.substring(i,i+4);
            if(temp.equals("java")){
                e++;
                System.out.println("java found! lets code it!");//kac tane java yaziyorsa o kadar tekrarlayacak
            }
            }
        System.out.println(e);
        }
    }
