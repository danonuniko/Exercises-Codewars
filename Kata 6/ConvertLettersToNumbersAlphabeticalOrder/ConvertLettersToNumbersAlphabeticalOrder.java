/* Kata Level: 6.
 * 
 * In this kata you are required to, given a string, replace every letter with its position in the alphabet.
 * If anything in the text isn't a letter, ignore it and don't return it.
 * 
 * "a" = 1, "b" = 2, etc.
 * 
 * Example:
 * alphabet_position("The sunset sets at twelve o' clock.")
 * Should return "20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11" (as a string)
 */

 public class ConvertLettersToNumbersAlphabeticalOrder {

    // No existe en Codewars para Java. Modificamos el código realizado para C#.
	public static String AlphabetPosition(String text) {     
        if(text.length() == 0 || text == null)    return "";
        int count = 0;
        String result = "";
        String possibilities = "abcdefghijklmnñopqrstuvwxyz";
		text = text.toLowerCase();
        for(int i = 0 ; i < text.length() ; i++) {
            if(possibilities.contains(Character.toString(text.charAt(i)))) {
                result += (int) (text.charAt(i) - 96) + " ";   // El carácter 'a' pasado a su código ASCII equivale a 97.
                count++;
            }       
        }
        return count == 0 ? "" : result.substring(0, result.length() - 1);        
        // Necesario utilizar count además del text.Length == 0 o text == null para casos estilo "..!" (no es null ni longitud igual a cero pero debe retornar vacío). 
        // Si no llevamos la cuenta dará error al intentar realizar el Substring.
    }

	public static void main(String[] args) {

		System.out.println(AlphabetPosition("The sunset sets at twelve o' clock."));
        
	}
}