/* Kata Level: 6.
 * 
 * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, 
 * which is the number of times you must multiply the digits in num until you reach a single digit.
 * 
 * For example (Input --> Output):
 * 
 * 39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
 * 999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
 * 4 --> 0 (because 4 is already a one-digit number)
 */

 public class ConvertBigNumberIntoDigit {

	public static int persistence(long n) {
		int numeroMultiplicaciones = 0;
		while(n >= 10) {
			String numeroString = Long.toString(n);
			n = 1;
			for(int i = 0 ; i < numeroString.length() ; i++) {
				
				n *= Character.getNumericValue(numeroString.charAt(i));
			}
			numeroMultiplicaciones++;
		}
		return numeroMultiplicaciones;
	}
	
	public static void main(String[] args) {
	
		System.out.println(persistence(39));
		System.out.println(persistence(999));
		System.out.println(persistence(4));
		System.out.println(persistence(25));

	}

}