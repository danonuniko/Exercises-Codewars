/* Kata Level: 6.
 * 
 * Given an array of integers, find the one that appears an odd number of times.
 * There will always be only one integer that appears an odd number of times.
 * 
 * Examples:
 * 
 * [7] should return 7, because it occurs 1 time (which is odd).
 * [0] should return 0, because it occurs 1 time (which is odd).
 * [1,1,2] should return 2, because it occurs 1 time (which is odd).
 * [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
 * [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
 */

import java.util.*;

public class FindTheOddRepetitionNumberInArray {
	
	public static int findIt(int[] a) {
		Map<Integer, Integer> mapa = new HashMap<>();
		for(int numero : a) {
			if(mapa.containsKey(numero))
				mapa.put(numero, mapa.get(numero) + 1);
			else
				mapa.put(numero, 1);
		}
		for(int numero : a) {
			if(mapa.get(numero) % 2 == 1)
				return numero;
		}
		return 0;
	  }
	
	public static void main(String[] args) {
		
		int[] numeros = {7};
		System.out.println(findIt(numeros));

		int[] numeros1 = {0};
		System.out.println(findIt(numeros1));

		int[] numeros2 = {1, 1, 2};
		System.out.println(findIt(numeros2));
		
		int[] numeros3 = {1,2,2,3,3,3,4,3,3,3,2,2,1};
		System.out.println(findIt(numeros3));
		
	}
}