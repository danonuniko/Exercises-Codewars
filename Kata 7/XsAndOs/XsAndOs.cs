/* Kata Level: 7.
 * 
 * DESCRIPTION:
 * Check to see if a string has the same amount of 'x's and 'o's. 
 * The method must return a boolean and be case insensitive. The string can contain any char.
 * 
 * Examples input/output:
 * 
 * XO("ooxx") => true
 * XO("xooxx") => false
 * XO("ooxXm") => true
 * XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
 * XO("zzoo") => false
 */

public class Kata
{
    public static bool XO (string input)
	{
		return input.Where(x => x == 'x' || x == 'X').Count() == input.Where(x => x == 'o' || x == 'O').Count();
	}
    public static void Main(string[] args)
    {
        System.Console.WriteLine(XO("ooxx"));
        System.Console.WriteLine(XO("xooxx"));
        System.Console.WriteLine(XO("ooxXm"));
        System.Console.WriteLine(XO("zpzpzpp"));
        System.Console.WriteLine(XO("zzoo"));
    }
}
	