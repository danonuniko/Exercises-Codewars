/* Kata Level: 6.
 * 
 * Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
 * It should remove all values from list a, which are present in list b keeping their order.
 * 
 * array_diff([1,2],[1]) == [2]
 * 
 * If a value is present in b, all of its occurrences must be removed from the other:		
 * 
 * array_diff([1,2,2,2,3],[2]) == [1,3]
 */

import java.util.ArrayList;
import java.util.List;

public class DifferenceBetweenArrays {

    // Solución propia versión 1.
    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> result = new ArrayList<Integer>();
        loop:
        for(int numberA : a) {
            for(int numberB : b) {
                if(numberA == numberB)  continue loop; 
            }  
            result.add(numberA); 
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    // Solución propia versión 2.
    public static int[] arrayDiffV2(int[] a, int[] b) {
    
        List<Integer> result = new ArrayList<Integer>();
        for(int numberA : a) {
            boolean iguales = false;
            for(int numberB : b) {
                if(numberA == numberB) {
                  iguales = true;
                  break;
                }
            }
            if(iguales == false)   result.add(numberA); 
        }
        int[] solution = new int[result.size()];
        for(int i = 0 ; i < solution.length ; i++)      solution[i] = result.get(i);
        return solution;
    }
    
}