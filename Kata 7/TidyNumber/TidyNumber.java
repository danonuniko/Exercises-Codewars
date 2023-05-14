/* Kata Level: 7.
 * 
 * Definition: A Tidy number is a number whose digits are in non-decreasing order.
 * 
 * Task: Given a number, Find if it is Tidy or not.
 * 
 * Notes:
 * Number passed is always Positive.
 * Return the result as a Boolean.
 * 
 * Input >> Output Examples:
 * 
 * tidyNumber (12) ==> return (true)
 * Explanation: The number's digits {1, 2} are in non-Decreasing Order (i.e) 1 <= 2.
 * 
 * tidyNumber (32) ==> return (false)
 * Explanation: The Number's Digits {3, 2} are not in non-Decreasing Order (i.e) 3 > 2.
 * 
 * tidyNumber (1024) ==> return (false)
 * Explanation: The Number's Digits {1, 0, 2, 4} are not in non-Decreasing Order as 0 <= 1.
 * 
 * tidyNumber (13579) ==> return (true)
 * Explanation: The number's digits {1, 3, 5, 7, 9} are in non-Decreasing Order.
 * 
 * tidyNumber (2335) ==> return (true)
 * Explanation: The number's digits {2, 3, 3, 5} are in non-Decreasing Order , Note 3 <= 3.
 */

 public class TidyNumber {
	
	// Mi solución.
	public static boolean tidyNumber(int number) {
		String numeroTexto = Integer.toString(number);
		for (int i = 0; i < numeroTexto.length() - 1; i++) {
			if (Character.getNumericValue(numeroTexto.charAt(i)) > Character.getNumericValue(numeroTexto.charAt(i + 1)))
				return false;
		}
		return true;
	}

	// Solución de la comunidad.
	public static boolean tidyNumber1(int n) {
		final String[] digits = Integer.toString(n).split("");
		java.util.Arrays.sort(digits);
		return String.join("", digits).equals("" + n);
	}

	public static void main(String[] args) {
		
		System.out.println(tidyNumber(12));
		System.out.println(tidyNumber(32));
		System.out.println(tidyNumber(111345));
		System.out.println(tidyNumber(334321));
		
	}

}