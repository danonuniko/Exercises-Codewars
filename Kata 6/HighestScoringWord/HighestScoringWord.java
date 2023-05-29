/* Kata Level: 6.
 * 
 * Given a string of words, you need to find the highest scoring word.
 * Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
 * 
 * For example, the score of abad is 8 (1 + 2 + 1 + 4).
 * 
 * You need to return the highest scoring word as a string.
 * If two words score the same, return the word that appears earliest in the original string.
 * 
 * All letters will be lowercase and all inputs will be valid.
 */

public class HighestScoringWord {

    public static String high(String s) {
        
        String letras = "abcdefghijklmnopqrstuvwxyz";
        int total = 0;
        String finalWord = "";
        String[] words = s.toLowerCase().split(" ");
        for(String word : words) {
            int valor = 0;
            for(char letter : word.toCharArray()) {
                valor += letras.indexOf(letter) + 1;
            }
            if(valor > total) {
                total = valor;
                finalWord = word;
            }
        }
        return finalWord;

    }

}