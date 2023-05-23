/* Kata Level: 5.
 * 
 * Move the first letter of each word to the end of it, then add "ay" to the end of the word. 
 * Leave punctuation marks untouched.
 * 
 * Examples:
 * 
 * pig_it('Pig latin is cool') # igPay atinlay siay oolcay
 * pig_it('Hello world !')     # elloHay orldway !
 */

using System.Text.RegularExpressions;

public class Kata
{
    public static string PigIt(string str)
    {
        string[] words = str.Split(); 
        Regex rx = new Regex("[a-zA-Z]+");
        for(int i = 0; i < words.Length ; i++)
        {
            if(rx.IsMatch(words[i]))
            words[i] = words[i].Substring(1)+words[i][0] +"ay"; 
        }  
        return string.Join(" ", words);
    }

    // Solución comunidad. Me gusta mucho la lógica y optimización.
    public static string PigIt(string str)
    {
        return string.Join(" ", str.Split(' ').Select(w => w.Any(char.IsPunctuation) ? w : w.Substring(1) + w[0] + "ay"));
    }

    public static void Main(string[] args)
    {
        Console.WriteLine(PigIt("Pig latin is cool"));
        Console.WriteLine(PigIt("Hello world !"));
    }
}