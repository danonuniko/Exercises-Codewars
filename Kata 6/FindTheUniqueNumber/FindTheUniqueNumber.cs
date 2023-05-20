/* Kata Level: 6.
 * 
 * There is an array with some numbers. All numbers are equal except for one. Try to find it!
 * 
 * find_uniq([ 1, 1, 1, 2, 1, 1 ]) == 2
 * find_uniq([ 0, 0, 0.55, 0, 0 ]) == 0.55
 * 
 * It’s guaranteed that array contains at least 3 numbers.
 * The tests contain some very huge arrays, so think about performance.
 */

using System.Collections.Generic;
using System.Linq;
public class Kata
{
    public static int GetUnique(IEnumerable<int> numbers)
    {
        /* 
        2 formas de ordenar un IEnumerable:
            1) Utilizando OrderBy (necesario guardar el resultado en una nueva variable. OrderBy no modifica la lista original).
            2) Pasar el IEnumerable a lista y utilizar el método Sort().
        Utilizo el método 2 porque utilizando el método 1 no funciona el indexing del tipo result[0].
        */
        
        // var result = numbers.OrderBy(s => s);   // método 1)
        List<int> solution = numbers.ToList();  // método 2)
        solution.Sort();
        return solution[0] == solution[1] ? solution.Last() : solution[0];
    }

    public static void Main(string[] args)
    {
        System.Console.Write(GetUnique(new List<int> {1, 1, 1, 4, 1, 1}));
        System.Console.Write(GetUnique(new List<int> {3, 5, 5, 5, 5}));
    }
}