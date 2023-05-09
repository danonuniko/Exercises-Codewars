/* Kata Level: 6.
 * 
 * The goal of this exercise is to convert a string to a new string where each character 
 * in the new string is "(" if that character appears only once in the original string, or ")" 
 * if that character appears more than once in the original string. 
 * Ignore capitalization when determining if a character is a duplicate.
 * 
 * Examples:
 * "din"      =>  "((("
 * "recede"   =>  "()()()"
 * "Success"  =>  ")())())"
 * "(( @"     =>  "))((" 
 */

import java.util.*;

public class DuplicateCharacters {
	
	public static String encode(String word) {
		Map<Character, Integer> mapa = new HashMap<>();
		word = word.toLowerCase();
		String solucion = "";
		// String texto = word;
		for (int i = 0; i < word.length(); i++) {
			if (mapa.containsKey(word.charAt(i))) {
				mapa.put(word.charAt(i), mapa.get(word.charAt(i)) + 1);
			} else {
				mapa.put(word.charAt(i), 1);
			}
		}
		for (int i = 0; i < word.length(); i++) {
			if (mapa.get(word.charAt(i)) > 1) {
				// texto = texto.replace(word.charAt(i), ')');
				solucion += ")";
			} else {
				// texto = texto.replace(word.charAt(i), '(');
				solucion += "(";
			}
		}
		return solucion;
	}

	public static void main(String[] args) {

		System.out.println(encode("din"));
		System.out.println(encode("recede"));
		System.out.println(encode("Sucess"));
		System.out.println(encode("(( @"));
		System.out.println(encode("Prespecialized"));

		/*
		 * Si utilizamos replace falla en este caso por contener los mismos carácteres
		 * en el String que aquellos por los que se sustituyen. Lo solucionamos en vez
		 * de usando replace (haciendo muchos cambios a la vez) utilizando un String
		 * vacío al que le vamos sumando el cambio carácter a carácter.
		 */
		System.out.println(encode("   ()(   "));
		
	}

}
