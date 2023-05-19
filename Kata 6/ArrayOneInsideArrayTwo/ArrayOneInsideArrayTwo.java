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

    // Solución propia.
    
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

    // Solución comunidad. A destacar el uso del Set (evitamos repeticiones), el uso del break cada vez que hay una coincidencia y la conversion de ArrayList a Array (aprender).

    /*
    import java.util.Set;
    import java.util.HashSet;
    import java.util.Arrays;
    */    
    public static String[] inArray_community(String[] array1, String[] array2) {
        Set<String> result = new HashSet<>();
    
        for(String a1 : array1) {
            for(String a2 : array2) {
                if(a2.contains(a1)) {
                result.add(a1);
                break;
                }
            }
        }
        
        String[] resultArray = result.toArray(new String[result.size()]);
        Arrays.sort(resultArray);
        return resultArray;
    }
 
    public static void main(String[] args) {

        String[] result = inArray(new String[] {"arp", "live", "strong"}, new String[] {"lively", "alive", "harp", "sharp", "armstrong"});
        for(String word : result)	System.out.println(word);
    
    }

}
 
