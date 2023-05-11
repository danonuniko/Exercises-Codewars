/* Kata Level: 8.
 * 
 * You get an array of numbers, return the sum of all of the positives ones.
 * 
 * Example [1,-4,7,12] => 1 + 7 + 12 = 20
 * 
 * Note: if there is nothing to sum, the sum is default to 0.
 */

 public class SumOfPositiveNumbersArray {
	
	public static int sum(int[] arr) {
		int suma = 0;
		if (arr.length == 0)
			return 0;
		for (int number : arr) {
			if (number > 0)
				suma += number;
		}
		return suma;
	}

	public static int sum1(int[] arr) {
		if (arr.length == 0)
			return 0;
		int sum = 0;
		for (int num : arr)
			sum = (num > 0 ? sum + num : sum);
		return sum;
	}

	public static void main(String[] args) {

		int[] numeros = { 1, 2, 3, 4, 5 };
		System.out.println(sum(numeros));

		int[] numeros2 = { -2, -4, 2, 5 };
		System.out.println(sum(numeros2));

	}

}
