/* Kata Level: 7.
 * 
 * In this little assignment you are given a string of space separated numbers, 
 * and have to return the highest and lowest number.
 * 
 * Examples:
 * highAndLow("1 2 3 4 5")  // return "5 1"
 * highAndLow("1 2 -3 4 5") // return "5 -3"
 * highAndLow("1 9 3 4 -5") // return "9 -5"
 * 
 * Notes:
 * All numbers are valid Int32, no need to validate them.
 * There will always be at least one number in the input string.
 * Output string must be two numbers separated by a single space, and highest number is first.
 */

 public class HighestAndLowest {

	public static String highAndLow(String numbers) {
		String[] numeros = numbers.split(" ");
		int numeroMinimo = Integer.parseInt(numeros[0]);
		int numeroMaximo = Integer.parseInt(numeros[0]);
		for(String numero : numeros) {
			int a = Integer.parseInt(numero);
			if(a > numeroMaximo)
				numeroMaximo = a;
			if(a < numeroMinimo)
				numeroMinimo = a;
		}
		return numeroMaximo + " " + numeroMinimo;
	}

	public static void main(String[] args) {

		System.out.println(highAndLow("1 2 3 4 5"));
		System.out.println(highAndLow("1 2 -3 4 5"));
		System.out.println(highAndLow("1 9 3 4 -5"));
		
	}
	
}