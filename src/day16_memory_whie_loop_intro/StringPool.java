package day16_memory_whie_loop_intro;

public class StringPool {
    public static void main(String[] args) {
        String word1="java";//string pool
        String word2="java";//string pool, re-use
        String word3= new String("java");//outside the pool,in heap
        System.out.println(word1==word2);//True.both are pointing so same object in pool
        System.out.println(word1==word3);//word1 and word3 pointing to different object in heap.
        String word4=new String("java");//outside the pool.in heap
        System.out.println(word3==word4);//false.different object in memory.
        String word5=word4;
        System.out.println(word4==word5);//true.same object
        System.out.println(word1==word4);//false.different object
        System.out.println(word1.equals(word4));//true values match "java"

        String str= "macbook";//string pool in heap.
        String str1="macbook";//re-use "macbook" in pool
        String str3=str;//point to same object to


    }
}
