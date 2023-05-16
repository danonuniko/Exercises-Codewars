/* Kata Level: 6.
 * 
 * Give the summation of all even numbers in a Fibonacci sequence up to, but not including, the number passed to your function.
 * Or, in other words, sum all the even Fibonacci numbers that are lower than the given number n (n is not the nth element of Fibonnacci sequence) without including n.
 * 
 * The Fibonacci sequence is a series of numbers where the next value is the addition of the previous two values. The series starts with 0 and 1:
 * 0 1 1 2 3 5 8 13 21...
 * 
 * For example:
 * 
 * fibonacci(0)==0
 * fibonacci(33)==10
 * fibonacci(25997544)==19544084
 */

 public class EvenFibonacciSum {
	
	public static long fibonacci(long max) {
		if(max == 0 || max == 1 || max == 2)
			return 0;
		long a = 1;
		long b = 1;
		long c = a+b;
		long resultado = 2;
		while(c < max) {
			a = b;
			b = c;
			c = a +b;
			if(c % 2 == 0)
				resultado += c;
		}
		if(c % 2 == 0)
			resultado -= c;
		return resultado;
	}

	public static void main(String[] args) {

		System.out.println(fibonacci(0));
		System.out.println(fibonacci(3));
		System.out.println(fibonacci(5));
		System.out.println(fibonacci(8));
		System.out.println(fibonacci(33));
		System.out.println(fibonacci(25997544));
	}

}