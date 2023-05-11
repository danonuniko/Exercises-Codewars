/* Kata Level: 8.
 * 
 * Complete the square sum function so that it squares 
 * each number passed into it and then sums the results together.
 * 
 * For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
 */

 public class Kata
 {
    public static int SumOfSquares(int[] numbers)
    {
        int sum = 0;
        foreach(int number in numbers)
        {
            sum += number*number;
        }
        return sum;
    }

    public static void Main(string[] args)
    {
        System.Console.Write(SumOfSquares(new int[] {1, 2, 3}));
    }
 }