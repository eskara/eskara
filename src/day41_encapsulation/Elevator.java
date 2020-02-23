package day41_encapsulation;

public class Elevator {
     private int currentFloor;//0 is default

    public void gotoFloor(int newFlor){
        //check if floor out of range
        if(newFlor<0|| newFlor>6){
            System.out.println("ERROR: Wrong floor selected: "+newFlor);
            return;
        }
        //3
        if(newFlor>currentFloor){
            for (int i = currentFloor+1; i <=newFlor ; i++) {
                System.out.println("going up to floor "+i);


            }
        }else if(newFlor<currentFloor){
            for (int i = currentFloor-1; i >=newFlor ; i--) {
                System.out.println("going down to floor "+i);

            }}else if(currentFloor==newFlor){
                System.out.println("You are already in "+newFlor+" floor");
            }
        currentFloor=newFlor;

    }
}
