/* Kata Level: 7.
 *
 * Definition:
 * A number is a Special Number if it’s digits only consist 0, 1, 2, 3, 4 or 5.
 * 
 * Given a number determine if it special number or not.
 * 
 * Notes:
 * The number passed will be positive (N > 0) .
 * All single-digit numbers within the interval [1:5] are considered as special number.
 * 
 * Input >> Output Examples:
 * 
 * specialNumber(2) ==> return "Special!!"
 * Explanation: It's a single-digit number within the interval [1:5].
 * 
 * specialNumber(9) ==> return "NOT!!"
 * Explanation: Although, it's a single-digit number but Outside the interval [1:5] .
 * 
 * specialNumber(23) ==> return "Special!!"
 * Explanation: All the number's digits formed from the interval [0:5] digits .
 * 
 * specialNumber(39) ==> return "NOT!!"
 * Explanation: Although, there is a digit (3) Within the interval But the second digit is not (Must be ALL The Number's Digits).
 * 
 * specialNumber(59) ==> return "NOT!!"
 * Explanation: Although, there is a digit (5) Within the interval But the second digit is not (Must be ALL The Number's Digits) .
 * 
 * specialNumber(513) ==> return "Special!!"
 * specialNumber(709) ==> return "NOT!!"
 */

 public class SpecialNumber {

	// Mi solución.
	public static String specialNumber(int number) {
		String numerosAceptados = "012345";
		String numeroTexto = Integer.toString(number);
		for (int i = 0; i < numeroTexto.length(); i++) {
			if (!numerosAceptados.contains(Character.toString(numeroTexto.charAt(i))))
				return "NOT!!";
		}
		return "Special!!";
	}

	// Solución de la comunidad 1.
	public static String specialNumber1(int n) {
		return ("" + n).matches("[0-5]+") ? "Special!!" : "NOT!!";
	}

	// Solución de la comunidad 2.
	public static String specialNumber2(int number) {
        while (number != 0) {
            if (number % 10 > 5)
                return "NOT!!";
            number /= 10;
        }
        return "Special!!";
    }
	
	public static void main(String[] args) {
		
		System.out.println(specialNumber(2));
		System.out.println(specialNumber(9));
		System.out.println(specialNumber(15));
		System.out.println(specialNumber(513));
		System.out.println(specialNumber(279));
		
	}

}