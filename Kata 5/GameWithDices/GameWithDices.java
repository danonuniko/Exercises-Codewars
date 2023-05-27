/* Kata Level: 5.
 * 
 * Greed is a dice game played with five six-sided dice. Your mission, should you choose to accept it, is to score a throw according to these rules. 
 * You will always be given an array with five six-sided dice values.
 * 
 * Three 1's => 1000 points
 * Three 6's =>  600 points
 * Three 5's =>  500 points
 * Three 4's =>  400 points
 * Three 3's =>  300 points
 * Three 2's =>  200 points
 * One   1   =>  100 points
 * One   5   =>   50 point
 * 
 * A single die can only be counted once in each roll. 
 * For example, a given "5" can only count as part of a triplet (contributing to the 500 points) or as a single 50 points, but not both in the same roll.
 * 
 * Example scoring
 * 
 * Throw       Score
 * ---------   ------------------
 * 5 1 3 4 1   250:  50 (for the 5) + 2 * 100 (for the 1s)
 * 1 1 1 3 1   1100: 1000 (for three 1s) + 100 (for the other 1)
 * 2 4 4 5 4   450:  400 (for three 4s) + 50 (for the 5)
 * 
 * In some languages, it is possible to mutate the input to the function. 
 * This is something that you should never do. If you mutate the input, you will not be able to pass all the tests.
 */

 public class GameWithDices {

    // Misma lógica que la aplicada para la solución realizada en Python.
	public static int greedy(int[] dice){

		int contador1s = 0 , contador2s = 0 , contador3s = 0 , contador4s = 0 , contador5s = 0 , contador6s = 0 , resultado = 0;

		for(int number : dice) {
			if(number == 1)			contador1s++;
			else if(number == 2)	contador2s++;
			else if(number == 3)	contador3s++;
			else if(number == 4)	contador4s++;
			else if(number == 5)	contador5s++;
			else if(number == 6)	contador6s++;
		}

		if(contador1s == 6)		resultado += 2000;
		else if(contador1s >= 3) {
			resultado += 1000;
			contador1s -= 3;
		}
		if(contador1s <= 3) {
			for(int i = 0 ; i < contador1s ; i++)	resultado += 100;
		}

		if(contador2s == 6)		resultado += 400;
		else if(contador2s >= 3)	resultado += 200;

		if(contador3s == 6)		resultado += 600;
		else if(contador3s >= 3)	resultado += 300;

		if(contador4s == 6)		resultado += 800;
		else if(contador4s >= 3)	resultado += 400;

		if(contador5s == 6)		resultado += 1000;
		else if(contador5s >= 3) {
			resultado += 500;
			contador5s -= 3;
		}
		if(contador5s <= 3) {
			for(int i = 0 ; i < contador5s ; i++)	resultado += 50;
		}

		if(contador6s == 6)		resultado += 1200;
		else if(contador6s >= 3)	resultado += 600;

    	return resultado;
  	}

    // Solución de la comunidad. Me gusta la optimización respecto a mi código.
    public static int greedyCommunity(int[] dice) {
        int n[] = new int[7];
        for (int d : dice) n[d]++;
        return n[1]/3*1000 + n[1]%3*100 + n[2]/3*200 + n[3]/3*300 + n[4]/3*400 + n[5]/3*500 + n[5]%3*50 + n[6]/3*600;
    }

}