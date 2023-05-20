/* Kata Level: 5.
 * 
 * Write a function that takes a string of parentheses, and determines if the order of the parentheses is valid. 
 * The function should return true if the string is valid, and false if it's invalid.
 * 
 * Examples:
 * 
 * "()"              =>  true
 * ")(()))"          =>  false
 * "("               =>  false
 * "(())((()())())"  =>  true
 * 
 * Constraints:
 * 0 <= input.length <= 100
 * 
 * Along with opening (() and closing ()) parenthesis, input may contain any valid ASCII characters.
 * Furthermore, the input string may be empty and/or not contain any parentheses at all. Do not treat other forms of brackets as parentheses (e.g. [], {}, <>).
 */

using System;

public class Parentheses
{
    public static bool ValidParentheses(string input)
    {
        int count = 0;
		foreach(char letter in input.ToCharArray()) {
			if(letter == '(')   count++;
			else if(letter == ')') {
				if(count == 0)  return false;
				count--;
			}
		}
		return count == 0;
    }

    public static void Main(string[] args)
    {
        Console.WriteLine(ValidParentheses("()"));
        Console.WriteLine(ValidParentheses(")(()))"));
        Console.WriteLine(ValidParentheses("("));
        Console.WriteLine(ValidParentheses("(())((()())())"));
    }
}