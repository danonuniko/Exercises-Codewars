/* Kata Level: 8.
 * 
 * Complete the solution so that it reverses the string passed into it.
 * 
 * 'world'  =>  'dlrow'
 * 'word'   =>  'drow'
 */

 public class ReversedString {

	public static String solution(String str) {
		String solucion = "";
		for(int i = str.length()-1 ; i >= 0 ; i--)
			solucion += str.charAt(i);
		return solucion;
	}

	public static void main(String[] args) {
		
		System.out.println(solution("world"));
		System.out.println(solution("word"));
		
	}

}