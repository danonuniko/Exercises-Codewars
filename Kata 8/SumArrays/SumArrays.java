/* Kata Level: 8.
 * 
 * DESCRIPTION:
 * Write a function that takes an array of numbers and returns the sum of the numbers. 
 * The numbers can be negative or non-integer. If the array does not contain any numbers then you should return 0.
 * 
 * Examples:
 * 
 * Input: [1, 5.2, 4, 0, -1]	Output: 9.2
 * 
 * Input: []	Output: 0
 * 
 * Input: [-2.398]	Output: -2.398
 * 
 * Assumptions:
 * You can assume that you are only given numbers.
 * You cannot assume the size of the array.
 * You can assume that you do get an array and if the array is empty, return 0.
 * Tests expect accuracy of 1e-4.
 * 
 * What We're Testing:
 * We're testing basic loops and math operations. This is for beginners who are just learning loops and math operations.
 * Advanced users may find this extremely easy and can easily write this in one line.
 */

 public class SumArrays {
	
	// Mi solución.
	public static double sum(double[] numbers) {
		double suma = 0.0;
		for (double number : numbers)
			suma += number;
		return suma;
	}

	// Solución de la comunidad.
	public static double sum1(double[] numbers) {
		return java.util.Arrays.stream(numbers).sum();
	}

	public static void main(String[] args) {

		double[] numbers = {};
		System.out.println(sum(numbers));

		double[] numbers1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(sum(numbers1));

	}

}