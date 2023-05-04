/* Kata Level: 8.
 * 
 * Write a function to convert a name into initials. 
 * This kata strictly takes two words with one space in between them.
 * The output should be two capital letters with a dot separating them.
 * 
 * It should look like this:
 * 
 * Sam Harris => S.H
 * patrick feeney => P.F
 */

using System;
public static class AbbrevName
{
    public static string AbbrevName(string name)
    {
      string[] words = name.Split();
      string resultado = "";
      foreach(string word in words)
      {
        resultado += word.Substring(0,1).ToUpper() + ".";
      }
      return resultado.Substring(0,resultado.Length - 1);
    }

    public static void Main(string[] args)
    {
        Console.WriteLine(AbbrevName("Sam Harris"));
        Console.WriteLine(AbbrevName("patrick feeney"));
    }
}