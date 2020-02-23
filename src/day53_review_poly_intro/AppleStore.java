package day53_review_poly_intro;

import javax.crypto.Mac;

public class AppleStore {
    public static void main(String[] args) {
        //AppleDevice
        AppleWatch iWatch = new AppleWatch();
        iWatch.name = "Apple Watch";
        iWatch.series = 5;
        iWatch.use();
        iWatch.wear();
        iWatch.countSteps();
        iPhone myPhone = new iPhone();
        myPhone.name="iPhone";
        myPhone.model="11 Pro";
        myPhone.use();
        myPhone.code();
        myPhone.navigate();
        myPhone.wear();

        MacPro macPro=new MacPro();
        macPro.name="MacPro";
        macPro.model="Cheese Grater";
        macPro.use();
        macPro.useAsServer();
        macPro.code();
        macPro.hashCode();
        System.out.println(macPro.hashCode());
    }
    }
