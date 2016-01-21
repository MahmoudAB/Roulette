import java.util.Arrays;

/** TableLayout Class - Stores the Bet Numbers made by a Player
 * 
 * @author Mahmoud Abdel Basset
 */
    public class TableLayout 
    {
            /* To illustrate package access */
	   /* private */ int [] betNumbers;  /* Bet array for each player */
           /* private */ int numBets;  /* number of bets */
	
        /** Default constructor
         
         */
	TableLayout() 
        {		
                numBets = 0;
		betNumbers = new int[5];
		Arrays.fill(betNumbers, -1); /* Initialize array to -1 */
	}
     

    }
