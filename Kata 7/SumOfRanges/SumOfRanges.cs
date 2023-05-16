/* Kata Level: 7.
 * 
 * Given two integers a and b, which can be positive or negative, find the sum of all the integers between and including them and return it. 
 * If the two numbers are equal return a or b.
 * 
 * Note: a and b are not ordered!
 * 
 * Examples (a, b) --> output (explanation)
 * 
 * (1, 0) --> 1 (1 + 0 = 1)
 * (1, 2) --> 3 (1 + 2 = 3)
 * (0, 1) --> 1 (0 + 1 = 1)
 * (1, 1) --> 1 (1 since both are same)
 * (-1, 0) --> -1 (-1 + 0 = -1)
 * (-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
 */

public class Sum
{
    public static int GetSum(int a, int b)
    {
        int max = Math.Max(a, b), min = Math.Min(a, b);
        int result = 0;
        for(int i = min; i <= max; i++)     result += i;
        return result;
    }

    public static void Main(string[] args)
    {
        Console.WriteLine(GetSum(2, 5));
        Console.WriteLine(GetSum(8, 5));
        Console.WriteLine(GetSum(-4, 4));
    }
}