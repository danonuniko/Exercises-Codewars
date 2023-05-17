/* Kata Level: 7.
 * 
 * You are given an odd-length array of integers, in which all of them are the same, except for one single number.
 * Complete the method which accepts such an array, and returns that single different number.
 * 
 * The input array will always be valid! (odd-length >= 3)
 * 
 * Examples:
 * [1, 1, 2] ==> 2
 * [17, 17, 3, 17, 17, 17, 17] ==> 3
 */

using System;
class Solution 
{
    public static int Stray(int[] numbers)
    {
        Array.Sort(numbers);
        return numbers[0] == numbers[1] ? numbers[numbers.Length - 1] : numbers[0];				// Alternativa: numbers.Last() y numbers.First()
    }

    public static int StrayCommunity(int[] n)
    {
        return n.First(x => n.Count(i => i == x) == 1);
    }
}