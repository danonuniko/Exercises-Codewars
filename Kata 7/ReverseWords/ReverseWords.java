/* Kata Level: 7.
 * 
 * DESCRIPTION:
 * Complete the function that accepts a string parameter, and reverses each word in the string.
 * All spaces in the string should be retained.
 * 
 * Examples:
 * 
 * "This is an example!" ==> "sihT si na !elpmaxe"
 * "double  spaces"      ==> "elbuod  secaps"
 */

 public class ReverseWords {
	
	/* No podemos usar replace. Explicar el motivo en el video.
	
	String[] palabras = original.split(" ");
	String original1 = original;
	for(String palabra : palabras) {
		String palabraNueva = "";
		for(int i = 0 ; i < palabra.length() ; i++) {
			palabraNueva = palabra.charAt(i) + palabraNueva;
		}
		original1 = original1.replace(palabra, palabraNueva);
	}*/
		
	public static String reverseWords(final String original) {
		String resultado = "";
		String palabraNueva = "";
		for(int i = 0 ; i < original.length() ; i++) {
			if(original.charAt(i) == ' ') {
				resultado += palabraNueva + " ";
				palabraNueva = "";
			}
			else {
				palabraNueva = original.charAt(i) + palabraNueva;
			}
		}
		return resultado + palabraNueva;
	}

	public static void main(String[] args) {
	
		System.out.println(reverseWords("This is an example!"));
		System.out.println(reverseWords("double  spaces"));
		System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));
		System.out.println(reverseWords("Have should is This abcdEFGH should case i..."));
		System.out.println(reverseWords("This hello"));
		
	}

}