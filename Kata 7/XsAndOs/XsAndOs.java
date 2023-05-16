/* Kata Level: 7.
 * 
 * DESCRIPTION:
 * Check to see if a string has the same amount of 'x's and 'o's. 
 * The method must return a boolean and be case insensitive. The string can contain any char.
 * 
 * Examples input/output:
 * 
 * XO("ooxx") => true
 * XO("xooxx") => false
 * XO("ooxXm") => true
 * XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
 * XO("zzoo") => false
 */

 public class XsAndOs {

	public static boolean getXO(String str) {
		int contadorXs = 0;
		int contadorOs = 0;
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i) == 'x' || str.charAt(i) == 'X')
				contadorXs++;
			if(str.charAt(i) == 'o' || str.charAt(i) == 'O')
				contadorOs++;
		}
		return contadorXs == contadorOs;
	}
	
	public static boolean getXOCommunity(String str) {
	    str = str.toLowerCase();
	    return str.replace("o","").length() == str.replace("x","").length();
	    
	  }

	public static void main(String[] args) {
	
		System.out.println(getXO("ooxx"));		// true
		System.out.println(getXO("xooxx"));		// false
		System.out.println(getXO("ooxXm"));		// true
		System.out.println(getXO("zpzpzpp"));	// true
		System.out.println(getXO("zzoo"));		// false

	}

}