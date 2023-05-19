/* Kata Level: 6.
 * 
 * Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which are substrings of strings of a2.
 * 
 * Example 1:
 * 
 * a1 = ["arp", "live", "strong"]
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 * returns ["arp", "live", "strong"]
 * 
 * Example 2:
 * 
 * a1 = ["tarp", "mice", "bull"]
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 * returns []
 * 
 * Notes:
 * Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.
 * In Shell bash a1 and a2 are strings. The return is a string where words are separated by commas.
 * Beware: In some languages r must be without duplicates.
 */

import java.util.*;

public class ArrayOneInsideArrayTwo {
 
    public static String[] inArray(String[] array1, String[] array2) {

        ArrayList<String> result = new ArrayList<>();
        for(String word1 : array1) {
            for(String word2 : array2) {
                if(word2.contains(word1) && !result.contains(word1))	result.add(word1);	
            }
        }
        Collections.sort(result);
        String[] solution = new String[result.size()];
        for(int i = 0 ; i < result.size() ; i++)	solution[i] = result.get(i);
        return solution;
    }
 
    public static void main(String[] args) {

        String[] result = inArray(new String[] {"arp", "live", "strong"}, new String[] {"lively", "alive", "harp", "sharp", "armstrong"});
        for(String word : result)	System.out.println(word);
    
    }

}
 
