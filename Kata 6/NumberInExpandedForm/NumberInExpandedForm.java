/* Kata Level: 6.
 * 
 * Write Number in Expanded Form
 * You will be given a number and you will need to return it as a string in Expanded Form. 
 * 
 * For example:
 * 
 * Kata.expandedForm(12); # Should return "10 + 2"
 * Kata.expandedForm(42); # Should return "40 + 2"
 * Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
 * 
 * NOTE: All numbers will be whole numbers greater than 0.
 */

 public class NumberInExpandedForm {

	// Solución de la comunidad 1. Solución muy optimizada. No creo que hubiera conseguido sacar esa lógica por mi propia cuenta.
	public static String expandedForm(int num) {

		String outs = "";
		for (int i = 10 ; i < num ; i *= 10) {
			int rem = num % i;
			outs = (rem > 0) ? " + " + rem + outs : outs;
			num -= rem;
		}
		outs = num + outs;

		return outs;
	}

	public static void main(String[] args) {

		System.out.println(expandedForm(1231));
		System.out.println(expandedForm(2501));

	}

}