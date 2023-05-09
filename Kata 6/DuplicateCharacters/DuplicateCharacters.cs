/* Kata Level: 6.
 * 
 * The goal of this exercise is to convert a string to a new string where each character 
 * in the new string is "(" if that character appears only once in the original string, or ")" 
 * if that character appears more than once in the original string. 
 * Ignore capitalization when determining if a character is a duplicate.
 * 
 * Examples:
 * "din"      =>  "((("
 * "recede"   =>  "()()()"
 * "Success"  =>  ")())())"
 * "(( @"     =>  "))((" 
 */
 
using System.Collections.Generic;

public class Kata
{
	public static string DuplicateEncode(string word)
	{
		Dictionary<char, int> diccionario = new Dictionary<char, int>();
		foreach(char letter in word.ToLower())
		{
			if(diccionario.ContainsKey(letter))		diccionario[letter] += 1;
			else	diccionario[letter] = 1; 
		}
		string resultado = "";
		foreach(char letter in word.ToLower())
		{
			if(diccionario[letter] != 1)	resultado += ")";
			else	resultado += "(";
		}
		return resultado;
	}
}