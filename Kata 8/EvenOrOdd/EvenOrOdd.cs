/* Kata Level: 8.
 * 
 * Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
 */

using System;

namespace Solution
{
  public class SolutionClass
  {
    public static string EvenOrOdd(int number)
    {
      return number % 2 == 0 ? "Even" : "Odd";
    }

    public static void Main(string[] args)
    {
      Console.WriteLine(EvenOrOdd(0));
      Console.WriteLine(EvenOrOdd(10));
      Console.WriteLine(EvenOrOdd(3));
      Console.WriteLine(EvenOrOdd(55)); 
    }
  }
}