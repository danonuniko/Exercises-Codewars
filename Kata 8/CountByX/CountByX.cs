/* Kata Level: 8.
 * 
 * Create a function with two arguments that will return an array of the first n multiples of x.
 * Assume both the given number and the number of times to count will be positive numbers greater than 0.
 * Return the results as an array or list (depending on language).
 * 
 * Examples:
 * 
 * countBy(1,10)    should return  {1,2,3,4,5,6,7,8,9,10}
 * countBy(2,5)     should return {2,4,6,8,10}
 */

public static class Kata
{
  public static int[] CountBy(int x, int n)
  {
    int[] z = new int[n];
    int suma = x;
    for(int i = 0 ; i < n ; i++)
    {
      z[i] = suma;
      suma += x;
    }
    return z;
  }

  public static void Main(string[] args)
  {
    int[] z = CountBy(2, 5);
    foreach(int number in z)  Console.Write(number + " ");
  }
}