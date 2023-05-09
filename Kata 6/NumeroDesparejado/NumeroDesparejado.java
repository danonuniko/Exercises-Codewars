/* Kata Level: 6.
 * 
 * You are given an array (which will have a length of at least 3, but could be very large) containing integers. 
 * The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
 * Write a method that takes the array as an argument and returns this "outlier" N.
 * 
 * Examples:
 * [2, 4, 0, 100, 4, 11, 2602, 36]
 * Should return: 11 (the only odd number)
 * 
 * [160, 3, 1719, 19, 11, 13, -21]
 * Should return: 160 (the only even number)
 */

import java.util.*;

public class NumeroDesparejado {
	
	// Mi solución 1, usando ArrayList.
	public static int find(int[] integers) {
		List<Integer> listaPares = new ArrayList<>();
		List<Integer> listaImpares = new ArrayList<>();
		if (integers.length < 3)
			return -1;
		for (int numero : integers) {
			if (numero % 2 == 0)
				listaPares.add(numero);
			else
				listaImpares.add(numero);
		}
		if (listaPares.size() == 1)
			return listaPares.get(0);
		return listaImpares.get(0);
	}

	// Mi solución 2, sin usar ArrayList.
	public static int find1(int[] integers) {
		int numeroPar = 0;
		int numeroImpar = 0;
		int numeroPares = 0;
		if (integers.length < 3)
			return -1;
		for (int numero : integers) {
			if (numero % 2 == 0) {
				numeroPar = numero;
				numeroPares++;
			} else {
				numeroImpar = numero;
			}
		}
		if (numeroPares == 1)
			return numeroPar;
		return numeroImpar;
	}

	// Solución de la comunidad.
	public static int find2(int[] integers) {
		int[] odd = Arrays.stream(integers).filter(n -> n % 2 != 0).toArray();
		int[] even = Arrays.stream(integers).filter(n -> n % 2 == 0).toArray();

		return odd.length == 1 ? odd[0] : even[0];
	}

	public static void main(String[] args) {

		int[] numeros = { 1, 2, 4, 6, 8, 10, 20, 22 };
		System.out.println(find(numeros));

		int[] numeros2 = { 1, 3, 5, 7, 9, 13, 15, 24 };
		System.out.println(find(numeros2));

	}

}
