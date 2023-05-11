/*
Kata Level: 5.

Write an algorithm that takes an array and moves all of the zeros to the end, preserving the order of the other elements.

Kata.MoveZeroes(new int[] {1, 2, 0, 1, 0, 1, 0, 3, 0, 1}) => new int[] {1, 2, 1, 1, 3, 1, 0, 0, 0, 0}
*/

import java.util.*;

public class MovingZerosToTheEndArray
{
    // Mi solución en Java. No es la opción más optimizada pero no existe su versión en CodeWars y no puedo obtener soluciones optimizadas de la comunidad. Ajusto la solución creada en C#.
    public static int[] MoveZeroes(int[] arr) {
        List<Integer> result_list = new ArrayList<Integer>();
        for(int number : arr) {
            if(number != 0)	result_list.add(number);
        }
        int[] result = new int[arr.length];
        for(int i = 0 ; i < result_list.size() ; i++) {
            result[i] = result_list.get(i);
        }
        for(int i = result_list.size() ; i < arr.length ; i++) {
            result[i] = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = MoveZeroes(new int[] {1, 2, 0, 3, -2, 0, 0, 3, 2, 1, 0, 9});
		for(int number : result) System.out.println(number + " ");
    }
}