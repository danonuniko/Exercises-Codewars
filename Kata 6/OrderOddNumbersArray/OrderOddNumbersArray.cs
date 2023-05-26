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

using System.Collections.Generic;

public class Kata
{
    public static int[] SortArray(int[] array)
    {
        List<int> numerosImpares = new List<int>();
        foreach(int number in array) 
        {
            if(number % 2 != 0)     numerosImpares.Add(number);
        }
        numerosImpares.Sort();
        
        int[] resultado = new int[array.Length];
        int contadorImpares = 0;
        for(int i = 0 ; i < array.Length ; i++) 
        {
            if(array[i] % 2 == 0)   resultado[i] = array[i];
            else 
            {
                resultado[i] = numerosImpares[contadorImpares];
                contadorImpares++;
            }
        }
        return resultado;
    }

    /* Alternativa para llevar 2 contadores. Podemos hacerlo dentro del for.

    for (int i = 0, j = 0 ; i < array.Length ; i++)
    {
        if (array[i] %2 != 0)
        {
          array[i] = oddAr[j];
          j++;
        }
    }

    */
}