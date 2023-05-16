/* Kata Level: 6.
 * 
 * Task:
 * Given Two integers a and b, find the sum of them, BUT You are not allowed to use the operators + and -.
 * 
 * Notes:
 * The numbers (a,b) may be positive, negative values or zeros.
 * Returning value will be an integer .
 * 
 * Java: the following methods are prohibited: addExact, average, collect, decrement, increment, nextAfter, nextDown, nextUp, reduce, subtractExact, sum, summing.
 * The following classes are prohibited: BigDecimal and BigInteger.
 * 
 * Input >> Output Examples:
 * 
 * Add (5,19) ==> return (24) 
 * Add (-27,18) ==> return (-9)
 * Add (-14,-16) ==> return (-30)
 */

public class SumOfTwoIntegers {

	// Mi solución. No es válida por usar los carácteres + y -.
	public static int add(int x, int y) {
		if(x == 0)
			return y;
		if(y == 0)
			return x;

		if(x <0) {
			while(x != 0) {
				y--;
				x++;
			}
			return y;
		} else {
			while(x != 0) {
				y++;
				x--;
			}
			return y;
		}
	}
	
	// Solución de la comunidad 1. Utiliza la referencia del símbolo + en lenguaje Unicode.
	 public static int add1(int x, int y) {
		 return x \u002B y;
	 }

	public static void main(String[] args) {

		System.out.println(add(0,0));
		System.out.println(add(1,0));
		System.out.println(add(3,5));
		System.out.println(add(-3,-8));
		System.out.println(add(13,-17));
		
	}

}