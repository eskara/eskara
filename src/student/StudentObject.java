package student;

public class StudentObject {
    public static void main(String[] args) {
    CalambaStudent calamba =new CalambaStudent();

    calamba.getVisa();
    calamba.attendClass();

    CampusStudent campusSt=new CampusStudent();
    campusSt.name="Wali";
    campusSt.studentID=12345;
    campusSt.attendClass();
    campusSt.code("phyton");
    campusSt.playPingPong();

    }

}
