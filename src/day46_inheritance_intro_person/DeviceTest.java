package day46_inheritance_intro_person;

public class DeviceTest {
    public static void main(String[] args) {
        Device device=new Device();
        device.brand="LG";
        device.price=900;
        device.country="South Korea";
        device.use();

        TV tv=new TV();
        tv.brand="SONY";
        tv.price=800;
        tv.country="Japan";
        tv.screenSize=66;
        tv.isSmart=true;
        tv.use();
        tv.watch();

        Phone phone=new Phone();
        phone.brand="Apple iPhone";
        phone.price=912.99;
        phone.country="China";
        phone.carrier="Sprint";
        phone.use();
        phone.call();
        phone.text("Java is fun!");

        SmartPhone smartphone=new SmartPhone();
        smartphone.brand="Samsung Galaxy Note 10";//Device
        smartphone.price=899.0;//Device
        smartphone.country="South Korea";//Device
        smartphone.carrier="Verizon";//Phone
        smartphone.memorySize=128;//SmartPhone

        smartphone.use();//Device
        smartphone.call();//Phone
        smartphone.text("Inheritance is fun");//Phone
        smartphone.useApp("Slack");//SmartPhone

    }

}
