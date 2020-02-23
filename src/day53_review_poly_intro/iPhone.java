package day53_review_poly_intro;

public  class iPhone extends AppleDevice implements Codeable {
    String model;
    String name;
    public void navigate(){
        System.out.println("iPhone - navigating using GoogleMaps app...");
    }
    @Override
    public void use() {
        System.out.println(name+" model " + model + "- using to call, text, play games, flipgrid..." );
    }
    @Override
    public void code() {
        System.out.println(name+ " model "+model + " - coding java in repl.it, codingbat, notes...");
    }

    public void wear() {
        System.out.println(name + " model " +model+ "- wearing on arm using case...");
    }
}
