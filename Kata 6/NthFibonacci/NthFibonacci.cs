/* Kata Level: 6.
 * 
 * I would like for you to write me a function that, when given a number n (n >= 1 ), returns the nth number in the Fibonacci Sequence.
 * 
 * For example:
 * 
 * nth_fib(4) == 2
 * Because 2 is the 4th number in the Fibonacci Sequence.
 * 
 * For reference, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 */

using System.Collections.Generic;

public class Fibonacci
{
    public int NthFib(int n)
    {
        int a = 0 , b = 1, c = a + b;
        List<int> numbersFibonacci = new List<int>() {0, 1};
        while(numbersFibonacci.Count < n)
        {
            numbersFibonacci.Add(c);
            a = b;
            b = c;
            c = a + b;
        }
        return n > 2 ? numbersFibonacci[numbersFibonacci.Count - 1] : n == 1 ? 0 : 1;
    }
}