package day53_review_poly_intro;

public class AppleWatch extends AppleDevice {
    int series;
    public void countSteps(){
        System.out.println("Apple watch series "+series+" - counting each step...");
    }
    @Override
    public void use() {
        System.out.println("AppleWatch series "+series+" - using to check time, heartrate, exercise, applepay...");
    }

    public void wear() {
        System.out.println("AppleWatch series "+series+" - wear in wrist, neck...");
    }
}
