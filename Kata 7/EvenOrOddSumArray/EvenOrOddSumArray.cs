/* Kata Level: 7.
 * 
 * Task:
 * Given a list of integers, determine whether the sum of its elements is odd or even.
 * Give your answer as a string matching "odd" or "even".
 * If the input array is empty consider it as: [0] (array with a zero).
 * 
 * Examples:
 * 
 * Input: [0]
 * Output: "even"
 * 
 * Input: [0, 1, 4]
 * Output: "odd"
 * 
 * Input: [0, -1, -5]
 * Output: "even"
 */

using System.Linq;

 public class EvenOrOddSumArray {

    // Mi solución utilizando Linq.
    public static string OddOrEven(int[] array)
    {
        return array.Select(x => x).Sum() %2 == 0 ? "even" : "odd";
    }

    // Solución comunidad optimizada (sin utilizar el Select).
    public static string OddOrEven(int[] array)
    {
        return array.Sum() % 2 == 0 ? "even" : "odd";
    }

    // Solución comunidad sin usar LINQ.
    public static string OddOrEven(int[] array)
    {
        int result = 0;
        foreach(int i in array)     result +=i;
        return result%2==0 ? "even" : "odd";
    }
}