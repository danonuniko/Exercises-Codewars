/* Kata Level: 6.
 * 
 * Complete the method/function so that it converts dash/underscore delimited words into camel casing. 
 * The first word within the output should be capitalized only if the original word was capitalized 
 * (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.
 * 
 * Examples
 * "the-stealth-warrior" gets converted to "theStealthWarrior"
 * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
 */

 public class Start {

	public static String toCamelCase(String s) {
		String[] palabras = s.replace("-", " ").replace("_", " ").split(" ");
		String texto = palabras[0];
		for (int i = 1; i < palabras.length; i++) {
			String palabra = "";
			char inicial = Character.toUpperCase(palabras[i].charAt(0));
			palabra = inicial + palabras[i].substring(1);
			texto += palabra;
		}
		return texto;
	}

	public static void main(String[] args) {

		System.out.println(toCamelCase("the-stealth-warrior"));
		System.out.println(toCamelCase("The_Stealth_Warrior"));
	}

}