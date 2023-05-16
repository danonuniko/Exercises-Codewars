/* Kata Level: 5.
 * 
 * Write a function named first_non_repeating_letter that takes a string input, and returns the first character that is not repeated anywhere in the string.
 * For example, if given the input 'stress', the function should return 't', since the letter t only occurs once in the string, and occurs first in the string.
 * 
 * As an added challenge, upper- and lowercase letters are considered the same character, but the function should return the correct case for the initial letter. 
 * For example, the input 'sTreSS' should return 'T'.
 * 
 * If a string contains all repeating characters, it should return an empty string ("") or None -- see sample tests.
 */

public class FirstNonRepetitiveCharacterString {
    
    public static String FirstNonRepeatingLetter(String s)
  	{
		String prueba = s.toLowerCase();
		for(int i = 0 ; i < prueba.length() ; i++)
		{
			if(prueba.length() -1 == prueba.replace(prueba.substring(i, i+1), "").length())   return s.substring(i, i+1);
		}
		return "";
	}

	public static void main(String[] args) {
		System.out.println(FirstNonRepeatingLetter("sTreSS"));
		System.out.println(FirstNonRepeatingLetter("murcielago"));
		System.out.println(FirstNonRepeatingLetter("HalLoOhaj"));
	}
    
}