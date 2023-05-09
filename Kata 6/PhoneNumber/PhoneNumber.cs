/* Kata Level: 6.
 * 
 * Write a function that accepts an array of 10 integers (between 0 and 9),
 * that returns a string of those numbers in the form of a phone number.
 * 
 * Example:
 * Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
 * The returned format must be correct in order to complete this challenge.
 * 
 * Don't forget the space after the closing parentheses!
 */

public class Kata
{
    public static string CreatePhoneNumber(int[] numbers)
	{
		return $"({string.Join("", numbers).Substring(0, 3)}) {string.Join("", numbers).Substring(3, 3)}-{string.Join("", numbers).Substring(6)}";
	}

    public static void Main(string[] args)
    {
        System.Console.WriteLine(CreatePhoneNumber(new[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}	