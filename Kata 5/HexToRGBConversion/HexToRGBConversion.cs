/* Kata Level: 5.
 * 
 * When working with color values it can sometimes be useful to 
 * extract the individual red, green, and blue (RGB) component values for a color. 
 * Implement a function that meets these requirements:
 * 
 * Accepts a case-insensitive hexadecimal color string as its parameter (ex. "#FF9933" or "#ff9933").
 * Returns a Map<String, int> with the structure {r: 255, g: 153, b: 51} where r, g, and b range from 0 through 255
 * 
 * Note: your implementation does not need to support the shorthand form of hexadecimal notation (ie "#FFF")
 * 
 * Example:
 * "#FF9933" --> {r: 255, g: 153, b: 51}
 */

public class Kata
{
    public static Dictionary<char, int> HexToRGBConversion(string hex)
	{
		hex = hex.ToUpper();

		Dictionary<string, int> conversor = new Dictionary<string, int>();
		conversor.Add("0", 0);
		conversor.Add("1", 1);
		conversor.Add("2", 2);
		conversor.Add("3", 3);
		conversor.Add("4", 4);
		conversor.Add("5", 5);
		conversor.Add("6", 6);
		conversor.Add("7", 7);
		conversor.Add("8", 8);
		conversor.Add("9", 9);
		conversor.Add("A", 10);
		conversor.Add("B", 11);
		conversor.Add("C", 12);
		conversor.Add("D", 13);
		conversor.Add("E", 14);
		conversor.Add("F", 15);

		Dictionary<char, int> resultado = new Dictionary<char, int>();

		int r = conversor[hex.Substring(1, 1)]*16 + conversor[hex.Substring(2, 1)];
		resultado.Add('r', r);
		int g = conversor[hex.Substring(3, 1)]*16 + conversor[hex.Substring(4, 1)];
		resultado.Add('g', g);
		int b = conversor[hex.Substring(5, 1)]*16 + conversor[hex.Substring(6, 1)];
		resultado.Add('b', b);

		return resultado;

	}

    public static void Main(string[] args)
    {
        Dictionary<char, int> resultado = HexToRGBConversion("#FF9933");
		foreach(var key in resultado)	Console.WriteLine(key);
    }

}
