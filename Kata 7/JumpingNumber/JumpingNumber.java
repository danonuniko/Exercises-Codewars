/* Kata Level: 7.
 * 
 * Definition:
 * Jumping number is the number that All adjacent digits in it differ by 1.
 * 
 * Task: Given a number, Find if it is Jumping or not.
 * 
 * Notes:
 * Number passed is always Positive.
 * Return the result as String.
 * The difference between ‘9’ and ‘0’ is not considered as 1.
 * All single digit numbers are considered as Jumping numbers.
 * 
 * Input >> Output Examples:
 * 
 * jumpingNumber(9) ==> return "Jumping!!"
 * Explanation: It's single-digit number.
 * 
 * jumpingNumber(79) ==> return "Not!!"
 * Explanation: Adjacent digits don't differ by 1.
 * 
 * jumpingNumber(23) ==> return "Jumping!!"
 * Explanation: Adjacent digits differ by 1.
 * 
 * jumpingNumber(556847) ==> return "Not!!"
 * Explanation: Adjacent digits don't differ by 1.
 * 
 * jumpingNumber(4343456) ==> return "Jumping!!"
 * Explanation: Adjacent digits differ by 1.
 * 
 * jumpingNumber(89098) ==> return "Not!!"
 * Explanation: Adjacent digits don't differ by 1.
 * 
 * jumpingNumber(32) ==> return "Jumping!!"
 * Explanation: Adjacent digits differ by 1.
 */

 public class JumpingNumber {

	// Mi solución.
	public static String jumpingNumber(int number) {
		String numeroTexto = Integer.toString(number);
		if(number < 0)
			return "Not!!";
		if(number < 10)
			return "Jumping!!";
		else if(number >= 10 && number < 100) {
			if(Character.getNumericValue(numeroTexto.charAt(0)) != Character.getNumericValue(numeroTexto.charAt(1)) + 1 
					&& Character.getNumericValue(numeroTexto.charAt(0)) != Character.getNumericValue(numeroTexto.charAt(1)) - 1)
				return "Not!!";
			return "Jumping!!";
		}
		for (int i = 1; i < numeroTexto.length() - 1; i++) {
			if (Character.getNumericValue(numeroTexto.charAt(i)) != Character.getNumericValue(numeroTexto.charAt(i + 1)) + 1
					&& Character.getNumericValue(numeroTexto.charAt(i)) != Character.getNumericValue(numeroTexto.charAt(i + 1)) - 1
					|| Character.getNumericValue(numeroTexto.charAt(i)) != Character.getNumericValue(numeroTexto.charAt(i - 1)) + 1
					&& Character.getNumericValue(numeroTexto.charAt(i)) != Character.getNumericValue(numeroTexto.charAt(i - 1)) - 1)
				return "Not!!";
		}
		return "Jumping!!";
	}

	// Solución de la comunidad.
	public static String jumpingNumber1(int n) {
		final String s = ""+n;
		for (int i=1; i<s.length(); i++) if (Math.abs(s.charAt(i)-s.charAt(i-1)) != 1) return "Not!!";
		return "Jumping!!";
    }
	
	public static void main(String[] args) {

		System.out.println(jumpingNumber(-11));			        // Not!!
		System.out.println(jumpingNumber(2));			// Jumping!!
		System.out.println(jumpingNumber(9));			// Jumping!!
		System.out.println("");
		System.out.println(jumpingNumber(79));			// Not!!
		System.out.println(jumpingNumber(23));			// Jumping!!
		System.out.println(jumpingNumber(90));			// Not!!
		System.out.println("");
		System.out.println(jumpingNumber(1123));		    // Not!!
		System.out.println(jumpingNumber(556847));		// Not!!
		System.out.println(jumpingNumber(4343456));		// Jumping!!
		System.out.println(jumpingNumber(89098));		// Not!!
		System.out.println(jumpingNumber(123210));		// Jumping!!
		System.out.println(jumpingNumber(98789876));	    // Jumping!!
		System.out.println(jumpingNumber(87876556));	    // Not!!
		
	}

}