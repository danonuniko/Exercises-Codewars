/* Kata Level: 7.
 * 
 * A number m of the form 10x + y is divisible by 7 if and only if x − 2y is divisible by 7.
 * In other words, subtract twice the last digit from the number formed by the remaining digits. 
 * Continue to do this until a number known to be divisible by 7 is obtained; 
 * you can stop when this number has at most 2 digits because you are supposed to know if a number of at most 2 digits is divisible by 7 or not.
 * The original number is divisible by 7 if and only if the last number obtained using this procedure is divisible by 7.
 * 
 * Examples:
 * 
 * 1) m = 371 -> 37 − (2×1) -> 37 − 2 = 35 ; thus, since 35 is divisible by 7, 371 is divisible by 7.
 * The number of steps to get the result is 1.
 * 2) m = 1603 -> 160 - (2 x 3) -> 154 -> 15 - 8 = 7 and 7 is divisible by 7.
 * 3) m = 372 -> 37 − (2×2) -> 37 − 4 = 33 ; thus, since 33 is not divisible by 7, 372 is not divisible by 7.
 * 4) m = 477557101->47755708->4775554->477547->47740->4774->469->28 and 28 is divisible by 7, so is 477557101. 
 * The number of steps is 7.
 * 
 * Task:
 * Your task is to return to the function seven(m) (m integer >= 0) an array (or a pair, depending on the language) of numbers,
 * the first being the last number m with at most 2 digits obtained by your function (this last m will be divisible or not by 7), 
 * the second one being the number of steps to get the result.
 * 
 * Forth Note:
 * Return on the stack number-of-steps, last-number-m-with-at-most-2-digits 
 * 
 * Examples:
 * seven(371) should return [35, 1]
 * seven(1603) should return [7, 2]
 * seven(477557101) should return [28, 7]
 */

 public class DivisiblePor7 {
	
	// Mi solución, pasando el número a String y jugando con él.
	public static long[] seven(long m) {
		if (m == 0)
			return new long[] {0, 0};

		long numeroVueltas = 0;
		String numeroCompletoTexto = Long.toString(m);
		String numeroTextoMenos1 = numeroCompletoTexto.substring(0, numeroCompletoTexto.length() - 1);
		String numeroTextoUnidad = numeroCompletoTexto.substring(numeroCompletoTexto.length() - 1);
		long numeroUnidad = Long.parseLong(numeroTextoUnidad);
		long numeroMenos1 = Long.parseLong(numeroTextoMenos1);
		long resultado = numeroMenos1 - 2 * numeroUnidad;
		numeroVueltas++;
		while (resultado >= 100) {
			numeroCompletoTexto = Long.toString(resultado);
			numeroTextoMenos1 = numeroCompletoTexto.substring(0, numeroCompletoTexto.length() - 1);
			numeroTextoUnidad = numeroCompletoTexto.substring(numeroCompletoTexto.length() - 1);
			numeroUnidad = Long.parseLong(numeroTextoUnidad);
			numeroMenos1 = Long.parseLong(numeroTextoMenos1);
			resultado = numeroMenos1 - 2 * numeroUnidad;
			numeroVueltas++;
		}
		return new long[] { resultado, numeroVueltas };
	}

	// Solución de la comunidad, sin utilizar Strings.
	public static long[] seven1(long m) {
		int n = 0;
		while (m > 99) {
			m = (m / 10) - (m % 10) * 2;
			n++;
		}
		return new long[] {m, n};
	}

	public static void main(String[] args) {

		long a = 371;
		long[] b = seven(a);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println("");

		a = 1603;
		b = seven(a);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println("");

		a = 477557101;
		b = seven(a);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println("");

		a = 483;
		b = seven(a);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");	
		}
		
	}

}
