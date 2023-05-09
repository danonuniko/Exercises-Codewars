/* Kata Level: 7.
 * 
 * Story:
 * Ben has a very simple idea to make some profit: he buys something and sells it again.
 * Of course, this wouldn't give him any profit at all if he was simply to buy and sell it at the same price.
 * Instead, he's going to buy it for the lowest possible price and sell it at the highest.
 * 
 * Task:
 * Write a function that returns both the minimum and maximum number of the given list/array.
 * 
 * Examples (Input --> Output) 
 * [1,2,3,4,5] --> [1,5]
 * [2334454,5] --> [5,2334454]
 * [1]         --> [1,1]
 * 
 * Remarks:
 * All arrays or lists will always have at least one element, so you don't need to check the length.
 * Also, your function will always get an array or a list, you don't have to check for null, undefined or similar.
 */

import java.util.Arrays;

public class MinimoMaximoArray {
	
	// Mi solución.
	public static int[] minMax(int[] valores) {
		int minimo = valores[0];
		int maximo = valores[0];
		int[] minimoMaximo = new int[2];

		for (int valor : valores) {
			if (minimo > valor) {
				minimo = valor;
			}
			if (maximo < valor) {
				maximo = valor;
			}
		}

		minimoMaximo[0] = minimo;
		minimoMaximo[1] = maximo;
		return minimoMaximo;
	}

	// Solución de la comunidad.
	public static int[] minMax1(int[] arr) {
		Arrays.sort(arr);
		return new int[] { arr[0], arr[arr.length - 1] };
	}

	public static void main(String[] args) {

		int[] valores = { 1, 2, 3, 4, 5 };
		int[] minimoMaximo = minMax(valores);

		for (int numero : minimoMaximo) {
			System.out.println(numero + " ");
		}

	}

}
