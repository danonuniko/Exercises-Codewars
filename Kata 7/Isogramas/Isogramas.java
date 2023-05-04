/* Kata Level: 7.
 * 
 * An isogram is a word that has no repeating letters, consecutive or non-consecutive. 
 * Implement a function that determines whether a string that contains only letters is an isogram. 
 * Assume the empty string is an isogram. Ignore letter case.
 * 
 * isIsogram "Dermatoglyphics" = true
 * isIsogram "moOse" = false
 * isIsogram "aba" = false
 */

import java.util.*;

public class Isogramas {
	
	// Mi solución aplicando Maps.
	public static boolean isIsogram(String str) {

		Map<Character, Integer> mapa = new HashMap<>();
		str = str.toLowerCase();

		if (str.length() == 0) {
			return true;
		} else {
			for (int i = 0; i < str.length(); i++) {
				if (mapa.containsKey(str.charAt(i))) {
					return false;
				} else {
					mapa.put(str.charAt(i), 1);
				}
			}
			return true;
		}

	}

	/*
	 * Mi solución aplicando List (el IDE de CodeWars no me la da como válida pero
	 * aquí si que funciona).
	 */
	public static boolean isIsogram1(String str) {

		List<Character> lista = new ArrayList<>();
		str = str.toLowerCase();

		if (str.length() == 0) {
			return true;
		} else {
			for (int i = 0; i < str.length(); i++) {
				if (lista.contains(str.charAt(i))) {
					return false;
				} else {
					lista.add(str.charAt(i));
				}
			}
			return true;
		}

	}

	// Solución de la comunidad aplicando SET.
	public static boolean isIsogram2(String str) {
		Set<Character> letters = new HashSet<Character>();

		for (int i = 0; i < str.length(); ++i) {
			if (letters.contains(str.toLowerCase().charAt(i))) {
				return false;
			}
			letters.add(str.charAt(i));
		}

		return true;
	}

	// Solución de la comunidad simplificada. REVISAR MÉTODOS.
	public static boolean isIsogram3(String str) {
		return str.length() == str.toLowerCase().chars().distinct().count();
	}

	public static void main(String[] args) {

		System.out.println(isIsogram(""));
		System.out.println(isIsogram("Dermatoglyphics"));
		System.out.println(isIsogram("moOse"));
		System.out.println(isIsogram("abA"));
		
	}

}

