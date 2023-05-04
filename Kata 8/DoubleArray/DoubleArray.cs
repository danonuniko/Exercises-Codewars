/* Kata Level: 8.
 * 
 * Given an array of integers, return a new array with each value doubled.
 * 
 * For example:
 * 
 * [1, 2, 3] --> [2, 4, 6]
 */

using System;
public static class DoubleArray
{
  public static int[] Maps(int[] x)
  {
    int count = 0;
    foreach(int number in x)
    {
      x[count] = number*2;
      count++;
    }
    return x;
  }
}