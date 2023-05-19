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

using System.Linq;
public static class Kata
{
    public static string AlphabetPosition(string text)
    {     
        if(text.Length == 0 || text == null)    return "";
        int count = 0;
        string result = "";
        string possibilities = "abcdefghijklmnñopqrstuvwxyz";
        foreach(char letter in text.ToLower())
        {
            if(possibilities.Contains(letter))
            {
                result += (int) (letter - 96) + " ";   // El carácter 'a' pasado a su código ASCII equivale a 97.
                count++;
            }       
        }
        return count == 0 ? "" : result.Substring(0, result.Length - 1);        
        // Necesario utilizar count además del text.Length == 0 o text == null para casos estilo "..!" (no es null ni longitud igual a cero pero debe retornar vacío). 
        // Si no llevamos la cuenta dará error al intentar realizar el Substring.
    }

    // Solución comunidad.
    public static string AlphabetPosition(string text)
    {
        return string.Join(" ", text.ToLower().Where(char.IsLetter).Select(x => x - 'a'+1));
    }
}