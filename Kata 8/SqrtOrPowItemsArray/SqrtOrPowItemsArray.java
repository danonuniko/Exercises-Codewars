/* Kata Level: 8.
 * 
 * Write a method, that will get an integer array as parameter and will process every number from this array.
 * 
 * Return a new array with processing every number of the input-array like this:
 * If the number has an integer square root, take this, otherwise square the number.
 * 
 * Example:		[4,3,9,7,2,1] -> [2,9,3,49,4,1]
 * 
 * Notes:	The input array will always contain only positive numbers, and will never be empty or null.
 */

import java.util.*;

public class SqrtOrPowItemsArray {

    // Misma solución que en C# y misma sintaxis modificando Sqrt por sqrt.
    public static int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(Math.sqrt(array[i]) % 1 != 0)    array[i] *= array[i];
            else                                array[i] = (int)Math.sqrt(array[i]);
        }
        return array;
    }

    // Solución comunidad 1.
    public static int[] squareOrSquareRootCommunity(int[] array) {
        return  Arrays.stream(array)
                .map(i -> Math.sqrt(i) % 1 == 0 ? ((int) Math.sqrt(i)) : (i * i))          
                .toArray();      
    }

}