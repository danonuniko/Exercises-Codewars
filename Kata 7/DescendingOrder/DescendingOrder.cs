/* Kata Level: 7.
 * 
 * Your task is to make a function that can take any non-negative integer as an argument and return it 
 * with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
 * 
 * Examples:
 * 
 * Input: 42145 Output: 54421
 * Input: 145263 Output: 654321
 * Input: 123456789 Output: 987654321
 */

public static class Kata
{
  public static int DescendingOrder(int num)
  {
    char[] digits = num.ToString().ToCharArray();
    Array.Sort(digits);
    Array.Reverse(digits);
    return int.Parse(string.Join("", digits));
  }
}