/* Kata Level: 5.
 * 
 * In this example you have to validate if a user input string is alphanumeric. 
 * The given string is not nil/null/NULL/None, so you don't have to check that.
 * 
 * The string has the following conditions to be alphanumeric:
 * 
 * At least one character ("" is not valid).
 * Allowed characters are uppercase / lowercase latin letters and digits from 0 to 9.
 * No whitespaces / underscore.
 */

public class Kata
{
    // Solución propia utilizando Regex.
    public static bool AlphanumericRegex(string str)
    {
        return Regex.IsMatch(str,"^[a-zA-Z0-9]+$");
    }

    // Solución de la comunidad sin usar Regex.
    public static bool Alphanumeric(string str)
    {
        if (str.Length == 0) return false;

        foreach (var digit in str)
        {
            if (Char.IsDigit(digit) || Char.IsLetter(digit)) continue;
            else return false;
        }
        return true;  
    }
}