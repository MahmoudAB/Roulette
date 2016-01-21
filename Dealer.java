/** Dealer Class - Rotates the Roulette Wheel Has a Relationship with European Roulette Class and American Roulette Class
 * 
 * @author Mahmoud Abdel Basset
 */
public class Dealer {

	int playerNum;	// Current active player number 
	EuropeanRoulette euroRoul = null; // European roulette wheel
	AmericanRoulette amerRoul = null; // American roulette wheel
	int [] winValues = null; //SWinning Values of Each player
	int winningValue; // Winning number
	
        /** Default constructor
         * 
         */
	Dealer() 
        {
        playerNum = 0;	
	euroRoul = new EuropeanRoulette();
	amerRoul = new AmericanRoulette();
	winValues = new int[6]; 
	winningValue = -1;  
	}
	
	/** Function to invoke Rotate Wheel of the appropriate Roulette
         * 
         * @param americanRoul
         * @return winningValue
         */
	public int rotateWheel(boolean americanRoul) 
        {
		if(americanRoul) {
			winningValue = Math.abs(amerRoul.rotateWheel(38));
		}
		else {
			winningValue = Math.abs(euroRoul.rotateWheel(37));
		}
		
		return winningValue;
	}
	
	/** Function to calculate the winnings and bets for each player
         * 
         * @param playerObj
         * @param betNums 
         */
	public void calculateRewards(Player playerObj, int[] betNums) 
        {
		int loopBetNums = 0;    /* Number of bets */
                boolean win = false;    /* Stop looping once a winning number is found in this player bet */
                winValues[playerNum] = 0;   // Reset win count for this player */
		while( (loopBetNums < playerObj.getNumBets()) && (!win) /* betNums.length*/) 
                {                   
                        /* Find out if this player has won */
                        if(winningValue == betNums[loopBetNums])
                        {
                            playerObj.setTotalWins();   /* Update total wins */
                            playerObj.setTotalPrize();  /* Update total amount won */
                            winValues[playerNum] = playerObj.getTotalPrize(); /* Flag this player has won */
                            win = true;
                        }
			loopBetNums++;
		}	
		playerNum++;
	}
	
	/** Function to display the Amount won by each player
         * 
         */
	public void displayWinValues() 
        {
		int loopWinValues = 0;      /* Number of players */
		int winCounts = 0;          /* Number of winners */
		while(loopWinValues < winValues.length)
                {   
			if(winValues[loopWinValues] != 0) 
                        {
				System.out.println("Dealer : Player " + (loopWinValues + 1) + " wins $" + winValues[loopWinValues]);
				winCounts++;
			}
			loopWinValues++;
		}
		if(winCounts == 0) 
                {
			System.out.println("Dealer : No Player Won");
		}
		playerNum = 0;
	}
	
}
