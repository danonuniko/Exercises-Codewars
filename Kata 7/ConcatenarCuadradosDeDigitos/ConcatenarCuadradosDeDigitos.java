/* Kata Level: 7.
 * 
 * Square every digit of a number and concatenate them.
 * For example, if we run 9119 through the function, 811181 will come out, because 9^2 is 81 and 1^2 is 1.
 * 
 * Note: The function accepts an integer and returns an integer
 */

 public class ConcatenarCuadradosDeDigitos {

	public static int squareDigits(int n) {
		String resultado = "";
		String numeroString = Integer.toString(n);
		for(int i = 0 ; i < numeroString.length() ; i++) {
			resultado += Character.getNumericValue(numeroString.charAt(i))*Character.getNumericValue(numeroString.charAt(i));
		}
		return Integer.parseInt(resultado);
	}
	
	public static void main(String[] args) {
		
		System.out.println(squareDigits(9119));
		System.out.println(squareDigits(91));
		System.out.println(squareDigits(12345));
	
	}

}
