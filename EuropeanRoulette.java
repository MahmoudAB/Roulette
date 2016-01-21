/** EuropeanRoulette Class - SubClass of Roulette Class
 * 
 * @author Mahmoud Abdel Basset
 */ 
 
public class EuropeanRoulette extends Roulette {
	
	/** Initializes the Wheel Number array with numbers 0 to 37 Preserving the numbering order of real wheel
         * 
         */ 
	EuropeanRoulette(){
		super(37);
		wheelNumbers[0] = 0;
		wheelNumbers[1] = 32;
		wheelNumbers[2] = 15;
		wheelNumbers[3] = 19;
		wheelNumbers[4] = 4;
		wheelNumbers[5] = 21;
		wheelNumbers[6] = 2;
		wheelNumbers[7] = 25;
		wheelNumbers[8] = 17;
		wheelNumbers[9] = 34;
		wheelNumbers[10] = 6;
		wheelNumbers[11] = 27;
		wheelNumbers[12] = 13;
		wheelNumbers[13] = 36;
		wheelNumbers[14] = 11;
		wheelNumbers[15] = 30;
		wheelNumbers[16] = 8;
		wheelNumbers[17] = 23;
		wheelNumbers[18] = 10;
		wheelNumbers[19] = 5;
		wheelNumbers[20] = 24;
		wheelNumbers[21] = 16;
		wheelNumbers[22] = 33;
		wheelNumbers[23] = 1;
		wheelNumbers[24] = 20;
		wheelNumbers[25] = 14;
		wheelNumbers[26] = 31;
		wheelNumbers[27] = 9;
		wheelNumbers[28] = 22;
		wheelNumbers[29] = 18;
		wheelNumbers[30] = 29;
		wheelNumbers[31] = 7;
		wheelNumbers[32] = 28;
		wheelNumbers[33] = 12;
		wheelNumbers[34] = 35;
		wheelNumbers[35] = 3;
		wheelNumbers[36] = 26;
	}
	
}
