/* Kata Level: 7.
 * 
 * DESCRIPTION:
 * Complete the function that accepts a string parameter, and reverses each word in the string.
 * All spaces in the string should be retained.
 * 
 * Examples:
 * 
 * "This is an example!" ==> "sihT si na !elpmaxe"
 * "double  spaces"      ==> "elbuod  secaps"
 */

public class Kata
{
    public static string ReverseWords(string str)
    {
        string[] words = str.Split();
        string[] solution = new string[words.Length];
        int contador = 0;

        foreach(string word in words)
        {
            string newWord = "";
            for(int i = word.Length - 1 ; i >= 0 ; i--)
            {
                newWord += word[i];
            }
            solution[contador] = newWord;
            contador++;
        }
        return string.Join(" ", solution);
    }

    // Soluciones de la comunidad. Investigar.
    public static string ReverseWordsCommunity(string str)
    {
        return string.Join(" ", str.Split(' ').Select(i => new string(i.Reverse().ToArray())));
    }
    public static string ReverseWords(string str) => string.Join(" ", str.Split().Select(x => string.Concat(x.Reverse())));

    public static void Main(string[] args)
    {
        System.Console.WriteLine(ReverseWords("This is an example!"));
    }
}