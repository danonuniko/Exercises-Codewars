/* Kata Level: 6.
 * 
 * Write a function that takes in a string of one or more words, and returns the same string, 
 * but with all five or more letter words reversed (Just like the name of this Kata). 
 * Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.
 * 
 * Examples:
 * 
 * spinWords("Hey fellow warriors") => returns "Hey wollef sroirraw" 
 * spinWords("This is a test") => returns "This is a test" 
 * spinWords("This is another test") => returns "This is rehtona test"
 */

public class Kata
{
    public static string SpinWords(string sentence)
    {
        string[] words = sentence.Split();
        for(int i = 0 ; i < words.Length ; i++)
        {
            if(words[i].Length >= 5)
            {
            string word = "";
            for(int j = 0 ; j < words[i].Length ; j++)    word = words[i][j] + word;
            words[i] = word;
            }
        }
        return string.Join(" ", words);
    }

    // Solución comunidad usando Linq.
    public static string SpinWords_community(string sentence)
    {
        return string.Join(" ", sentence.Split(' ').Select(str => str.Length >= 5 ? new string(str.Reverse().ToArray()) : str));
    }

    public static void Main(string[] args)
    {
        System.Console.WriteLine(SpinWords("Hey fellow warriors"));
        System.Console.WriteLine(SpinWords("This is a test"));
        System.Console.WriteLine(SpinWords("This is another test"));
    }
}