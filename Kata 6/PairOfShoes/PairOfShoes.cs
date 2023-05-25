/* Kata Level: 6.
 * 
 * Task:
 * 
 * Yesterday you found some shoes in your room. Each shoe is described by two values:
 * type indicates if it's a left or a right shoe;
 * size is the size of the shoe.
 * 
 * Your task is to check whether it is possible to pair the shoes you found in such a way that each pair consists of a right and a left shoe of an equal size.
 * 
 * Example:
 * 
 * For:
 * 
 * shoes = [[0, 21], 
 * 			[1, 23], 
 * 			[1, 21], 
 * 			[0, 23]]
 * the output should be true;
 * 
 * For:
 * 
 * shoes = [[0, 21], 
 * 	        [1, 23], 
 *          [1, 21], 
 *          [1, 23]]
 * the output should be false.
 * 
 * Input/Output:
 * [input] 2D integer array shoes
 * Array of shoes. Each shoe is given in the format [type, size], where type is either 0 or 1 for left and right respectively, and size is a positive integer.
 * 
 * Constraints: 2 ≤ shoes.length ≤ 50,  1 ≤ shoes[i][1] ≤ 100.
 * 
 * [output] a boolean value:	true if it is possible to pair the shoes, false otherwise.
 */

using System;
using System.Collections.Generic;
  
public class Kata
{
    // Seguimos la misma lógica que aplicamos en Java pero aquí no nos da ningún error de sintaxis y supera todos los test de CodeWars.
    public bool PairOfShoes(int[][] shoes){
        
        List<int> derechos = new List<int>();
        List<int> izquierdos = new List<int>();

        foreach(int[] shoe in shoes) {
            if(shoe[0] == 0)        izquierdos.Add(shoe[1]);
            else if(shoe[0] == 1)   derechos.Add(shoe[1]);
        }

        if(derechos.Count != izquierdos.Count)    return false;

        derechos.Sort();
        izquierdos.Sort();

        for(int i = 0 ; i < derechos.Count ; i++) {
            if(derechos[i] != izquierdos[i])   return false;
        }
        return true;

    }
}