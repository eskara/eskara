package day11_string_comparison_locgical;

public class StringEquals {
    public static void main(String[] args) {
        String str = "java";
        String str2 = new String( "java");
        //compare using==
        System.out.println(str=="java");
        System.out.println(str2=="java");
        //compare using .equals() method.compare chae by char
        System.out.println(str.equals("java"));
        System.out.println(str2.equals("java"));
        System.out.println(str2.equals("Java"));
        //compare using .equalsIgnoreCase() method
        System.out.println(str.equalsIgnoreCase("JAVA"));//true
        System.out.println(str2.equalsIgnoreCase("Java"));//true

        System.out.println(str.equalsIgnoreCase(str2));//true
    }
}
