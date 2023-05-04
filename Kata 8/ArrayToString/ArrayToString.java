/* Kata Level: 8.
 * 
 * Sentence Smash
 * Write a function that takes an array of words and smashes them together 
 * into a sentence and returns the sentence. You can ignore any need to sanitize 
 * words or add punctuation, but you should add spaces between each word. 
 * Be careful, there shouldn't be a space at the beginning or the end of the sentence!
 * 
 * Example:
 * ['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'
 */

 public class ArrayToString {

	public static String smash(String... words) {
		
		String texto = "";
		for(String word : words) {
			texto += word + " ";
		}
		texto = texto.trim();
		while(texto.endsWith(" ")) {
			texto = texto.substring(0, texto.length()-1);
		}
		return texto;
        
	}
	
	public static void main(String[] args) {
		
		String[] palabras = {" ", "hola", "que", "tal", "estas", " "};
		System.out.println(smash(palabras));
	}

}
