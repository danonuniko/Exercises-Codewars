/* Kata Level: 7.
 * 
 * Given two integers a and b, which can be positive or negative, find the sum of all the integers between and including them and return it. 
 * If the two numbers are equal return a or b.
 * 
 * Note: a and b are not ordered!
 * 
 * Examples (a, b) --> output (explanation)
 * 
 * (1, 0) --> 1 (1 + 0 = 1)
 * (1, 2) --> 3 (1 + 2 = 3)
 * (0, 1) --> 1 (0 + 1 = 1)
 * (1, 1) --> 1 (1 since both are same)
 * (-1, 0) --> -1 (-1 + 0 = -1)
 * (-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
 */

public class SumOfRanges {
	
	// Mi solución.
	public static int GetSum(int a, int b) {
		int resultado = 0;
		if (a == b)
			return a;
		else {
			if (a < b) {
				for (int i = a; i <= b; i++)
					resultado += i;
			} else {
				for (int i = b; i <= a; i++)
					resultado += i;
			}
		}
		return resultado;
	}

	/*
	 * Solución de la comunidad 1. Misma lógica que mi ejercicio pero simplificando
	 * un poco. Lo único que no me gusta esque si a == b no lo evalúa hasta el
	 * final.
	 */
	public int GetSum1(int a, int b) {
		int res = 0;
		for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
			res += i;
		}
		return a == b ? a : res;
	}

	public static void main(String[] args) {

		System.out.println(GetSum(1, 0)); // 1
		System.out.println(GetSum(1, 2)); // 3
		System.out.println(GetSum(0, 1)); // 1
		System.out.println(GetSum(2, -3)); // -3

	}

}