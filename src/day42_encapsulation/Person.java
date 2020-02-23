package day42_encapsulation;
//2.class

/*Name should not be empty
age can only be 0-170
 */
public class Person {
    //Encapsulate below variable
    private String name;//null
    private int age;//0
public void setAge(int newAge){
 if(newAge>0&&newAge<=170){
     age=newAge;
 }else{
     System.out.println("ERROR: Invalid age - "+newAge);
 }
}
public int getAge(){//private den kurtarmak icin yaziyoruz

    return age;
}
    public String getName() {
        return name;
    }
    //getter/setter -write only
    //read only
    public void setName(String newName){
        if(!newName.isEmpty()) {
            name = newName;
        }else{
            System.out.println("ERROR: name can not be empty");
        }
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
