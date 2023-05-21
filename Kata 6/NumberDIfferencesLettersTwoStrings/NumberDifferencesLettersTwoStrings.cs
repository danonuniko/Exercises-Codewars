/* Kata Level: 6.
 * 
 * The Hamming Distance is a measure of similarity between two strings of equal length. 
 * Complete the function so that it returns the number of positions where the input strings do not match.
 * 
 * Examples:
 * 
 * a = "I like turtles"
 * b = "I like turkeys"
 * Result: 3
 * 
 * a = "Hello World"
 * b = "Hello World"
 * Result: 0
 * 
 * a = "espresso"
 * b = "Expresso"
 * Result: 2
 * 
 * You can assume that the two input strings are of equal length.
 */

public class Kata
{
    public static int Distance(string a, string b)
	{
		int count = 0;
        for(int i = 0 ; i < a.Length ; i++)
        {
            if(a[i] != b[i])    count++;
        }
        return count;
	}

    // Solución de la comunidad usando System.Linq;
    public static int DistanceCommunity(string a, string b)
	{
		return a.Where((t, i) => t != b[i]).Count();
	}

    public static void Main(string[] args)
    {
        System.Console.WriteLine(Distance("I like turtles", "I like turkeys"));
        System.Console.WriteLine(Distance("Hello World", "Hello World"));
        System.Console.WriteLine(Distance("espresso", "Expresso"));
    }
}