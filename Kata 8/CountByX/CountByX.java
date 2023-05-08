/* Kata Level: 8.
 * 
 * Create a function with two arguments that will return an array of the first n multiples of x.
 * Assume both the given number and the number of times to count will be positive numbers greater than 0.
 * Return the results as an array or list (depending on language).
 * 
 * Examples:
 * 
 * countBy(1,10)    should return  {1,2,3,4,5,6,7,8,9,10}
 * countBy(2,5)     should return {2,4,6,8,10}
 */

public class CountByX {

	// Mi solución.
	public static int[] countBy(int x, int n) {
		int suma = x;
		int[] numeros = new int[n];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = suma;
			suma += x;
		}
		return numeros;
	}

	// Solución de la comunidad.
	public static int[] countBy1(int x, int n) {
		int[] numeros = new int[n];
		for (int i = 0; i < n; i++)
			numeros[i] = x * (i + 1);
		return numeros;
	}

	public static void main(String[] args) {

		int[] numeros = countBy(1, 10);
		for (int numero : numeros) {
			System.out.print(numero + " ");
		}

		System.out.println("");

		numeros = countBy(2, 5);
		for (int numero : numeros) {
			System.out.print(numero + " ");
		}

		System.out.println("");

		numeros = countBy(4, 15);
		for (int numero : numeros) {
			System.out.print(numero + " ");
		}
		
	}

}
