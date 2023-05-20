/* Kata Level: 6.
 * 
 * Write a function that takes in a string of one or more words, and returns the same string, 
 * but with all five or more letter words reversed (Just like the name of this Kata). 
 * Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.
 * 
 * Examples:
 * 
 * spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" 
 * spinWords( "This is a test") => returns "This is a test" 
 * spinWords( "This is another test" )=> returns "This is rehtona test"
 */

import java.util.*;
import java.util.stream.Collectors;

public class ReverseFiveOrMoreLettersWordsString {

	public static String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        for(int i = 0 ; i < words.length ; i++)
        {
            if(words[i].length() >= 5)
            {
            String word = "";
            for(int j = 0 ; j < words[i].length() ; j++)    word = words[i].charAt(j) + word;
            words[i] = word;
            }
        }
        return String.join(" ", words);
  	}

    // Solución comunidad optimizando código. Investigar.
	public String spinWordsCommunity(String sentence) {
		return Arrays.stream(sentence.split(" "))
                    .map(w -> w.length() < 5 ? w : new StringBuilder(w).reverse().toString())
                    .collect(Collectors.joining(" "));
	}

    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
        System.out.println(spinWords("This is a test"));
        System.out.println(spinWords("This is another test"));
    }
}