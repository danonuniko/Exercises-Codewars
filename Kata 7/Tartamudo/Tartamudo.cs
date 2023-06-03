/* Kata Level: 7.
 * 
 * Examples:
 * 
 * accum("abcd") -> "A-Bb-Ccc-Dddd"
 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * accum("cwAt") -> "C-Ww-Aaa-Tttt"
 * 
 * The parameter of accum is a string which includes only letters from a..z and A..Z.
 */

using System;

public class Accumul 
{
	public static String Accum(string s) 
    {
        string result = "";
        for(int i = 0 ; i < s.Length ; i++) 
        {
            result +=  s[i].ToString().ToUpper();
            for(int j = 0 ; j < i ; j++)   result +=   s[i].ToString().ToLower();
            result += "-";
        }
        return result.Substring(0, result.Length - 1);
    }
}