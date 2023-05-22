/* Kata Level: 8.
 * 
 * What if we need the length of the words separated by a space to be added at the end of that same word and have it returned as an array?
 * 
 * Example(Input --> Output)
 * 
 * "apple ban" --> ["apple 5", "ban 3"]
 * "you will win" -->["you 3", "will 4", "win 3"]
 * 
 * Your task is to write a function that takes a String and returns an Array/list with the length of each word added to each element .
 * Note: String will have at least one element; words will always be separated by a space.
 */

using System.Linq;

public class Kata
{
    public static string[] AddLength(string str)
    {
        string[] words = str.Split();
        for(int i = 0 ; i < words.Length ; i++)     words[i] += " " + words[i].Length;
        return words;
    }

    // Solución de la comunidad.
    public static string[] AddLength(string str) => str.Split(' ').Select(e=> $"{e} {e.Length}").ToArray();

    public static void Main(string[] args)
    {
        String[] words = AddLength("Hola que tal estás");
        foreach(string word in words)   Console.WriteLine(word);
    }
}
