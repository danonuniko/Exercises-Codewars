/* Kata Level: 6.
 * 
 * DESCRIPTION:
 * Create a function that takes a Roman numeral as its argument and returns its value as a numeric decimal integer. 
 * You don't need to validate the form of the Roman numeral.
 * 
 * Modern Roman numerals are written by expressing each decimal digit of the number to be encoded separately, starting with the leftmost digit and skipping any 0s.
 * So 1990 is rendered "MCMXC" (1000 = M, 900 = CM, 90 = XC) and 2008 is rendered "MMVIII" (2000 = MM, 8 = VIII). 
 * The Roman numeral for 1666, "MDCLXVI", uses each letter in descending order.
 * 
 * Example:		solution('XXI') # should return 21
 * 
 * Help:
 * 
 * Symbol    Value
 * I          1
 * V          5
 * X          10
 * L          50
 * C          100
 * D          500
 * M          1,000
 */

import java.util.*;

public class RomanNumeralsDecoder {

	public static int RomanToNumber(String str) {

        Map<String, Integer> numeros = new HashMap<>();
        Map<String, Integer> numerosEspeciales = new HashMap<>();

        int result = 0;

        numeros.put("I", 1);
        numeros.put("V", 5);
        numeros.put("X", 10);
        numeros.put("L", 50);
        numeros.put("C", 100);
        numeros.put("D", 500);
        numeros.put("M", 1000);

        numerosEspeciales.put("IV", 4);
        numerosEspeciales.put("IX", 9);
        numerosEspeciales.put("XL", 40);
        numerosEspeciales.put("XC", 90);
        numerosEspeciales.put("CD", 400);
        numerosEspeciales.put("CM",900);

        for(String key : numerosEspeciales.keySet()) {
            while(str.contains(key)) {
                result += numerosEspeciales.get(key);
                str = str.replaceFirst(key, "");
            }   
        }
        for(String key : numeros.keySet()) {
            while(str.contains(key)) {
                result += numeros.get(key);
                str = str.replaceFirst(key, "");
            }
        }

        return result;

    }

    public static void main(String[] args) {

        System.out.println(RomanToNumber("XIX"));
        System.out.println(RomanToNumber("MCCLXXVII"));
        System.out.println(RomanToNumber("CDXC"));

    }
	
}