/* Kata Level: 7.
 * 
 * Given the triangle of consecutive odd numbers:
 * 
 *                 1
 *              3     5
 *           7     9    11
 *       13    15    17    19 
 *    21    23    25    27    29
 *  ...
 *  
 * Calculate the sum of the numbers in the n-th row of this triangle (starting at index 1) .
 * 
 * e.g.: (Input --> Output)
 * 
 * 1 -->  1
 * 2 --> 3 + 5 = 8
 */

using System;
public static class Kata
{
  public static long RowSumOddNumbers(long n)
  {
    long primer_numero = n * (n-1) + 1;
    long suma = 0;
    for(int i = 0 ; i < n ; i++) {
      suma += primer_numero;
      primer_numero += 2;
    }
    return suma;
  }
}