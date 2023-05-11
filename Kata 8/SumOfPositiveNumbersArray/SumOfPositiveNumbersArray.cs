/* Kata Level: 8.
 * 
 * You get an array of numbers, return the sum of all of the positives ones.
 * 
 * Example [1,-4,7,12] => 1 + 7 + 12 = 20
 * 
 * Note: if there is nothing to sum, the sum is default to 0.
 */

public class Kata
{
  public static int PositiveSum(int[] arr)
  {
    int sum = 0;
    foreach(int number in arr)
    {
      if(number > 0)  sum += number;
    }
    return sum;
  }
}
