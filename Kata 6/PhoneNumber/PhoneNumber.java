/* Kata Level: 6.
 * 
 * Write a function that accepts an array of 10 integers (between 0 and 9),
 * that returns a string of those numbers in the form of a phone number.
 * 
 * Example:
 * Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
 * The returned format must be correct in order to complete this challenge.
 * 
 * Don't forget the space after the closing parentheses!
 */

 public class PhoneNumber {

	// Mi solución.
	public static String createPhoneNumber(int[] numbers) {
		if (numbers.length != 10)
			return "Error. Array de tamaño no válido.";
		String texto = "(";
		for (int i = 0; i < 3; i++) 
			texto += numbers[i];
		texto += ") ";
		for (int i = 3; i < 6; i++) 
			texto += numbers[i];
		texto += "-";
		for (int i = 6; i < 10; i++)
			texto += numbers[i];
		return texto;
	}

	// Solución de la comunidad 1.
	public static String createPhoneNumber1(int[] numbers) {
		return String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4],
				numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
	}

	// Solución de la comunidad 2.
	public static String createPhoneNumber2(int[] numbers) {
		String phoneNumber = new String("(xxx) xxx-xxxx");

		for (int i : numbers) {
			phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
		}

		return phoneNumber;
	}

	public static void main(String[] args) {

		int[] numeros1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		System.out.println(createPhoneNumber(numeros1));

		int[] numeros2 = { 1, 2, 3, 4, 5 };
		System.out.println(createPhoneNumber(numeros2));

		int[] numeros3 = { 6, 9, 9, 5, 5, 1, 1, 1, 7, 0 };
		System.out.println(createPhoneNumber(numeros3));
		
	}

}
