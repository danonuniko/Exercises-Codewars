/* Kata Level: 6.
 * 
 * A list S will be given. You need to generate a list T from it by following the given process:
 * 
 * Remove the first and last element from the list S and add them to the list T.
 * Reverse the list S
 * Repeat the process until list S gets emptied.
 * 
 * The above process results in the depletion of the list S. Your task is to generate list T without mutating the input List S.
 * 
 * Example:
 * S = [1,2,3,4,5,6]
 * T = []
 * 
 * S = [2,3,4,5] => [5,4,3,2]
 * T = [1,6]
 * 
 * S = [4,3] => [3,4]
 * T = [1,6,5,2]
 * 
 * S = []
 * T = [1,6,5,2,3,4]
 * return T
 * 
 * Note:
 * size of S goes up to 10^6
 * Keep the efficiency of your code in mind.
 * Do not mutate the Input.
 */

using System.Collections.Generic;

public class Kata
{
    public static List<int> gameWithLists(int[] originalList)
	{
		List<int> result = new List<int>();

		int n = 0;
		while(n < originalList.Length / 2) 
		{
			if(n % 2 ==0) 
			{
				result.Add(originalList[0 + n]);
				result.Add(originalList[originalList.Length - 1 - n]);
				n++;
			}
			else 
			{
				result.Add(originalList[originalList.Length - 1 - n]);
				result.Add(originalList[0 + n]);
				n++;
			}
		}
		return result;
	}

    public static void Main(string[] args)
    {
        List<int> solution = gameWithLists(new int[] {1, 2, 3, 4, 5, 6});
		foreach(int number in solution) Console.WriteLine(number);
    }
}