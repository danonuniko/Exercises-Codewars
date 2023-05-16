/* Kata Level: 7.
 * 
 * Given an array of ones and zeroes, convert the equivalent binary value to an integer.
 * Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.
 * 
 * Examples:
 * 
 * Testing: [0, 0, 0, 1] ==> 1
 * Testing: [0, 0, 1, 0] ==> 2
 * Testing: [0, 1, 0, 1] ==> 5
 * Testing: [1, 0, 0, 1] ==> 9
 * Testing: [0, 0, 1, 0] ==> 2
 * Testing: [0, 1, 1, 0] ==> 6
 * Testing: [1, 1, 1, 1] ==> 15
 * Testing: [1, 0, 1, 1] ==> 11
 * 
 * However, the arrays can have varying lengths, not just limited to 4.
 */

import java.util.*;

public class OnesAndZeros {
	
	public static int convertBinaryArrayToInt(List<Integer> binary) {
		int resultado = 0;
		int contador = 0;
		for(int i = binary.size() - 1 ; i >= 0 ; i--) {	
			if(binary.get(i) == 1)
				resultado += Math.pow(2, contador);
			contador++;
		}
		return resultado;
    }
	
	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(0, 0, 0, 1);
		System.out.println(convertBinaryArrayToInt(lista));
		
		lista = Arrays.asList(0, 1, 1, 1);
		System.out.println(convertBinaryArrayToInt(lista));
		
	}

}
