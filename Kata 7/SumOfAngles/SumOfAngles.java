/* Kata Level: 7.
 * 
 * Find the total sum of internal angles (in degrees) in an n-sided simple polygon. N will be greater than 2.
 */

 public class SumOfAngles {

	// Solución en Java. Funciona igual en C#.
	public static int sumOfAngles(int n) {
		return 180 * (n-2);
	}

}