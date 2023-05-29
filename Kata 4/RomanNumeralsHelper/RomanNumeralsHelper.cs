/* Kata Level: 4.
 * 
 * Write two functions that convert a roman numeral to and from an integer value. 
 * Multiple roman numeral values will be tested for each function.
 * 
 * Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero. 
 * In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 
 * 2008 is written as 2000=MM, 8=VIII; or MMVIII. 
 * 1666 uses each Roman symbol in descending order: MDCLXVI.
 * 
 * Input range : 1 <= n < 4000
 * In this kata 4 should be represented as IV, NOT as IIII (the "watchmaker's four").
 * 
 * Examples:
 * 
 * to roman:
 * 2000 -> "MM"
 * 1666 -> "MDCLXVI"
 * 1000 -> "M"
 * 400 -> "CD"
 * 90 -> "XC"
 * 40 -> "XL"
 * 1 -> "I"
 * 
 * from roman:
 * "MM"      -> 2000
 * "MDCLXVI" -> 1666
 * "M"       -> 1000
 * "CD"      -> 400
 * "XC"      -> 90
 * "XL"      -> 40
 * "I"       -> 1
 * 
 * Help:
 * 
 * Symbol	Value
 *     I	  1
 *     IV	  4
 *     V	  5
 *     X	 10
 *     L	 50
 *     C	100
 *     D	500
 *     M	1000
 */

public class RomanNumerals
{
    public static string ToRoman(int n)
    {
        string[] miles = " M MM MMM".Split();
        string[] centenares = " C CC CCC CD D DC DCC DCCC CM".Split();
        string[] decenas = " X XX XXX XL L LX LXX LXXX XC".Split();
        string[] unidades = " I II III IV V VI VII VIII IX".Split();
      
        return miles[n / 1000] + centenares[n % 1000 / 100] + decenas[n % 100 / 10] + unidades[n % 10];
    }

    public static int FromRoman(string str)
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
}