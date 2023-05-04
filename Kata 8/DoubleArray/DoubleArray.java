/* Kata Level: 8.
 * 
 * Given an array of integers, return a new array with each value doubled.
 * 
 * For example:     [1, 2, 3] --> [2, 4, 6]
 */

 public class DoubleArray {
	
	public static int[] map(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] *= 2;
		}
		return arr;
	}

	public static void main(String[] args) {

		int[] numeros = { 2, 4, 6 };
		numeros = map(numeros);
		for (int numero : numeros) {
			System.out.println(numero);
		}

	}

}