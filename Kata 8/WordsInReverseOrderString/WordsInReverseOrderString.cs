/* Kata Level: 8.
 * 
 * Complete the solution so that it reverses all of the words within the string passed in.
 * Words are separated by exactly one space and there are no leading or trailing spaces.
 * 
 * Example(Input --> Output):	"The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"
 */

public class Kata
{
    public static string ReverseWords(string str)
    {
        string result = "";
        foreach(string word in str.Split())     result = word + " " + result;
        return result.Substring(0, result.Length - 1);
    }

    // Alternativa usando métodos de extensión.
    public static string ReverseWords(string str)
    {
        return string.Join(" ", str.Split(' ').Reverse());
    }

    public static void Main(string[] args)
    {
        System.Console.WriteLine(ReverseWords("hola que tal estás"));
        System.Console.WriteLine(ReverseWords("había una vez un circo que alegraba siempre el corazón"));
    }

}