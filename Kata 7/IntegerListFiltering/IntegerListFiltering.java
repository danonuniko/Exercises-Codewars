/* Kata Level: 7.
 * 
 * In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
 * Example:
 * Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
 * Kata.filterList(List.of(1, 2, "a", "b", 0, 15)) => List.of(1,2,0,15)
 * Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)) => List.of(1,2,231)
 */

import java.util.*;

public class IntegerListFiltering {
	
	// Mi solución. Compila correctamente en el Eclipse pero me salta error en CodeWars.
	public static List<Object> filterList(final List<Object> list) {
		List<Object> lista = new ArrayList<>();
		for(Object objeto : list) {
			if(objeto.getClass().getSimpleName().equals("Integer")) {
				lista.add(objeto);
			}
		}
		return lista;
	}
	
	// Solución de la comunidad.
	public static List<Object> filterList1(final List<Object> list) {
        List<Object> lista = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                lista.add(list.get(i));
            }
        }
        return lista;
    }
	
	public static void main(String[] args) {
		System.out.println(filterList(List.of(1, 2, "a", "b")));
		System.out.println(filterList(List.of(1, 2, "a", "b", 0, 15)));
		System.out.println(filterList(List.of(1, 2, "aasf", "1", "123", 231)));
	}
	
}
