/* Kata Level: 7.
 * 
 * Your task is to make a function that can take any non-negative integer as an argument and return it 
 * with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
 * 
 * Examples:
 * 
 * Input: 42145 Output: 54421
 * Input: 145263 Output: 654321
 * Input: 123456789 Output: 987654321
 */

 public class DescendingOrder {

	public static int sortDesc(final int num) {
		char[] numeros = Integer.toString(num).toCharArray();
		java.util.Arrays.sort(numeros);
		String resultado = "";
		for(int i = numeros.length -1 ; i >= 0 ; i--) {
			resultado += "" + numeros[i];
		}
		return Integer.parseInt(resultado);
	}

	public static void main(String[] args) {
		
		System.out.println(sortDesc(12345));
		System.out.println(sortDesc(22343));
		System.out.println(sortDesc(1234231));
		System.out.println(sortDesc(12432));

	}

}
