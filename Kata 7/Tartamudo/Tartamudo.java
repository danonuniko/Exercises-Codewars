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

public class Accumul {
    
    public static String accum(String s) {
        
        String result = "";
        for(int i = 0 ; i < s.length() ; i++) {
        result +=  Character.toString(s.charAt(i)).toUpperCase();
        for(int j = 0 ; j < i ; j++)   result +=   Character.toString(s.charAt(i)).toLowerCase();
        result += "-";
        }
        return result.substring(0, result.length() - 1);
      
    }
}