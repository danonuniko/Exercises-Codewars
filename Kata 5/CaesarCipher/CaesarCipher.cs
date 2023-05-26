/* Kata Level: 5.
 * 
 * ROT13 is a simple letter substitution cipher that replaces a letter with the letter 13 letters after it in the alphabet. 
 * ROT13 is an example of the Caesar cipher.
 * 
 * Create a function that takes a string and returns the string ciphered with Rot13. 
 * If there are numbers or special characters included in the string, they should be returned as they are. 
 * Only letters from the latin/english alphabet should be shifted, like in the original Rot13 "implementation".
 * 
 * Please note that using encode is considered cheating.
 */

public class Kata
{
    public static string Rot13(string message)
    {
        string minusculas = "abcdefghijklmnopqrstuvwxyzabcdefghijklm";
        string mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLM";
        string result = "";
        
        foreach(char letter in message.ToCharArray())
        {
            if(minusculas.Contains(letter))   result += minusculas[minusculas.IndexOf(letter) + 13];
            else if(mayusculas.Contains(letter))   result += mayusculas[mayusculas.IndexOf(letter) + 13];
            else    result += letter;
        }
        return result;
    }
}