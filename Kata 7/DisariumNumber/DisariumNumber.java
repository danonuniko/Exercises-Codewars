/* Kata Level: 7.
 * 
 * Definition:
 * Disarium number is the number that the sum of its digits powered with their respective positions is equal to the number itself.
 * 
 * Task:
 * Given a number, Find if it is Disarium or not.
 * 
 * Notes:
 * Number passed is always Positive.
 * Return the result as String.
 * 
 * Input >> Output Examples:
 * 
 * disariumNumber(89) ==> return "Disarium !!"
 * Explanation: Since , 8^1 + 9^2 = 89 , thus output is "Disarium !!"
 * 
 * disariumNumber(564) ==> return "Not !!"
 * Explanation: Since , 5^1 + 6^2 + 4^3 = 105 != 564 , thus output is "Not !!"
 */

 public class DisariumNumber {

	public static String disariumNumber(int number) {
		String numeroTexto = Integer.toString(number);
		int resultado = 0;
		for(int i = 0 ; i < numeroTexto.length() ; i++)
			 resultado += (int) Math.pow(Character.getNumericValue(numeroTexto.charAt(i)), i+1);
		return (resultado == number) ? "Disarium !!" : "Not !!";
	}

	public static void main(String[] args) {

		System.out.println(disariumNumber(89));
		System.out.println(disariumNumber(564));
		
	}

}