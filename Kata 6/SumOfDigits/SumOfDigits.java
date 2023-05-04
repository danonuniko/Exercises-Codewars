/* Kata Level: 6.
 * 
 * Digital root is the recursive sum of all the digits in a number.
 * Given n, take the sum of the digits of n. If that value has more than one digit, 
 * continue reducing in this way until a single-digit number is produced. 
 * The input will be a non-negative integer.
 * 
 * Examples:
 * 16  -->  1 + 6 = 7
 * 942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
 * 132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
 * 493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
 */

 public class SumOfDigits {

	public static int sumaDeDigitos(int number) {
		
		String numeroString = Integer.toString(number);
		int suma = 0;
		for(int i = 0 ; i < numeroString.length() ; i++) {
			suma += Integer.parseInt(Character.toString(numeroString.charAt(i)));			
		}

		while(suma >= 10) {
			numeroString = Integer.toString(suma);
			suma = 0;
			for(int i = 0 ; i < numeroString.length() ; i++) {
				suma += Integer.parseInt(Character.toString(numeroString.charAt(i)));			
			}
		}
		return suma;
	}
	
	public static void main(String[] args) {
		
		System.out.println(sumaDeDigitos(6));
		System.out.println(sumaDeDigitos(16));
		System.out.println(sumaDeDigitos(942));
		System.out.println(sumaDeDigitos(132189));
		System.out.println(sumaDeDigitos(493193));

	}

}
