/* Kata Level: 6.
 * 
 * Digital root is the recursive sum of all the digits in a number.
 * Given n, take the sum of the digits of n. If that value has more than one digit, 
 * continue reducing in this way until a single-digit number is produced. 
 * The input will be a non-negative integer.
 * 
 * Examples:
 * 16  -->  1 + 6 = 7
 * 942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
 * 132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
 * 493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
 */

using System;

public class Number
{
    
  public static int DigitalRoot(long n)
  {

    string n_str = n.ToString();
    int result = 0;
    for(int i = 0 ; i < n_str.Length ; i++)
    {
      result += int.Parse(n_str[i].ToString());
    }

    while(result >= 10)
    {
      n_str = result.ToString();
      result = 0;
      for(int i = 0 ; i < n_str.Length ; i++)
      {
        result += int.Parse(n_str[i].ToString());
      }
    }

    return result;
  }

  public static void Main(string[] args) {

    Console.WriteLine(DigitalRoot(16));
    Console.WriteLine(DigitalRoot(942));
    Console.WriteLine(DigitalRoot(132189));
    Console.WriteLine(DigitalRoot(493193));

  } 

}