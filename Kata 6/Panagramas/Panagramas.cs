/* Kata Level: 6.
 * 
 * A pangram is a sentence that contains every single letter of the alphabet at least once. 
 * For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
 * Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
 */

using System;
using System.Collections.Generic;

public static class Kata
{
    public static bool IsPangram(string str)
    {
        string validValues = "abcdefghijklmnopqrstuvwxyz";
        HashSet<char> letters = new HashSet<char>();
        foreach(char letter in str.ToLower())
        {
            if(validValues.Contains(letter))    letters.Add(letter);
        }     
        return letters.Count == 26;
    }

    // Solución Comunidad.
    public static bool IsPangram(string str)
    {
        return str.Where(ch => Char.IsLetter(ch)).Select(ch => Char.ToLower(ch)).Distinct().Count() == 26;
    }
}