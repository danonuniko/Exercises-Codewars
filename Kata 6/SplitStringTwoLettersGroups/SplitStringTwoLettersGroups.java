/* Kata Level: 6.
 * 
 * Complete the solution so that it splits the string into pairs of two characters. 
 * If the string contains an odd number of characters then it should replace 
 * the missing second character of the final pair with an underscore ('_').
 * Examples:

 * 'abc' =>  ['ab', 'c_']
 * 'abcdef' => ['ab', 'cd', 'ef']
 */

 public class SplitStringTwoLettersGroups {
	
	// Mi solucion.
	public static String[] solution (String s) {
		
		if(s.length()%2 == 0) {
			String[] solucion = new String[s.length()/2];
			
			for(int i = 0 ; i < solucion.length ; i++) {
				solucion[i] = "" + s.charAt(0) + s.charAt(1);
				s = s.substring(2);
			}
			return solucion;
		}
		else {
			String[] solucion = new String[s.length()/2 +1];
			s = s.concat("_");
			
			for(int i = 0 ; i < solucion.length ; i++) {
				solucion[i] = "" + s.charAt(0) + s.charAt(1);
				s = s.substring(2);
			}
			return solucion;
		}
	}
	
	// Solucion de la comunidad.
	public static String[] solution1(String s) {
        if(s.length() % 2 == 1) s+="_";
        int n = s.length()/2;
      
      String[] sub = new String[n];
      for(int i = 0 ; i < n ; ++i)	sub[i]=""+s.charAt(i*2)+s.charAt(1+i*2);
      
      return sub;
    }

	public static void main(String[] args) {
		
		String[] a = solution("LovePizza");
		for(String b : a)	System.out.print(b + " ");
		
		a = solution("abc");
		for(String b : a)	System.out.print(b + " ");
	}

}