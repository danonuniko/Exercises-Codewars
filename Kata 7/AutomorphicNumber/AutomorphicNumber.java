/* Kata Level: 7.
 * 
 * Definition:
 * A number is called Automorphic number if and only if its square ends in the same digits as the number itself.
 * 
 * Task:
 * Given a number determine if it Automorphic or not.
 * 
 * Notes:
 * The number passed to the function is positive.
 * 
 * Input >> Output Examples:
 * 
 * autoMorphic (25) -->> return "Automorphic" 
 * Explanation: 25 squared is 625, ends with the same number's digits which are 25.
 * 
 * autoMorphic (13) -->> return "Not!!"
 * Explanation: 13 squared is 169, not ending with the same number's digits which are 69.
 * 
 * autoMorphic (76) -->> return "Automorphic"
 * Explanation: 76 squared is 5776, ends with the same number's digits which are 76.
 * 
 * autoMorphic (225) -->> return "Not!!"
 * Explanation: 225 squared is 50625, not ending with the same number's digits which are 225.
 * 
 * autoMorphic (625) -->> return "Automorphic"
 * Explanation: 625 squared is 390625, ends with the same number's digits which are 625.
 * 
 * autoMorphic (1) -->> return "Automorphic"
 * Explanation: 1 squared is 1, ends with the same number's digits which are 1.
 * 
 * autoMorphic (6) -->> return "Automorphic"
 * Explanation: 6 squared is 36, ends with the same number's digits which are 6.
 */

 public class AutomorphicNumber {
	
	// Mi solución.
	public static String autoMorphic(int number) {
		String numeroParametroTexto = Integer.toString(number);
		String numeroCuadradoTexto = Integer.toString(number * number);
		return (numeroCuadradoTexto.endsWith(numeroParametroTexto)) ? "Automorphic" : "Not!!";
	}

	// Solución de la comunidad.
	public static String autoMorphic1(int n) {
		return (n * n + "").endsWith("" + n) ? "Automorphic" : "Not!!";
	}

	public static void main(String[] args) {

		System.out.println(autoMorphic(25));		// Automorphic
		System.out.println(autoMorphic(13));		// Not!!
		System.out.println(autoMorphic(76));		// Automorphic
		System.out.println(autoMorphic(225));		// Not!!
		System.out.println(autoMorphic(625));		// Automorphic
		System.out.println(autoMorphic(1));			// Automorphic
		System.out.println(autoMorphic(6));			// Automorphic

	}

}