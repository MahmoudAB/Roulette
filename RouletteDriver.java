import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** Main class of the roulette application
 * 
 * @author Mahmoud Abdel Basset
 */
public class RouletteDriver 
{       /** Main method
        * 
        * @param args 
        */
	public static void main(String[] args) 
        {
                Dealer gameDealer = new Dealer(); /* Dealer */
                
                AmericanRoulette amerRoul = null; /* American wheel */
		EuropeanRoulette euroRoul = null; /* European wheel */
                boolean americanRoul = false; /* Whether we use European or american wheel */
                
                int playerLoop = 0; /* Flags which player is betting */
		int numOfPlayers = 6; /* Number of players in the game */
		int [] straightBets = new int[10]; /* Bets of a player */
                int numBets = 0;    /* Number of bets, to validate max bets */
                               
                /* Keyboard input for user input choice for roulette wheel or for continuing to play*/
                BufferedReader buffReadForChoice = new BufferedReader(new InputStreamReader(System.in));
		int userSel = 0;
                
		/* Create and initialize Vip Player and Array of 5 regular Players */
		VipPlayer player1Vip = new VipPlayer();
		Player [] totalPlayers = new Player[5];
		for(int loop = 0; loop < totalPlayers.length; loop++) 
                {
			totalPlayers[loop] = new Player();
		}
		
                /* User Menu Selection for type of roulette */
                System.out.println("Please Select the Roulette to Play ");
                System.out.println("1. American Roulette");
                System.out.println("2. European Roulette");
                System.out.println("3. Quit Game");

                try 
                {       /* Read user menu selection form keyboard */
                        userSel = Integer.parseInt(buffReadForChoice.readLine());
                } 
                catch (Exception e1) 
                {
                        System.out.println("Please Check your input ");
                } 
                /* Process menu selection */
                switch (userSel)
                {	
                        case 1: 
                                amerRoul = new AmericanRoulette();
                                americanRoul = true;
                                System.out.println("Wheel : " + amerRoul);
                                break;

                        case 2:
                                euroRoul = new EuropeanRoulette();
                                System.out.println("Wheel : " + euroRoul);
                                break;

                        case 3:
                                System.exit(0);
                                break;

                        default:
                                System.out.println("Sorry, invalid Choice");
                                System.exit (0);
                                break;
                }
		
                /* Play the game */
                while (true)
                {   /* Dealer announcement to start betting */
                    System.out.println("\nDealer : Place Your Bets");

                    /************Get Players Bet Input Values ***********/
                    playerLoop = 0; /* vip player bets first */
                    while(playerLoop < numOfPlayers) 
                    {       /* This is vip player turn to bet */
                            if(playerLoop == 0) 
                            {
                                    System.out.print("Player 1 (Vip Player) : ");
                            }
                            else /* this is the regular players turn to bet */
                            {
                                    int currentPlayer = playerLoop + 1;
                                    System.out.print("Player "+ currentPlayer +": ");
                            }

                            BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
                            try 
                            {
                                    String betNumbers = buffRead.readLine(); /* read bets from keyboard */
                                    String [] userBets= betNumbers.split(" "); /* Parse the bet string */
                                    /* If more than 5 bets, decline extra numbers */
                                    if(userBets.length > 5) 
                                    {
                                            numBets = 5;  /* Set max number of bets to 5 */
                                            System.out.println("Player can place only 5 bets");							
                                    }
                                    else
                                    {
                                        numBets = userBets.length; /* Set number of bets */
                                    }
                                  
                                    /* Convert the bet string to integer */
                                    for(int loop = 0; loop < userBets.length; loop++) 
                                    {
                                            straightBets[loop] = Integer.parseInt(userBets[loop]);					
                                    }

                                    /* Save bets for each player in class tableLayout using class Player */                                   
                                    if(playerLoop == 0) {
                                            player1Vip.playBets(/*userBets.length*/numBets, straightBets);
                                            player1Vip.setNumBets(numBets); /* Set the number of bets for vip player */
                                    }
                                    else 
                                    {
                                            totalPlayers[playerLoop - 1].playBets(/*userBets.length*/numBets, straightBets);
                                            totalPlayers[playerLoop - 1].setNumBets(numBets); /* Set the number of bets for regular player */
                                    }
                            } 
                            catch (IOException e) 
                            {
                                    System.out.println("Error with Input");
                            }
                            playerLoop++; /* Get next player to bet */
                    }
                    /* Dealer announcement to stop betting */
                    System.out.println("Dealer : No More Bets ");

                    /*Rotate Wheel invocation by Dealer */
                    int winningValue = gameDealer.rotateWheel(americanRoul); /* Get winning number */
                    System.out.println("Dealer : The Winning Number is " + winningValue);

                    /*Calculate and Print the Winnings and total bets */
                    gameDealer.calculateRewards(player1Vip, player1Vip.getBetNums());
                    for(int loopPlayers = 0; loopPlayers < totalPlayers.length; loopPlayers++) {
                            gameDealer.calculateRewards(totalPlayers[loopPlayers], totalPlayers[loopPlayers].getBetNums());
                    }
                    gameDealer.displayWinValues();
                    System.out.println("");

                    /* Prompt user if he wants to play again */
                    System.out.println("\nDo you want to play another game?");
                    System.out.println("1. Play again");
                    System.out.println("2. Quit Game");

                    try 
                    {
                            userSel = Integer.parseInt(buffReadForChoice.readLine());
                    } 
                    catch (Exception e1) 
                    {
                            System.out.println("Please Check your input ");
                    } 
                    switch (userSel)
                    {	
                            case 1: 
                                    /* Play again */
                                    break;

                            case 2: System.out.println("Good bye, come play again\n");
                                    /* Display total number of bettings, winnings and rewards */
                                    System.out.print("Vip player 1 has bet " + (player1Vip.getTotalBets() * 10));
                                    System.out.print(" has won " + (player1Vip.getTotalWins() * 10 * 35));
                                    System.out.println(" and has been rewarded " + ((player1Vip.getTotalWins() * 0.10 * 10 * 35) + (player1Vip.getTotalBets() * 0.05 * 10 * 35)));
                                    for(int loopPlayers = 0; loopPlayers < totalPlayers.length; loopPlayers++)
                                    {
                                        System.out.print("Player" + " " + (loopPlayers+2) + " has bet " + (totalPlayers[loopPlayers].getTotalBets() * 5));
                                        System.out.println(" and has won " + (totalPlayers[loopPlayers].getTotalWins() * 5 * 35));
                                    }
                                    System.exit(0);
                                    break; 

                            default:
                                    System.out.println("Wrong choice, start a new game");
                                    System.exit (0);
                                    break;

                    }

                }
	}

}
