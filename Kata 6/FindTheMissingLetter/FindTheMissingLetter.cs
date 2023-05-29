/* Kata Level: 6.
 * 
 * Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.
 * 
 * You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
 * The array will always contain letters in only one case.
 * 
 * Example:
 * 
 * ['a','b','c','d','f'] -> 'e'
 * ['O','Q','R','S'] -> 'P'
 * 
 * (Use the English alphabet with 26 letters!)
 */

public class Kata
{
    public static char FindMissingLetter(char[] array)
    {
        string letras = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int j = letras.IndexOf(array[0]);
        for(int i = 0 ; i <= array.Length ; i++) 
        {
            if(letras[j + i] != array[i])    return letras[j + i];
        }
        return ' ';
    } 
}