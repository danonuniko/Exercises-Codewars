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

import java.util.*;

enum Foot {LEFT, RIGHT};
record Shoe(Foot foot, int size) { }

public class PairOfShoes {

    public static boolean pairOfShoes(Shoe[] shoes) {
        
        List<Integer> derechos = new ArrayList<>();
        List<Integer> izquierdos = new ArrayList<>();

        for(Shoe shoe : shoes) {
            if(shoe.foot() == Foot.LEFT) izquierdos.add(shoe.size());
            else if(shoe.foot() == Foot.RIGHT) derechos.add(shoe.size());
        }

        if(derechos.size() != izquierdos.size())    return false;

        Collections.sort(derechos);
        Collections.sort(izquierdos);

        for(int i = 0 ; i < derechos.size() ; i++) {
            if(!derechos.get(i).equals(izquierdos.get(i)))   return false;
        }
        return true;

    }

    // Solución de la comunidad 1. Analizar como lo resuelve.
    public static boolean pairOfShoesCommunity(Shoe[] shoes) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for (Shoe shoe: shoes) {
            int value = map.getOrDefault(shoe.size(), 0);
            map.put(shoe.size(), value + (shoe.foot() == Foot.LEFT ? 1 : -1));
        }
        for (var entry: map.entrySet()) {
            if (entry.getValue() != 0)
                return false;
        }
        return true;
    
    }
        
    /*  
    Esta lógica no sirve porque NO comprueba que el número de coincidencias de cada talla coincida. 
    Pueden existir mismo número de zapatos en cada array, mismas tallas, pero no mismo número de repeticiones de cada una de ellas.

    for(int number : izquierdos) {
        if(!derechos.contains(number))      return false;
    }
    for(int number : derechos) {
        if(!izquierdos.contains(number))      return false;
    }
    return true;
    */

}
