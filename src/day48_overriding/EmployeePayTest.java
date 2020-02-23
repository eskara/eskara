package day48_overriding;

public class EmployeePayTest {
    public static void main(String[] args) {


        Employee emp = new Employee();
        emp.calculatePay(40,20);
        FullTimeEmployee ftEmp=new FullTimeEmployee();
        ftEmp.calculatePay(40, 20);
        Contractor contEmp=new Contractor();
        contEmp.calculatePay(40, 20);
        System.out.println(emp.toString());
        System.out.println(contEmp.toString());
        System.out.println(ftEmp.toString());
    }
}