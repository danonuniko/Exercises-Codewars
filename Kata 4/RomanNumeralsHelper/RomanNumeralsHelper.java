/* Kata Level: 4.
 * 
 * Write two functions that convert a roman numeral to and from an integer value. 
 * Multiple roman numeral values will be tested for each function.
 * 
 * Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero. 
 * In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 
 * 2008 is written as 2000=MM, 8=VIII; or MMVIII. 
 * 1666 uses each Roman symbol in descending order: MDCLXVI.
 * 
 * Input range : 1 <= n < 4000
 * In this kata 4 should be represented as IV, NOT as IIII (the "watchmaker's four").
 * 
 * Examples:
 * 
 * to roman:
 * 2000 -> "MM"
 * 1666 -> "MDCLXVI"
 * 1000 -> "M"
 * 400 -> "CD"
 * 90 -> "XC"
 * 40 -> "XL"
 * 1 -> "I"
 * 
 * from roman:
 * "MM"      -> 2000
 * "MDCLXVI" -> 1666
 * "M"       -> 1000
 * "CD"      -> 400
 * "XC"      -> 90
 * "XL"      -> 40
 * "I"       -> 1
 * 
 * Help:
 * 
 * Symbol	Value
 *     I	  1
 *     IV	  4
 *     V	  5
 *     X	 10
 *     L	 50
 *     C	100
 *     D	500
 *     M	1000
 */

import java.util.*;

public class RomanNumeralsHelper {
 
    public static String toRoman(int n) {
        String[] miles = " M MM MMM".split(" ");
        String[] centenares = " C CC CCC CD D DC DCC DCCC CM".split(" ");
        String[] decenas = " X XX XXX XL L LX LXX LXXX XC".split(" ");
        String[] unidades = " I II III IV V VI VII VIII IX".split(" ");
      
        return miles[n / 1000] + centenares[n % 1000 / 100] + decenas[n % 100 / 10] + unidades[n % 10];
    }
    
    public static int fromRoman(String str) {
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
  }