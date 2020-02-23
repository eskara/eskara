package day26_arrays05;

public class CanvasURL {
    public static void main(String[] args) {
        String url = "www.learn.cybertekschool.com/courses/288/modules";
        String [] urlArr=new String[4];
        //declare String array with 4 items and assign values
        urlArr[0]="www.learn.cybertekschool.com";
        urlArr[1]="courses";
        urlArr[2]="288";
        urlArr[3]="modules";
        url.split("/");
        String [] splitUrlArr=url.split("/");
        System.out.println("length: "+splitUrlArr.length);
        //for loop:
        for (int i = 0; i <splitUrlArr.length; i++) {
            System.out.println(splitUrlArr[i]);
        }
        //for each loop
        for(String each: splitUrlArr){
            System.out.println(each);
        }
        //declare 4 variables, baseURL, resource, id, target.
        //and assign values from the array indexes.
        String baseURL=splitUrlArr[0];
        String resource=splitUrlArr[1];
        String id=splitUrlArr[2];
        String target=splitUrlArr[3];
        System.out.println("baseURL = " + baseURL);
        System.out.println("resource = " + resource);
        System.out.println("id = " + id);
        System.out.println("target = " + target);

        /*
        Check the id print course name, using conditional statements.
        288->Java Programming
        287->Interview preparation
        286->API testing
        289->QA Testing
        290->Review Session
        ->Unknown Course
         */
        switch (id){
            case "288":
                System.out.println("Java Programing");
                break;
            case "287":
                System.out.println("Interview preparation");
                break;
            case "286":
                System.out.println("API Testing");
                break;
            case "289":
                System.out.println("QA Testing");
                break;
            case "290":
                System.out.println("Review Course");
                break;
        }
        }

    }

