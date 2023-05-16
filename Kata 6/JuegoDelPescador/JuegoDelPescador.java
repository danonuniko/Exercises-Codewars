/* Kata Level: 6.
 * 
 * Write a simple parser that will parse and run Deadfish.
 * 
 * Deadfish has 4 commands, each 1 character long:
 * 
 * i increments the value (initially 0)
 * d decrements the value
 * s squares the value
 * o outputs the value into the return array
 * Invalid characters should be ignored.
 * 
 * Deadfish.parse("iiisdoso") =- new int[] {8, 64};
 */

import java.util.*;

public class JuegoDelPescador {

	public static int[] parse(String data) {
        List<Integer> lista = new ArrayList<>();
        int contador = 0;
        for(int i = 0 ; i < data.length() ; i++) {
            if(data.charAt(i) == 'i')
                contador++;
            else if(data.charAt(i) == 'd')
                contador--;
            else if(data.charAt(i) == 's')
                contador *= contador;
            else if(data.charAt(i) == 'o')
                lista.add(contador);
        }
        int[] solucion = new int[lista.size()];
        for(int i = 0 ; i < lista.size() ; i++) 
            solucion[i] = lista.get(i);
        return solucion;
	}
	 
	public static void main(String[] args) {
		
		int[] numeros = parse("iiisdoso");
		for(int numero : numeros)
			System.out.print(numero + " ");

	}

}