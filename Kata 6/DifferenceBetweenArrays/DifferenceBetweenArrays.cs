/* Kata Level: 6.
 * 
 * Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
 * It should remove all values from list a, which are present in list b keeping their order.
 * 
 * array_diff([1,2],[1]) == [2]
 * 
 * If a value is present in b, all of its occurrences must be removed from the other:		
 * 
 * array_diff([1,2,2,2,3],[2]) == [1,3]
 */

using System.Collections.Generic;
using System.Linq;

public class Kata
{
    public static int[] ArrayDiff(int[] a, int[] b)
    {
        List<int> result = new List<int>();
        foreach(int numberA in a) {
            bool iguales = false;
            foreach(int numberB in b) {
                if(numberA == numberB) {
                  iguales = true;
                  break;
                }
            }
            if(iguales == false)   result.Add(numberA); 
        }
        int[] solution = new int[result.Count];
        for(int i = 0 ; i < solution.Length ; i++)      solution[i] = result[i];
        return solution;
    }

    // Solución comunidad utilizando métodos de extensión.
    public static int[] ArrayDiff(int[] a, int[] b)
    {
        return a.Where(n => !b.Contains(n)).ToArray();
    }
}