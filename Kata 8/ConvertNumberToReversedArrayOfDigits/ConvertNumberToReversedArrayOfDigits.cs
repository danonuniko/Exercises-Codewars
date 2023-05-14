/* Kata Level: 8.
 * 
 * Convert number to reversed array of digits.
 * Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
 * 
 * Example(Input => Output):
 * 35231 => [1,3,2,5,3]
 * 0 => [0]
 */

public class Kata
{
    public static int[] NumberToReversedArray(int number)
    {
        int[] solution = new int[number.ToString().Length];
        int index = 0;
        for(int i = number.ToString().Length - 1 ; i >= 0 ; i--) 
        {
            solution[index] = int.Parse(number.ToString().Substring(i, 1));
            index++;
        }
        return solution;
    }
    public static void Main(string[] args)
    {
        int[] solution = NumberToReversedArray(12345);
		foreach(int digit in solution)	Console.WriteLine(digit);
    }
}