/* Kata Level: 8.
 * 
 * This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.
 */

public class SimpleMultiplication {
	
	// Mi solución.
	public static int simpleMultiplication(int n) {
		if (n % 2 == 0)
			return n * 8;
		return n * 9;
	}
	
	// Solución de la comunidad.
	public static int simpleMultiplication1(int n) {
        return n % 2 == 0 ? n * 8 : n * 9;
    }

	public static void main(String[] args) {

		System.out.println(simpleMultiplication(8));
		System.out.println(simpleMultiplication(5));

	}

}
