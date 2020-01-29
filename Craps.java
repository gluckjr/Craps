
/**
 * Program which will allow the user to play the game of craps on the computer
 *
  * @author Robert Gluck
 * @version 1-14-2020
 */

import java.util.Scanner;
public class Craps
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       boolean playGame = true;
       System.out.println("Would you like to play Craps (y/n)?");
       if (in.nextLine().substring(0,1).equalsIgnoreCase("y"))
       { 
            System.out.println("Do you know how to play? (y/n): ");
            if (in.nextLine().substring(0,1).equalsIgnoreCase("n"))
            {
                System.out.println("1. A player rolls two six-sided dice and adds the numbers rolled together.");
                System.out.println("2. If the first roll is a 7 or an 11 you win. ");
                System.out.println("If the first roll is a 2, 3, or 12 you lose. ");
                System.out.println("If a 4, 5, 6, 8, 9, or 10 are rolled on the first roll, that number becomes the point. ");
                System.out.println("3. You will continues to roll the two dice again until you either roll the point again, in which case you win;"); 
                System.out.println("or they roll a 7, in which case you lose");
            }
            
            while (playGame)
            {
                Die die = new Die();
                System.out.println("Press [enter] to roll: ");
                in.nextLine();
                int r = die.roll(); 
                if(r == 7 || r == 11)
                {
                    System.out.println("You rolled a "+r+". You win!");
                }
                else if (r == 2 || r == 3 || r == 12)
                {
                    System.out.println("You rolled a "+r+". You lose!");
                }
                else
                {
                    int p = r;
                    System.out.println("The point is "+p+".  Good luck!");
                    int n = die.roll();
                    System.out.println("Press [enter] to roll: ");
                    in.nextLine();
                    while(n != p && n != 7)
                    {
                        n = die.roll();  
                        System.out.println("You rolled a "+n);
                        if(n == p)
                        {
                            System.out.println("You win!");
                        }
                        else if (n == 7)
                        {
                            System.out.println("You lose!");
                        }
                        else
                        {
                            System.out.println("Roll agan: ");
                            in.nextLine();
                        }
                    }
                }
                System.out.println("Would you like to play again? (y/n): ");
                if (in.nextLine().substring(0,1).equalsIgnoreCase("n"))
                {
                    System.out.println("Ok :( ");
                    playGame = false;
                }
            }
       }
       else
       {
           System.out.println("Ok :( ");
        }
    }
}
