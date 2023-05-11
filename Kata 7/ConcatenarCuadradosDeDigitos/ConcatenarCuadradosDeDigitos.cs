/* Kata Level: 7.
 * 
 * Square every digit of a number and concatenate them.
 * For example, if we run 9119 through the function, 811181 will come out, because 9^2 is 81 and 1^2 is 1.
 * 
 * Note: The function accepts an integer and returns an integer
 */

public class Kata
{
  public static int SquareDigits(int n)
  {
    string n_str = n.ToString();
    string result_str = "";
    foreach(char digit_str in n_str)
    {
      result_str += Math.Pow(int.Parse(digit_str.ToString()), 2);
    }
    return int.Parse(result_str);
  }

  public static void Main(string[] args)
  {
    System.Console.WriteLine(SquareDigits(9119));
  }
}