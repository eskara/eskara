package day32_custommethods;

public class aTeamScores {
    public static void main(String[] args) {

        int[][] teamScores={{3,5,9,10,1}, {4, 9, 2, 8, 7}, {9, 8, 5, 3, 1}, {2, 2, 2, 5, 9}};
        int sumTeamScore=0;
        int winner=0;
        for(int team=0; team<teamScores.length;team++){
            int sum=0;
            for(int score =0;score<teamScores[team].length;score++){
                sum+=teamScores[team][score];
            }
            System.out.println("Team "+team+" Sum "+sum);
            if(sum>sumTeamScore){
                sumTeamScore=sum;
                winner=team;
            }
        }
        System.out.println("Winner team: "+winner+" Score: "+sumTeamScore);
    }
}
