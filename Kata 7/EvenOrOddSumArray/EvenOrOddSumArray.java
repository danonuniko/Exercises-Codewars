/* Kata Level: 7.
 * 
 * Task:
 * Given a list of integers, determine whether the sum of its elements is odd or even.
 * Give your answer as a string matching "odd" or "even".
 * If the input array is empty consider it as: [0] (array with a zero).
 * 
 * Examples:
 * 
 * Input: [0]
 * Output: "even"
 * 
 * Input: [0, 1, 4]
 * Output: "odd"
 * 
 * Input: [0, -1, -5]
 * Output: "even"
 */

import java.util.*;

public class EvenOrOddSumArray {

    // Solución utilizando lógica básica.
    public static String OddOrEven(int[] array) {
        int result = 0;
        for(int i : array)     result +=i;
        return result % 2 == 0 ? "even" : "odd";
    }

    // Solución comunidad. Misma lógica que utilizando el LINQ de C#.
    public static String oddOrEvenCommunity(final int[] array) {
        return Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
    }

}