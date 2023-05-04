/* Kata Level: 8.
 * 
 * Clock shows h hours, m minutes and s seconds after midnight.
 * Your task is to write a function which returns the time since midnight in milliseconds.
 * 
 * Example:
 * h = 0
 * m = 1
 * s = 1
 * result = 61000
 * 
 * Input constraints:
 * 0 <= h <= 23
 * 0 <= m <= 59
 * 0 <= s <= 59
 */

 public class TimeInMiliseconds {
	
	public static int conversorMilisegundos(int h, int m, int s) {

		if (h >= 0 && h <= 23 && m >= 0 && m <= 59 && s >= 0 && s <= 59) {
			return h * 60 * 60 * 1000 + m * 60 * 1000 + s * 1000;
		}
		return -1;
	}

	public static void main(String[] args) {

		System.out.println(conversorMilisegundos(0, 1, 1));
        System.out.println(conversorMilisegundos(-4, 1, 1));

	}

}