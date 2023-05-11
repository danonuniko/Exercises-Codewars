/* Kata Level: 8.
 * 
 * Complete the solution so that it reverses the string passed into it.
 * 
 * 'world'  =>  'dlrow'
 * 'word'   =>  'drow'
 */

public class Kata
{
    public static string ReversedString(string s)
    {
        string result = "";
        foreach(char letter in s)   result = letter + result;
        return result;
    }

    /* Solución de la comunidad.

    public static string Solution(string str) 
    {
        return new string(str.ToArray().Reverse().ToArray());
    }
    */

    public static void Main(string[] args)
    {
        System.Console.WriteLine(ReversedString("world"));
		System.Console.WriteLine(ReversedString("word"));
    }
}