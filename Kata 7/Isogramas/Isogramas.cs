/* Kata Level: 7.
 * 
 * An isogram is a word that has no repeating letters, consecutive or non-consecutive. 
 * Implement a function that determines whether a string that contains only letters is an isogram. 
 * Assume the empty string is an isogram. Ignore letter case.
 * 
 * isIsogram "Dermatoglyphics" = true
 * isIsogram "moOse" = false
 * isIsogram "aba" = false
 */
 
using System;
using System.Collections.Generic;

public class Kata
{
  public static bool IsIsogram(string str) 
  {
    HashSet<char> letras = new HashSet<char>();
    foreach(char letter in str.ToLower())   letras.Add(letter);
    return str.Length == letras.Count;
  }

  public static void Main(string[] args)
  {

    Console.WriteLine(IsIsogram("Dermatoglyphics"));
    Console.WriteLine(IsIsogram("moOse"));
    Console.WriteLine(IsIsogram("Aba"));    
  
  }
}