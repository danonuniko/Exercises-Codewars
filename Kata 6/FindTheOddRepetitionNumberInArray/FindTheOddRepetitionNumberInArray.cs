/* Kata Level: 6.
 * 
 * Given an array of integers, find the one that appears an odd number of times.
 * There will always be only one integer that appears an odd number of times.
 * 
 * Examples:
 * 
 * [7] should return 7, because it occurs 1 time (which is odd).
 * [0] should return 0, because it occurs 1 time (which is odd).
 * [1,1,2] should return 2, because it occurs 1 time (which is odd).
 * [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
 * [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
 */

using System.Collections.Generic;
class Kata
{
    public static int find_it(int[] seq) 
    {
        Dictionary<int, int> numbers = new Dictionary<int, int>();
        foreach(int number in seq)
        {
            if(numbers.ContainsKey(number))  numbers[number] += 1;
            else    numbers[number] = 1;
        }
        foreach(int number in numbers.Keys)
        {
            if(numbers[number] % 2 != 0)    return number;
        }
        return -1;
    }   
}