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

using System.Linq;
public class Kata
{
    public static String HighestWord(String s) 
    {
        string letras = "abcdefghijklmnopqrstuvwxyz";
        int total = 0;
        string finalWord = "";
        string[] words = s.ToLower().Split();
        foreach(string word in words)
        {
            int valor = 0;
            foreach(char letter in word.ToCharArray())       valor += letras.IndexOf(letter) + 1;
            if(valor > total)
            {
                total = valor;
                finalWord = word;
            }
        }
        return finalWord;
    }

    // Solución comunidad 1.
    // Entiendo la lógica aunque me cuesta ver que "a" es un string y "b" un char.
    public static string High(string s)
    {
        return s.Split(' ').OrderBy(a => a.Select(b => b - 96).Sum()).Last();
    }

}