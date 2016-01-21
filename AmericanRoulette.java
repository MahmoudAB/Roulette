/** AmericanRoulette Class - SubClass of Roulette Class
 * 
 * @author Mahmoud Abdel Basset
 */ 
public class AmericanRoulette extends Roulette {
	
	/* Initializes the Wheel Number array with numbers 0 to 37 
	 * Preserving the numbering order of real wheel 
	 * */
	AmericanRoulette() {
		super(38);
		wheelNumbers[0] = 0;
		wheelNumbers[1] = 28;
		wheelNumbers[2] = 9;
		wheelNumbers[3] = 26;
		wheelNumbers[4] = 30;
		wheelNumbers[5] = 11;
		wheelNumbers[6] = 7;
		wheelNumbers[7] = 20;
		wheelNumbers[8] = 32;
		wheelNumbers[9] = 17;
		wheelNumbers[10] = 5;
		wheelNumbers[11] = 22;
		wheelNumbers[12] = 34;
		wheelNumbers[13] = 15;
		wheelNumbers[14] = 3;
		wheelNumbers[15] = 24;
		wheelNumbers[16] = 36;
		wheelNumbers[17] = 13;
		wheelNumbers[18] = 1;
		wheelNumbers[19] = 37; // 00
		wheelNumbers[20] = 27;
		wheelNumbers[21] = 10;
		wheelNumbers[22] = 25;
		wheelNumbers[23] = 29;
		wheelNumbers[24] = 12;
		wheelNumbers[25] = 8;
		wheelNumbers[26] = 19;
		wheelNumbers[27] = 31;
		wheelNumbers[28] = 18;
		wheelNumbers[29] = 6;
		wheelNumbers[30] = 21;
		wheelNumbers[31] = 33;
		wheelNumbers[32] = 16;
		wheelNumbers[33] = 4;
		wheelNumbers[34] = 23;
		wheelNumbers[35] = 35;
		wheelNumbers[36] = 14;
		wheelNumbers[37] = 2;		
	}

}
