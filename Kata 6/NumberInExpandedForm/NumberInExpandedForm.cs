/* Kata Level: 6.
 * 
 * Write Number in Expanded Form
 * You will be given a number and you will need to return it as a string in Expanded Form. 
 * 
 * For example:
 * 
 * Kata.expandedForm(12); # Should return "10 + 2"
 * Kata.expandedForm(42); # Should return "40 + 2"
 * Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
 * 
 * NOTE: All numbers will be whole numbers greater than 0.
 */
 
using System;

public static class Kata 
{
    // Solución de la comunidad.
    // No puedo utilizar el debug con C# para entender mejor como funciona la lógica del ejercicio.
    // Me gusta la forma de solucionar el ejercicio, sin la necesidad de realizar operaciones matemáticas.
    public static string ExpandedForm(long num) 
    {
        string numString = num.ToString();
        string blah = "";      
        for (int i = 0; i < numString.Length; i++)
        {
            if (numString[i] != '0')
            {
                blah += numString[i];
                blah += new String('0', numString.Length - i - 1);
                blah += " + ";
            }
        }
        return blah.Substring(0, blah.Length - 3);
    }

    public static void Main(string[] args)
    {
        
        Console.WriteLine(ExpandedForm(70304));
        Console.WriteLine(ExpandedForm(154));

    }
}