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

import java.util.*;

public class NthFibonacci {

	public int NthFib(int n) {
        int a = 0 , b = 1, c = a + b;
        List<Integer> numbersFibonacci = new ArrayList<Integer>();
        numbersFibonacci.add(0);
        numbersFibonacci.add(1);
        while(numbersFibonacci.size() < n) {
            numbersFibonacci.add(c);
            a = b;
            b = c;
            c = a + b;
        }
        return n > 2 ? numbersFibonacci.get(numbersFibonacci.size() - 1) : n == 1 ? 0 : 1;
    }
	
}
