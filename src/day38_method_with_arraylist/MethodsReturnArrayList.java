package day38_method_with_arraylist;

import java.util.*;
public class MethodsReturnArrayList {
    public static void main(String[] args) {
       //call getMonth() and print out returned list
        System.out.println(getMonts());
        //call getMonth() and assign returned list intro another list then print 
        List<String>allMonthaInYear=getMonts();
        System.out.println("allMonthaInYear = " + allMonthaInYear);
    }
   /*
Method:getMonths
Param:Non
Returns: List<String>
Returns list with all month names.

 */

    public static List<String> getMonts() {
        List<String> allMonth = new ArrayList<>();
        allMonth.add("January");allMonth.add("February");allMonth.add("March");
        allMonth.add("April");allMonth.add("May");allMonth.add("June");
        allMonth.add("July");allMonth.add("August");allMonth.add("September");
        allMonth.add("October");allMonth.add("November");allMonth.add("December");
        return allMonth;

    }
}
