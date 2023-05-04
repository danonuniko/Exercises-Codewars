/* Kata Level: 7.
 * 
 * ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
 * If the function is passed a valid PIN string, return true, else return false.
 * 
 * Examples (Input --> Output)
 * 
 * "1234"   -->  true
 * "12345"  -->  false
 * "a234"   -->  false
 */

 public class ValidatePinCode {
	
	// Mi solución.
	public static boolean validatePin(String pin) {
		if (pin.length() != 4 && pin.length() != 6) {
			return false;
		}
		char[] numeros = pin.toCharArray();
		for (char numero : numeros) {
			if (!Character.isDigit(numero)) {
				return false;
			}
		}
		return true;
	}

	// Solución de la comunidad #1.
	public static boolean validatePin1(String pin) {
		return pin.matches("\\d{4}|\\d{6}");
	}

	// Solución de la comunidad #2.
	public static boolean validatePin2(String pin) {
		return pin.matches("[0-9]{4}|[0-9]{6}");
	}

	public static void main(String[] args) {

		System.out.println(validatePin("1234"));
		System.out.println(validatePin("12345"));
		System.out.println(validatePin("a234"));

	}

}