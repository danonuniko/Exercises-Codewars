/* Kata Level: 8.
 * 
 * Convert number to reversed array of digits.
 * Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
 * 
 * Example(Input => Output):
 * 35231 => [1,3,2,5,3]
 * 0 => [0]
 */

 public class ConvertNumberToReversedArrayOfDigits {

	public static int[] digitize(long n) {
		String m = Long.toString(n);
		int[] arrayInvertido = new int[m.length()];
		for(int i = 0 ; i < m.length() ; i++)
			arrayInvertido[i] = Character.getNumericValue(m.charAt(m.length() -1 -i));
		return arrayInvertido;
	}

	public static void main(String[] args) {
	
		int[] numeros = digitize(35231);
		for(int numero : numeros)
			System.out.print(numero + " ");
		
	}

}