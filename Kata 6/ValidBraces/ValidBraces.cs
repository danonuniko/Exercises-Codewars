/* Kata Level: 6.
 *
 * DESCRIPTION:
 * Write a function that takes a string of braces, and determines if the order of the braces is valid. 
 * It should return true if the string is valid, and false if it's invalid.
 * 
 * All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.
 * What is considered Valid?
 * A string of braces is considered valid if all braces are matched with the correct brace.
 * 
 * Examples:
 * 
 * "(){}[]"   =>  True
 * "([{}])"   =>  True
 * "(}"       =>  False
 * "[(])"     =>  False
 * "[({})](]" =>  False
 */

public class Brace {

    public static bool validBraces(String braces) {
        string resultado = "";
        foreach(char character in braces)
        {
            if(character == '(' || character == '{' || character == '[')  resultado += character;
            else if(character == ')')
            {
                if(resultado.Length == 0 || resultado.Substring(resultado.Length -1, 1) != "(")   return false;
                else  resultado = resultado.Substring(0, resultado.Length - 1);
            }
            else if(character == '}')
            {
                if(resultado.Length == 0 || resultado.Substring(resultado.Length -1, 1) != "{")   return false;
                else  resultado = resultado.Substring(0, resultado.Length - 1);
            }
            else if(character == ']')
            {
                if(resultado.Length == 0 || resultado.Substring(resultado.Length -1, 1) != "[")   return false;
                else  resultado = resultado.Substring(0, resultado.Length - 1);
            }
        }
        return resultado.Length == 0;
    }

    public static void Main(string[] args)
    {
        Console.WriteLine(validBraces("(){}[]"));
        Console.WriteLine(validBraces("([{}])"));
        Console.WriteLine(validBraces("(}"));
        Console.WriteLine(validBraces("[(])"));
        Console.WriteLine(validBraces("[({})](]"));
    }
}