/* Kata Level: 6.
 * 
 * Write a simple parser that will parse and run Deadfish.
 * 
 * Deadfish has 4 commands, each 1 character long:
 * 
 * i increments the value (initially 0)
 * d decrements the value
 * s squares the value
 * o outputs the value into the return array
 * Invalid characters should be ignored.
 * 
 * Deadfish.parse("iiisdoso") =- new int[] {8, 64};
 */

using System.Collections.Generic;
using System.Linq;

public class Deadfish
{
    public static int[] Parse(string data)
    {
        int sum = 0;
        List<int> result = new List<int>();
        int[] array = new int[data.Where(x => x == 'o').Count()];

        foreach(char letter in data)
        {
            if(letter == 'i')   		sum += 1;
            else if(letter == 'd')    	sum -= 1;
            else if(letter == 's')    	sum *= sum;
            else if(letter == 'o')		result.Add(sum);
        }
        for(int i = 0 ; i < result.Count ; i++)    array[i] = result[i];
        return array;               // Alternativa:     Evitamos crear el array a la vez que la lista, y en la última línea escribimos      return result.ToArray();
    }

    public static void Main(string[] args)
    {
        foreach(int number in Parse("iiisdoso"))	Console.WriteLine(number);
    }
}