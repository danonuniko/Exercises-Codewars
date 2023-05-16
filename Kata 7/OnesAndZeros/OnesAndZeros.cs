/* Kata Level: 7.
 * 
 * Given an array of ones and zeroes, convert the equivalent binary value to an integer.
 * Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.
 * 
 * Examples:
 * 
 * Testing: [0, 0, 0, 1] ==> 1
 * Testing: [0, 0, 1, 0] ==> 2
 * Testing: [0, 1, 0, 1] ==> 5
 * Testing: [1, 0, 0, 1] ==> 9
 * Testing: [0, 0, 1, 0] ==> 2
 * Testing: [0, 1, 1, 0] ==> 6
 * Testing: [1, 1, 1, 1] ==> 15
 * Testing: [1, 0, 1, 1] ==> 11
 * 
 * However, the arrays can have varying lengths, not just limited to 4.
 */

public class Kata
{
    public static int binaryArrayToNumber(int[] BinaryArray)
	{
		Array.Reverse(BinaryArray);
		int result = 0;
		for(int i = 0 ; i < BinaryArray.Length ; i++)
		{
			if(BinaryArray[i] == 1)		result += (int) System.Math.Pow(2, BinaryArray.Length - i);
		}
		return result;
	}

    public static void Main(string[] args)
    {
        System.Console.WriteLine(binaryArrayToNumber(new int[] {0, 0, 1, 0}));
		System.Console.WriteLine(binaryArrayToNumber(new int[] {1, 0, 0, 1}));
		System.Console.WriteLine(binaryArrayToNumber(new int[] {0, 1, 1, 1}));
		System.Console.WriteLine(binaryArrayToNumber(new int[] {0, 0, 0, 1}));
    }
}