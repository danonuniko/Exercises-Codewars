/* Kata Level: 7.
 * 
 * You are given an odd-length array of integers, in which all of them are the same, except for one single number.
 * Complete the method which accepts such an array, and returns that single different number.
 * 
 * The input array will always be valid! (odd-length >= 3)
 * 
 * Examples:
 * [1, 1, 2] ==> 2
 * [17, 17, 3, 17, 17, 17, 17] ==> 3
 */

import java.util.*;

public class FindLonelyNumber {

	// Mi solución.
	public static int stray(int[] numbers) {
		if (numbers.length % 2 == 0)
			return -1;
		Map<Integer, Integer> mapa = new HashMap<>();
		for (int number : numbers) {
			if (mapa.containsKey(number))
				mapa.put(number, mapa.get(number) + 1);
			else
				mapa.put(number, 1);
		}
		for (int number : numbers) {
			if (mapa.get(number) == 1)
				return number;
		}
		return 0;
	}

	// Solución de la comunidad 1.
	public static int stray1(int[] numbers) {
		if (numbers[0] != numbers[1] && numbers[0] != numbers[2])
			return numbers[0];
		for (int i : numbers)
			if (i != numbers[0])
				return i;
		return 0;
	}

	// Solución de la comunidad 2.
	public static int stray2(int[] numbers) {
		Arrays.sort(numbers);
		return numbers[0] == numbers[1] ? numbers[numbers.length - 1] : numbers[0];
	}

}