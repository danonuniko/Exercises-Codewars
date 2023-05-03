/* Kata Level: 6.
 * 
 * Complete the solution so that it splits the string into pairs of two characters. 
 * If the string contains an odd number of characters then it should replace 
 * the missing second character of the final pair with an underscore ('_').
 * Examples:

 * 'abc' =>  ['ab', 'c_']
 * 'abcdef' => ['ab', 'cd', 'ef']
 */
 
using System;

public class SplitString
{

    // Mi solución.
    public static string[] Solution(string str)
    {
        if(str.Length % 2 != 0) str += "_";
        string[] silabas = new string[str.Length / 2];

        for(int i = 0 ; i < silabas.Length; i++)
        {
            //silabas[i] = str.Substring(i*2, i*2+2);     // Me falla en el último elemento. Si str tiene 6 letras, en silabas[2] intentaría acceder a str[6] cuando su índice máximo es 5.
            
            silabas[i] = $"{str[0]}{str[1]}";
            str = str.Substring(2);
        }
        return silabas;
    }

    public static void Main(String[] args)
    {
        string[] solucion = Solution("abc");
        foreach(string element in solucion){
            Console.WriteLine(element);
        }
        solucion = Solution("abcdef");
        foreach(string element in solucion){
            Console.WriteLine(element);
        }
    }

}
