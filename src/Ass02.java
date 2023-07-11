import java.util.Random;
import java.util.Scanner;

public class Ass02
{
    public static void main(String[] args) {

        System.out.println("Let's play a game of CRAPS!");
        int points = 0;
        int diceSum = rolldice();
        System.out.println("Dice sum is: "+ diceSum);
        if(diceSum == 2 || diceSum == 3 || diceSum == 12)
        {
            System.out.println("Craps! Game is over, you lose!");
        }
        else if(diceSum == 7 || diceSum == 11)
        {
            System.out.println("Natural! Game is over, you win!");
        }
        else
        {
            points = diceSum;
            System.out.println("Total points: "+ points);
            while(true)
            {

                diceSum = rolldice();
                System.out.println("Dice Sum: "+ diceSum);

                if(diceSum == points)
                {
                    System.out.println("Natural! You win!");
                    break;
                }
                else if(diceSum == 7)
                {
                    System.out.println("Craps! Game is over, you losye!");
                    break;
                }


            }
        }
        System.out.print("Would you like to PLAY AGAIN? [Y/y]: ");
        char playAgain = new Scanner(System.in).next().charAt(0);

        if(playAgain == 'Y' || playAgain == 'y')
        {
            main(null);
        }

    }
    public static int rolldice() {
        Random random = new Random();
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        System.out.println("Dice 1: " + dice1 + "\tDice 2: " + dice2);
        return dice1 + dice2;
    }
}