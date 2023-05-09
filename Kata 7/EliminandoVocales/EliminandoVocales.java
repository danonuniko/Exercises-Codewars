/* Kata Level: 7.
 * 
 * Trolls are attacking your comment section!
 * 
 * A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
 * Your task is to write a function that takes a string and return a new string with all vowels removed.
 * 
 * For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
 * 
 * Note: for this kata y isn't considered a vowel.
 */

 public class EliminandoVocales {

	// Mi solución. No es válido utilzar toLowerCase() porque debemos respetar las consonantes que estén en mayúsculas.
	public static String disemvowel(String str) {
		return str.replace("a", "").replace("á", "").replace("A", "").replace("Á", "").replace("e", "").replace("é", "")
				.replace("E", "").replace("É", "").replace("i", "").replace("í", "").replace("I", "").replace("Í", "")
				.replace("o", "").replace("ó", "").replace("O", "").replace("Ó", "").replace("u", "").replace("ú", "")
				.replace("ü", "").replace("U", "").replace("Ú", "").replace("Ü", "");
	}
	
	// Solución de la comunidad.
	public static String disemvowel1(String str) {
		return str.replaceAll("[aeiouAEIOUáéíóúüÁÉÍÓÚÜ]", "");
	}

	public static void main(String[] args) {
		
		System.out.println(disemvowel("This website is for losers LOL!"));

	}

}
