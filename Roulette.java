import java.util.Random;

/** Roulette Class - Super Class of European Roulette Class and American Roulette Class
 * 
 * @author Mahmoud Abdel Basset 
 */
public class Roulette 
{
	int [] wheelNumbers; //Array that stores the wheel numbers based on the Roulette
	
	/** Constructor initializes wheel numbers based on the type of Roulette
         * 
         * @param roulNumCount 
         */
	Roulette(int roulNumCount) 
        {
		wheelNumbers = new int[roulNumCount];
	}
	
	/** Function invoked by Dealer to simulate wheel rotation and returns a Random value as a winning number
         * 
         * @param totalRouletteNums
         * @return winValue
         */
	public int rotateWheel(int totalRouletteNums) 
        {
            Random winningNum = new Random();		
	    long winValue = (winningNum.nextInt()) % totalRouletteNums;
	    return (int) winValue;
	}
	
	/** Creates a String representation based on the Roulette Object
         * 
         * @return rouletteDisplay
         */
	public String toString() 
        {
		String rouletteDisplay = "";
		for (int loop = 0; loop < wheelNumbers.length; loop++) 
                {
			if((loop + 1) == wheelNumbers.length) {
				rouletteDisplay += wheelNumbers[loop];
			}
			else 
                        {
				rouletteDisplay += wheelNumbers[loop] + "-";
			}
				
		}
		return rouletteDisplay;
	}
	
}
