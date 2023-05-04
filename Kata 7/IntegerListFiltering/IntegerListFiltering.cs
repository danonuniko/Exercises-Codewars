/* Kata Level: 7.
 * 
 * In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
 * Example:
 * Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
 * Kata.filterList(List.of(1, 2, "a", "b", 0, 15)) => List.of(1,2,0,15)
 * Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)) => List.of(1,2,231)
 */
 
using System.Collections;
using System.Collections.Generic;

public class ListFilterer
{
   public static List<int> GetIntegersFromList(List<object> listOfItems)        // Me funciona el código utilizando List<int> en vez de IEnumerable<int> como tipo de retorno.
   {
      List<int> results = new List<int>();
      
      foreach(var item in listOfItems)
      {
        if(item is int)    results.Add((int)item);
      }
      
      return results;
   }

   public static void Main(string[] args)
   {
    
    List<object> enunciado = new List<object>() {1, 2, "a", "b"};
    List<int> resultado = GetIntegersFromList(enunciado);
    foreach(int element in resultado) Console.WriteLine(element);

    enunciado = new List<object>() {1, 2, "a", "b", 0 , 15};
    resultado = GetIntegersFromList(enunciado);
    foreach(int element in resultado) Console.WriteLine(element);

    enunciado = new List<object>() {1, 2, "a", "b", "aasf", "1", "123", 231};
    resultado = GetIntegersFromList(enunciado);
    foreach(int element in resultado) Console.WriteLine(element);

   }
}