/* Kata Level: 6.
 * 
 * DESCRIPTION:
 * Create a function that takes a Roman numeral as its argument and returns its value as a numeric decimal integer. 
 * You don't need to validate the form of the Roman numeral.
 * 
 * Modern Roman numerals are written by expressing each decimal digit of the number to be encoded separately, starting with the leftmost digit and skipping any 0s.
 * So 1990 is rendered "MCMXC" (1000 = M, 900 = CM, 90 = XC) and 2008 is rendered "MMVIII" (2000 = MM, 8 = VIII). 
 * The Roman numeral for 1666, "MDCLXVI", uses each letter in descending order.
 * 
 * Example:		solution('XXI') # should return 21
 * 
 * Help:
 * 
 * Symbol    Value
 * I          1
 * V          5
 * X          10
 * L          50
 * C          100
 * D          500
 * M          1,000
 */

using System;
using System.Collections.Generic;

public class RomanDecode
{
    // Modificamos la sintaxis de la solución creada para Java. Fijarse en como solucionamos el problema del Replace First Ocurrency (replaceFirst no existe en C#).
	public static int RomanToNumber(string str)
	{
		Dictionary<string, int> numeros = new Dictionary<string, int>();
        Dictionary<string, int> numerosEspeciales = new Dictionary<string, int>();

        int result = 0;

        numeros.Add("I", 1);
        numeros.Add("V", 5);
        numeros.Add("X", 10);
        numeros.Add("L", 50);
        numeros.Add("C", 100);
        numeros.Add("D", 500);
        numeros.Add("M", 1000);

        numerosEspeciales.Add("IV", 4);
        numerosEspeciales.Add("IX", 9);
        numerosEspeciales.Add("XL", 40);
        numerosEspeciales.Add("XC", 90);
        numerosEspeciales.Add("CD", 400);
        numerosEspeciales.Add("CM",900);

        foreach(string key in numerosEspeciales.Keys) 
        {
            while(str.Contains(key)) 
            {
                result += numerosEspeciales[key];
                int pos = str.IndexOf(key);
                str = str.Substring(0,pos) + str.Substring(pos + key.Length);
            }   
        }
        foreach(string key in numeros.Keys) 
        {
            while(str.Contains(key)) 
            {
                result += numeros[key];
                int pos = str.IndexOf(key);
                str = str.Substring(0,pos) + str.Substring(pos + key.Length);
            }
        }

        return result;
    }

    // Solución comunidad 1. Repasar lógica.
    private static readonly Dictionary<char, int> literals = new Dictionary<char, int> { {'I', 1}, {'V', 5}, {'X', 10}, {'L', 50}, {'C', 100}, {'D', 500}, {'M', 1000}, };
	public static int Solution(string roman)
	{
		int result = 0;
		int max = 0;

		foreach (var c in roman.Reverse())
		{
			int value = literals[c];

			if (value < max)        result -= value;
			else
			{
				result += value;
				max = value;
			}
		}
		return result;
	}

    // Solución comunidad 2.
    public static int Solution(string roman)
    {
        return roman
            .Replace("CM", "DCCCC")
            .Replace("CD", "CCCC")
            .Replace("XC", "LXXXX")
            .Replace("XL", "XXXX")
            .Replace("IX", "VIIII")
            .Replace("IV", "IIII")
            .Sum(c => Translate(c));
    }

    public static int Translate(char c)
    {
        switch (c)
        {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {

        Console.WriteLine(RomanToNumber("XIX"));
        Console.WriteLine(RomanToNumber("MCCLXXVII"));
        Console.WriteLine(RomanToNumber("CDXC"));

    }

}