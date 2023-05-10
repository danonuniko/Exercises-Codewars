/* Kata Level: 7.
 * 
 * Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
 * 
 * Examples:
 * 
 * solution('abc', 'bc') // returns true
 * solution('abc', 'd') // returns false
 */

 public class StringEndsWith {

	// Mi solución.
	public static boolean solution(String str, String ending) {
		return str.endsWith(ending) ? true : false;
	}

	// Solución de la comunidad.
	public static boolean solution1(String str, String ending) {
		return str.endsWith(ending);
	}

	public static void main(String[] args) {

		System.out.println(solution("abc", "bc"));
		System.out.println(solution("abc", "d"));
		
	}

}