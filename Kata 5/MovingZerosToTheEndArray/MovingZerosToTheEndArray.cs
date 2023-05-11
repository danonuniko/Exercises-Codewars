/*
Kata Level: 5.

Write an algorithm that takes an array and moves all of the zeros to the end, preserving the order of the other elements.

Kata.MoveZeroes(new int[] {1, 2, 0, 1, 0, 1, 0, 3, 0, 1}) => new int[] {1, 2, 1, 1, 3, 1, 0, 0, 0, 0}
*/

using System.Collections.Generic;

public class Kata
{
    // Mi solución en C#. Supera todos los test pero no siento que sea la opción más optimizada.
    public static int[] MoveZeroes(int[] arr)
    {
        List<int> result_list = new List<int>();
        foreach(int number in arr)
        {
            if(number != 0)		result_list.Add(number);
        }
        int[] result = new int[arr.Length];
        for(int i = 0 ; i < result_list.Count ; i++)
        {
            result[i] = result_list[i];
        }
        for(int i = result_list.Count ; i < arr.Length ; i++)
        {
            result[i] = 0;
        }
        return result;
    }

    // Solución de la comunidad C#.
    public static int[] MoveZeroes(int[] arr)
    {
        return arr.Where(x=>x!=0).Concat(arr.Where(x=>x==0)).ToArray();
    }

    public static void Main(string[] args)
    {
        int[] result = MoveZeroes(new int[] {1, 2, 0, 3, -2, 0, 0, 3, 2, 1, 0, 9});
		foreach(int number in result) Console.Write(number + " ");
    }
}