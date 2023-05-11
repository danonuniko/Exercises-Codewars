/* Kata Level: 8.
 * 
 * Complete the square sum function so that it squares 
 * each number passed into it and then sums the results together.
 * 
 * For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
 */

 public class SumOfSquaresArray {

	public static int squareSum(int[] n) {
		int suma = 0;
		for(int numero : n) {
			suma += Math.pow(numero, 2);
		}
		return suma;
	}
	
	public static void main(String[] args) {
		
		int[] n1 = {1, 2, 2};
		System.out.println(squareSum(n1));

	}

}