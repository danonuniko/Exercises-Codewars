/* Kata Level: 6.
 * 
 * Task:
 * 
 * You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.
 * 
 * Examples:
 * 
 * [7, 1]  =>  [1, 7]
 * [5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
 * [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
 */

import java.util.*;

public class OrderOddNumbersArray {

    public static int[] sortArray(int[] array) {
        List<Integer> numerosImpares = new ArrayList<>();
        for(int number : array) {
            if(number % 2 != 0)     numerosImpares.add(number);
        }
        Collections.sort(numerosImpares);
        
        int[] resultado = new int[array.length];
        int contadorImpares = 0;
        for(int i = 0 ; i < array.length ; i++) {
            if(array[i] % 2 == 0)   resultado[i] = array[i];
            else {
                resultado[i] = numerosImpares.get(contadorImpares);
                contadorImpares++;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {

        int[] numeros = sortArray(new int[] {9, 1, 3, 2, 4, 5, 7, 13, 3, 17, 4, 42});
        for(int number : numeros)   System.out.println(number + " ");
        
    }
	
}