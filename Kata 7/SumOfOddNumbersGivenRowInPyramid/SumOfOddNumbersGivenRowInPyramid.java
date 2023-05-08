/* Kata Level: 7.
 * 
 * Given the triangle of consecutive odd numbers:
 * 
 *                 1
 *              3     5
 *           7     9    11
 *       13    15    17    19 
 *    21    23    25    27    29
 *  ...
 *  
 * Calculate the sum of the numbers in the n-th row of this triangle (starting at index 1) .
 * 
 * e.g.: (Input --> Output)
 * 
 * 1 -->  1
 * 2 --> 3 + 5 = 8
 */

 public class SumOfOddNumbersGivenRowInPyramid {
	
	// Mi solución.
	public static int sumaNumerosImpares(int n) {
		int primerNumero = n * (n - 1) + 1;
		int[] numeros = new int[n];
		for (int i = 0; i < n; i++) {
			numeros[i] = primerNumero;
			primerNumero += 2;
		}
		int suma = 0;
		for (int i = 0; i < n; i++) {
			suma += numeros[i];
		}
		return suma;
	}

	// Solución de la comunidad.
	public static int sumaNumerosImpares1(int n) {
		return n * n * n;
	}

	public static void main(String[] args) {

		System.out.println(sumaNumerosImpares(1));
		System.out.println(sumaNumerosImpares(2));
		System.out.println(sumaNumerosImpares(3));
		System.out.println(sumaNumerosImpares(4));
		System.out.println(sumaNumerosImpares(5));
		System.out.println(sumaNumerosImpares(6));
	}

}
