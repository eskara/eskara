package day32_custommethods;

public class VotingCheck {

        public static void main(String[] args) {

            checkIfCanVote(25);
        }
        public static void checkIfCanVote (int age) {
            if(age>=18){
                System.out.println("You are eligible to vote");
            }else{
                System.out.println("You are not eligible to vote");
            }
        }
    }
