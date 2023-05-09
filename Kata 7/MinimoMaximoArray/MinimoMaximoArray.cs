/* Kata Level: 7.
 * 
 * Story:
 * Ben has a very simple idea to make some profit: he buys something and sells it again.
 * Of course, this wouldn't give him any profit at all if he was simply to buy and sell it at the same price.
 * Instead, he's going to buy it for the lowest possible price and sell it at the highest.
 * 
 * Task:
 * Write a function that returns both the minimum and maximum number of the given list/array.
 * 
 * Examples (Input --> Output) 
 * [1,2,3,4,5] --> [1,5]
 * [2334454,5] --> [5,2334454]
 * [1]         --> [1,1]
 * 
 * Remarks:
 * All arrays or lists will always have at least one element, so you don't need to check the length.
 * Also, your function will always get an array or a list, you don't have to check for null, undefined or similar.
 */

public class Kata
{
    public static int[] MinMax(int[] lst) 
    {
        int[] result = new int[2];
		int min_number = int.MaxValue;
		int max_number = int.MinValue;
		foreach(int number in lst)
		{
			if(number < min_number)		min_number = number;
			if(number > max_number)		max_number = number;
		}
        result[0] = min_number;
        result[1] = max_number;
        return result;
    }

    // Solución de la comunidad
    public static int[] minMax(int[] lst) 
    {
        return new int[] {lst.Min(), lst.Max()};
    }

    public static void Main(string[] args)
    {
        // numbers = {1, 2, 3, 4, 5};
        // numbers = {2334454, 5};
        int[] numbers = {1,1};
		int[] result = MinMax(numbers);
		foreach(int number in result)	Console.Write(number + " ");
    }

}
