/* Kata Level: 6.
 * 
 * Complete the method/function so that it converts dash/underscore delimited words into camel casing. 
 * The first word within the output should be capitalized only if the original word was capitalized 
 * (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.
 * 
 * Examples
 * "the-stealth-warrior" gets converted to "theStealthWarrior"
 * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
 */

 using System;

public class Kata
{
	public static string ToCamelCase(string str)
	{
		string[] words = str.Replace("-", " ").Replace("_", " ").Split();
		for(int i = 1 ; i < words.Length ; i++) {
			words[i] = words[i].Substring(0,1).ToUpper() + words[i].Substring(1).ToLower();
		}
		return string.Join("", words);
	}
	public static void Main(String[] args)
	{
		Console.WriteLine(ToCamelCase("hola-que-tal-estas"));
		Console.WriteLine(ToCamelCase("the-stealth-warrior"));
		Console.WriteLine(ToCamelCase("The_Stealth_Warrior"));
	}
}