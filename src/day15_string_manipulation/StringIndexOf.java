package day15_string_manipulation;

public class StringIndexOf {
    public static void main(String[] args) {
        String technologies = "java,c++,python,tomcat,aws";
        System.out.println(technologies.indexOf("java"));
        int java, c, python, tomcat, aws;
        //System.out.println(java);Error.nothing assigned
        java = technologies.indexOf("java");
        c = technologies.indexOf("c++");
        python = technologies.indexOf("python");
        tomcat = technologies.indexOf("tomcat");
        aws = technologies.indexOf("aws");
        int html = technologies.indexOf("html");
        System.out.println("java = " + java);
        System.out.println("c = " + c);
        System.out.println("python = " + python);
        System.out.println("tomcat = " + tomcat);
        System.out.println("aws = " + aws);
        System.out.println("html = " + html);

        //technologies->how can i check if"c++" is in the technologies String.
        //contains
        //indexOf result is>-1
        if (technologies.contains("c++")) {
            System.out.println("c++ is there");
        } else {
            System.out.println("c++ is not present");
            if (technologies.indexOf("c++") > -1) {
                System.out.println("c++ is there");
            } else {
                System.out.println("c++ is not present");
            }


        }
        int firstComma = technologies.indexOf(",");
        System.out.println("first Comma = " + firstComma);
        int lastComma = technologies.lastIndexOf(",");
        System.out.println("lastComms = " + lastComma);
        //how to find seconf,or third comma?

        System.out.println(technologies.indexOf(",",5));
        String url="www.cybertekschool.okta.com";
        int firstDot=url.indexOf(".");
        int secondDot=url.indexOf(".",firstDot+1);
        System.out.println("secondDot = " + secondDot);
        System.out.println(url.indexOf(".",url.indexOf(".")+1));
    String word="java";
        System.out.println(word.replace("j","h"));
        System.out.println(word.replace("java","c++"));

    }
}