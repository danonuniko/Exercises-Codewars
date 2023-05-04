/* Kata Level: 8.
 * 
 * Clock shows h hours, m minutes and s seconds after midnight.
 * Your task is to write a function which returns the time since midnight in milliseconds.
 * 
 * Example:
 * h = 0
 * m = 1
 * s = 1
 * result = 61000
 * 
 * Input constraints:
 * 0 <= h <= 23
 * 0 <= m <= 59
 * 0 <= s <= 59
 */

using System;
public static class Clock
{
    public static int Past(int h, int m, int s)
    {
        return (h >= 0 && h <= 23 && m >= 0 && m <= 59 && s >= 0 && s <= 59) ? h*3600000 + m*60000 + s*1000 : -1;
    }

    public static void Main(string[] args)
    {
        Console.WriteLine(Past(0, 1, 1));
        Console.WriteLine(Past(-4, 1, 1));
    }
}