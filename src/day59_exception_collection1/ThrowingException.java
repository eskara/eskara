package day59_exception_collection1;

public class ThrowingException {
    public static void main(String[] args) {
        //create object of Aritmetic exception
        ArithmeticException ar=new ArithmeticException();
        RuntimeException ar2=new ArithmeticException("cannot / by 0");
        System.out.println(ar.getMessage());
        System.out.println(ar2.getMessage());
        //throw ar;  // throw means show that error
        //System.out.println("java"); code does not reach to this line
        String userName="user12";
        if(userName.isEmpty()){
            throw new RuntimeException("username can not be empty");
        }else {
            System.out.println("username is valid");
        }
        int age=20;
        if(age>18){
            System.out.println("Eligible to vote");
        }else{
            //Thrown to indicate that a method has been passed an illegal or inappropiate argument
            throw new IllegalArgumentException("ineligible to vote");
        }
        int month=2;
        if(month>=1&&month<=12){
            System.out.println("month is valid "+month);
        }else{
            throw new RuntimeException("invalid month "+month);
        }
        int [] nums={44,55,11};
        int index=22;
        if(index<0 || index>=nums.length){
            throw new ArrayIndexOutOfBoundsException("index is invalid "+index);
        }else{
            System.out.println("index "+index+" value "+nums[index]);
        }
        String firstName="Nadir";
        if(firstName==null){
            throw new NullPointerException("firstname cannot be null");
        }
        for (int i = 0; i <firstName.length() ; i++) {
            System.out.println(firstName.charAt(i));
        }
        System.out.println(getWeekDayName(12));
    }
    public static String getWeekDayName(int day){
        if(day>7||day<1){
            throw new IllegalArgumentException("day is invalid");
        }
        String dayName="";
        switch (day){
            case 1:dayName="Monday"; break;
            case 2:dayName="Tuesday"; break;
            case 3:dayName="Wednesday"; break;
            case 4:dayName="Thursday"; break;
            case 5:dayName="Friday"; break;
            case 6:dayName="Saturday"; break;
            case 7:dayName="Sunday"; break;
        }
        return dayName;

    }
}
