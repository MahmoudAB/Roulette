
/**  Player Class - Super Class of Vip Player Class Has a Relationship with Table Layout Class
 * 
 * @author Mahmoud Abdel Basset
 */
public class Player 
{
	
	private int totalBets; /* Total Bets Made by the Player */
	private int totalWins;  /* Total Wins Made by the Player */
	private int totalPrize; /* Total Prize won by the Player */
        private String player; /* Category of player */
        int chipValue; /* Value in dollars of the chip */
	TableLayout tlBets; /* The Bets made by the player */
	
        /** Default constructor
         * 
         */
	Player( ) 
        {   
                player = " ";    
		totalBets = 0;
		totalWins = 0;
		totalPrize = 0;
                chipValue = 5; 
		tlBets = new TableLayout();
	}
	
        /** constructor to initialize the category of player
         * 
         * @param playerType 
         */
        Player(String playerType) 
        {   
                player = playerType;
		totalBets = 0;
		totalWins = 0;
		totalPrize = 0;
		tlBets = new TableLayout();
	}
            
        /** Constructor to initialize the category of player and the chip value
         * 
         * @param playerType
         * @param chip 
         */
        Player(String playerType, int chip) 
        {   
                player = playerType;
                chipValue = chip; 
		totalBets = 0;
		totalWins = 0;
		totalPrize = 0;
		tlBets = new TableLayout();
	}
                
	/** Function to save the bets made by a Player
         * 
         * @param numOfBets
         * @param betNums 
         */
	public void playBets(int numOfBets, int [] betNums) 
        {
                int loop;
           	setTotalBets(numOfBets);
                
                /* Save the bets in the betNumbers array */
		for(loop = 0; loop < numOfBets; loop++) 
                {
			tlBets.betNumbers[loop] = betNums[loop];
		}
                
        }
	
	/** Function to Set the total bets made by a Player
         * 
         * @param numOfBets 
         */
	public void setTotalBets(int numOfBets) 
        {
		totalBets = totalBets + numOfBets;		
	}
	
	/** Function to retrieve the total bets made by a Player
         * 
         * @return totalBets
         */
	public int getTotalBets() 
        {
		return totalBets;
	}
	
	/** Function to Set the total Wins by a Player
         * 
         */
	public void setTotalWins() 
        {
		totalWins++;
	}
	
	/** Function to retrieve the total Wins by a Player
         * 
         * @return totalWins
         */
	public int getTotalWins() 
        {
		return totalWins;
	}
	
	/** Function to Set the total Prize won by a Player
         * 
         */
	public void setTotalPrize() 
        {
		totalPrize = getChipValue( ) * 35;
	}
	
	/** Function to retrieve the total Prize won by a Player
         * 
         * @return totalPrize
         */
	public int getTotalPrize() 
        {
		return totalPrize;
	}
	
	/** Function to retrieve the bet array
         * 
         * @return tlBets.betNumbers
         */
	public int[] getBetNums() 
        {       
		return tlBets.betNumbers;
	}
        
         /** Sets the count of bets for a player
         * 
         * @param nBets 
         */
        public void setNumBets(int nBets)
        {
            tlBets.numBets = nBets;
        }
        
        /** Function to retrieve the count of bets for a player
         * 
         * @return tlBets.numBets
         */
        public int getNumBets( )
        {
            return tlBets.numBets;
        } 
        
        /** Function to retrieve the chip value for a player
         * 
         * @return chipValue
         */
	public int getChipValue( )
        { 
            return chipValue;
        }
}
