/* Kata Level: 8.
 * 
 * Summation: 
 * Write a program that finds the summation of every number from 1 to num. 
 * The number will always be a positive integer greater than 0.
 * 
 * For example:
 * 
 * summation(2) -> 3
 * 1 + 2
 * 
 * summation(8) -> 36
 * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8
 */

 public class Sumatorio {
	
	// Mi solución.
	public static int summation(int n) {
		int sumatorio = 0;
		for (int i = 1; i <= n; i++) {
			sumatorio += i;
		}
		return sumatorio;
	}

	// Solución de la comunidad utilizando recursividad.
	public static int summation1(int n) {
		return n == 1 ? 1 : n + summation(n - 1);
	}

	public static void main(String[] args) {

		System.out.println(summation(2));
		System.out.println(summation(8));

	}

}

