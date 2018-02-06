import java.util.Random;
import java.util.Arrays;
public class Bet {
        public int[] generateBet() {
            int bet[] = new int[6];
            for (int i = 0; i < 6; i++) {
                bet[i] = random(1,49);
                for(int j=0;j<i;j++)
                {
                    if(bet[i]==bet[j])
                    {
                        bet[i]=random(1,49);
                        j=0;
                    }
                }
            }
            Arrays.sort(bet);
            return bet;
        }
        public void printBet(int[] bet)
        {
            for(int i =0;i<bet.length ;i++)
            {
                System.out.println(bet[i]);
            }
        }
        public int random(int min, int max)
        {
            Random rand = new Random();
            int randomNum= rand.nextInt((max-min)+1)+min;
            return randomNum;
        }

}
