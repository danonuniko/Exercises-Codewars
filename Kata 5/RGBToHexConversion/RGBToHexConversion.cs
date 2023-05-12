/* Kata Level: 5.
 * 
 * The rgb function is incomplete. Complete it so that passing in RGB decimal 
 * values will result in a hexadecimal representation being returned. 
 * Valid decimal values for RGB are 0 - 255. 
 * Any values that fall out of that range must be rounded to the closest valid value.
 * 
 * Note: Your answer should always be 6 characters long, 
 * the shorthand with 3 will not work here.
 * 
 * The following are examples of expected output values:
 * 
 * RgbToHex.rgb(255, 255, 255) // returns FFFFFF
 * RgbToHex.rgb(255, 255, 300) // returns FFFFFF
 * RgbToHex.rgb(0, 0, 0)       // returns 000000
 * RgbToHex.rgb(148, 0, 211)   // returns 9400D3
 */

using System;
using System.Collections.Generic;

public class Kata
{
    public static string Rgb(int r, int g, int b) 
    {
        string resultado = "";

        Dictionary<int, string> conversor = new Dictionary<int, string>();
        conversor.Add(0, "0");
        conversor.Add(1, "1");
        conversor.Add(2, "2");
        conversor.Add(3, "3");
        conversor.Add(4, "4");
        conversor.Add(5, "5");
        conversor.Add(6, "6");
        conversor.Add(7, "7");
        conversor.Add(8, "8");
        conversor.Add(9, "9");
        conversor.Add(10, "A");
        conversor.Add(11, "B");
        conversor.Add(12, "C");
        conversor.Add(13, "D");
        conversor.Add(14, "E");
        conversor.Add(15, "F");

        if(r <= 0)          resultado += "00";
        else if(r >= 255)   resultado += "FF";
        else                resultado += conversor[r / 16] + conversor[r % 16];     // No hace falta hacer un Math.Floor porque al dividir dos enteros el resultado es de tipo entero. Si uno de ellos es float el resultado incluirá los decimales.

        if(g <= 0)          resultado += "00";
        else if(g >= 255)   resultado += "FF";
        else                resultado += conversor[g / 16] + conversor[g % 16];

        if(b <= 0)          resultado += "00";
        else if(b >= 255)   resultado += "FF";
        else                resultado += conversor[b / 16] + conversor[b % 16];
        
        return resultado;
    }

    public static void Main(string[] args)
    {
        Console.WriteLine(Rgb(255, 255, 255));
		Console.WriteLine(Rgb(255, 255, 300));
		Console.WriteLine(Rgb(0, 0, 0));
		Console.WriteLine(Rgb(148, 0, 211));
    }
}