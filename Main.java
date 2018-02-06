import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[])
    {
        Scanner info = new Scanner(System.in);
        int nBets;
        System.out.println("How many bets would you like to make?");
        nBets = info.nextInt();
        int[][] bets = new int[nBets][6];
        for(int i=0;i<nBets;i++)
        {
            Bet newBet = new Bet();
            bets[i]= newBet.generateBet();
            for(int j=0;j<i;j++)
            {
                if(Arrays.equals(bets[j],bets[i]))
                {
                    bets[i]=newBet.generateBet();
                    j=0;
                }
            }
            System.out.println("Bet Number: "+ (i+1) + " ");
            newBet.printBet(bets[i]);

        }

    }
}
